package com.ddzb.coppermall.portal.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.ddzb.coppermall.mapper.SysDictionaryMapper;
import com.ddzb.coppermall.model.SysDictionary;
import com.ddzb.coppermall.model.SysDictionaryExample;
import com.ddzb.coppermall.portal.dao.SysDictionaryDao;
import com.ddzb.coppermall.portal.dto.SysDictionaryParam;
import com.ddzb.coppermall.portal.dto.SysDictionaryQuery2Param;
import com.ddzb.coppermall.portal.dto.SysDictionaryQueryParam;
import com.ddzb.coppermall.portal.service.SysDictionaryService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysDictionaryServiceImpl implements SysDictionaryService {

    @Autowired
    private SysDictionaryMapper dictionaryMapper;

    @Autowired
    private SysDictionaryDao sysDictionaryDao;

    @Override
    public List<SysDictionary> querySysDictionaryList(SysDictionaryQueryParam dictionaryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SysDictionaryExample example = new SysDictionaryExample();
        example.setOrderByClause("create_time DESC");
        SysDictionaryExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(dictionaryParam.getName())) {
            criteria.andNameLike("%" + dictionaryParam.getName() + "%");
        }
        if (!StringUtils.isEmpty(dictionaryParam.getParentCode())) {
            criteria.andCodeLike(dictionaryParam.getParentCode()+"%");
            criteria.andCodeNotEqualTo(dictionaryParam.getParentCode());
        }
        criteria.andIsFlagEqualTo(1);

        return dictionaryMapper.selectByExample(example);
    }

    @Override
    public boolean saveSysDictionary(SysDictionaryParam dictionaryParam) {
        SysDictionary dictionary = new SysDictionary();
        BeanUtil.copyProperties(dictionaryParam, dictionary);
        dictionary.setCreateTime(new Date());
        dictionary.setIsFlag(1);
        if (dictionaryMapper.insertSelective(dictionary) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateSysDictionary(SysDictionaryParam dictionaryParam) {
        SysDictionary dictionary = new SysDictionary();
        BeanUtil.copyProperties(dictionaryParam, dictionary);
        if (dictionaryMapper.updateByPrimaryKeySelective(dictionary) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Map<String, String> deleteSysDictionary(SysDictionaryParam dictionaryParam) {
        Map<String, String> result = new HashMap<>();
        SysDictionary dictionary = dictionaryMapper.selectByPrimaryKey(dictionaryParam.getId());
        if (dictionary != null && !"".equals(dictionary)) {
            if (dictionaryMapper.deleteByPrimaryKey(dictionary.getId()) > 0) {
                result.put("success", "成功");
                return result;
            }
            result.put("error", "删除失败");
            return result;
        }
        result.put("error", "无消息类型");
        return result;
    }

    @Override
    public SysDictionary querySysDictionaryById(SysDictionaryParam dictionaryParam) {
        return dictionaryMapper.selectByPrimaryKey(dictionaryParam.getId());
    }

    @Override
    public Map<String, String> codeNameVerification(SysDictionaryParam dictionaryParam) {
        Map<String, String> result = new HashMap<>();
        if (StringUtils.isEmpty(dictionaryParam.getCode()) && StringUtils.isEmpty(dictionaryParam.getName())) {
            result.put("error", "参数异常");
            return result;
        }
        if (!StringUtils.isEmpty(dictionaryParam.getCode())) {
            SysDictionaryExample example = new SysDictionaryExample();
            SysDictionaryExample.Criteria criteria = example.createCriteria();
//            criteria.andCodeLike(dictionaryParam.getParentCode()+"%");
            criteria.andIsFlagEqualTo(1);
            criteria.andCodeEqualTo(dictionaryParam.getCode());
            if (dictionaryParam.getId() > 0) {
                criteria.andIdNotEqualTo(dictionaryParam.getId());
            }
            if (dictionaryMapper.countByExample(example) != 0) {
                result.put("error", "编码已存在");
                return result;
            }
        }
        if (!StringUtils.isEmpty(dictionaryParam.getName())) {
            SysDictionaryExample example = new SysDictionaryExample();
            SysDictionaryExample.Criteria criteria = example.createCriteria();
            criteria.andIsFlagEqualTo(1);
            criteria.andCodeLike(dictionaryParam.getCode().substring(0,2)+"%");
            criteria.andNameEqualTo(dictionaryParam.getName());
            if (dictionaryParam.getId() > 0) {
                criteria.andIdNotEqualTo(dictionaryParam.getId());
            }
            if (dictionaryMapper.countByExample(example) != 0) {
                result.put("error", "名称已存在");
                return result;
            }

        }
        result.put("success", "成功");
        return result;
    }

    @Override
    public List<SysDictionary> dictionaryQueryParent() {
        return sysDictionaryDao.selectDictionaryByParent();
    }

    @Override
    public List<SysDictionary> queryDictionaryByParentCode(SysDictionaryQuery2Param param) {
        SysDictionaryExample example = new SysDictionaryExample();
        example.setOrderByClause("code ASC");
        SysDictionaryExample.Criteria criteria = example.createCriteria();
        criteria.andCodeLike(param.getParentCode()+"%");
        criteria.andIsFlagEqualTo(1);
        criteria.andCodeNotEqualTo(param.getParentCode());
        return dictionaryMapper.selectByExample(example);
    }
}
