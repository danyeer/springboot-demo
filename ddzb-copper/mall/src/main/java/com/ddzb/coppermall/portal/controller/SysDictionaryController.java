package com.ddzb.coppermall.portal.controller;

import cn.hutool.json.JSONObject;

import com.ddzb.coppermall.common.api.CommonPage;
import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.model.SysDictionary;
import com.ddzb.coppermall.portal.dto.SysDictionaryParam;
import com.ddzb.coppermall.portal.dto.SysDictionaryQuery2Param;
import com.ddzb.coppermall.portal.dto.SysDictionaryQueryParam;
import com.ddzb.coppermall.portal.service.SysDictionaryService;
import com.ddzb.coppermall.portal.validator.validatorGroups.DeleteDictionaryDelete;
import com.ddzb.coppermall.portal.validator.validatorGroups.InsertDictionaryCreate;
import com.ddzb.coppermall.portal.validator.validatorGroups.SelectDictionaryUpdateDetail;
import com.ddzb.coppermall.portal.validator.validatorGroups.UpdateDictionaryUpdate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/dictionary")
@Api(tags = "02资源管理-字典", description = "资源管理-SysDictionaryController")
public class SysDictionaryController {

    @Autowired
    private SysDictionaryService dictionaryService;

    @ResponseBody
    @ApiOperation("字典管理-列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "类型名称", required = true, paramType = "query", dataType = "String ", defaultValue = ""),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = true, paramType = "query", dataType = "Integer ", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "每页数量", required = true, paramType = "query", dataType = "Integer ", defaultValue = "10")
    })
    @RequestMapping(value = "/dictionaryList", method = RequestMethod.POST)
    public CommonResult<CommonPage<SysDictionary>> dictionaryList(@RequestBody SysDictionaryQueryParam dictionaryParam) {
        List<SysDictionary> dictionaries = dictionaryService.querySysDictionaryList(dictionaryParam, dictionaryParam.getPageNum(), dictionaryParam.getPageSize());
        return CommonResult.success(CommonPage.restPage(dictionaries));
    }

    @ResponseBody
    @ApiOperation("字典管理-编码、名称验证")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键id", required = true, paramType = "query", dataType = "Integer ", defaultValue = "1"),
            @ApiImplicitParam(name = "code", value = "编码", required = true, paramType = "query", dataType = "String ", defaultValue = ""),
            @ApiImplicitParam(name = "name", value = "类型名称", required = true, paramType = "query", dataType = "String ", defaultValue = "")
    })
    @RequestMapping(value = "/codeNameVerification", method = RequestMethod.POST)
    public CommonResult codeNameVerification(@RequestBody @Validated(DeleteDictionaryDelete.class) SysDictionaryParam dictionaryParam){
        Map<String, String> resultMap = dictionaryService.codeNameVerification(dictionaryParam);
        if (resultMap != null && !"".equals(resultMap)) {
            if (resultMap.get("success") != null && !"".equals(resultMap.get("success"))) {
                return CommonResult.success();
            }
            return CommonResult.failed(resultMap.get("error"));
        }
        return CommonResult.failed();
    }

    @ResponseBody
    @ApiOperation("字典管理-创建")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "code", value = "编码", required = true, paramType = "query", dataType = "String ", defaultValue = ""),
            @ApiImplicitParam(name = "name", value = "类型名称", required = true, paramType = "query", dataType = "String ", defaultValue = ""),
            @ApiImplicitParam(name = "icon", value = "图标", required = true, paramType = "query", dataType = "String ", defaultValue = ""),
            @ApiImplicitParam(name = "note", value = "备注", required = true, paramType = "query", dataType = "String ", defaultValue = "")
    })
    @RequestMapping(value = "/dictionaryCreate", method = RequestMethod.POST)
    public CommonResult dictionaryCreate(@RequestBody @Validated(InsertDictionaryCreate.class) SysDictionaryParam dictionaryParam) {
        if (dictionaryService.saveSysDictionary(dictionaryParam)) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    @ResponseBody
    @ApiOperation("字典管理-修改页面详情数据查询")
    @ApiImplicitParam(name = "id", value = "主键id", required = true, paramType = "query", dataType = "Integer ", defaultValue = "0")
    @RequestMapping(value = "/dictionaryUpdateDetail", method = RequestMethod.POST)
    public CommonResult<SysDictionary> dictionaryUpdateDetail(@RequestBody @Validated(SelectDictionaryUpdateDetail.class) SysDictionaryParam dictionaryParam) {
        SysDictionary dictionary = dictionaryService.querySysDictionaryById(dictionaryParam);
        return CommonResult.success(dictionary);
    }

    @ResponseBody
    @ApiOperation("字典管理-修改")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键id", required = true, paramType = "query", dataType = "Integer ", defaultValue = "1"),
            @ApiImplicitParam(name = "code", value = "编码", required = true, paramType = "query", dataType = "String ", defaultValue = ""),
            @ApiImplicitParam(name = "name", value = "类型名称", required = true, paramType = "query", dataType = "String ", defaultValue = ""),
            @ApiImplicitParam(name = "icon", value = "图标", required = true, paramType = "query", dataType = "String ", defaultValue = ""),
            @ApiImplicitParam(name = "note", value = "备注", required = true, paramType = "query", dataType = "String ", defaultValue = "")
    })
    @RequestMapping(value = "/dictionaryUpdate", method = RequestMethod.POST)
    public CommonResult dictionaryUpdate(@RequestBody @Validated(UpdateDictionaryUpdate.class) SysDictionaryParam dictionaryParam) {
        if (dictionaryService.updateSysDictionary(dictionaryParam)) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    @ResponseBody
    @ApiOperation("字典管理-删除")
    @ApiImplicitParam(name = "id", value = "主键id", required = true, paramType = "body", dataType = "Integer", defaultValue = "0")
    @RequestMapping(value = "/dictionaryDelete", method = RequestMethod.POST)
    public CommonResult dictionaryDelete(@RequestBody @Validated(DeleteDictionaryDelete.class) SysDictionaryParam dictionaryParam) {
        Map<String, String> resultMap = dictionaryService.deleteSysDictionary(dictionaryParam);
        if (resultMap != null && !"".equals(resultMap)) {
            if (resultMap.get("success") != null && !"".equals(resultMap.get("success"))) {
                return CommonResult.success();
            }
            return CommonResult.failed(resultMap.get("error"));
        }
        return CommonResult.failed();
    }


    @ResponseBody
    @ApiOperation("字典管理-获取所有父节点")
    @RequestMapping(value = "/dictionaryQueryParent", method = RequestMethod.GET)
    public CommonResult<List<SysDictionary>> dictionaryQueryParent() {
        List<SysDictionary> sysDictionaries = dictionaryService.dictionaryQueryParent();
        return CommonResult.success(sysDictionaries);
    }

    @ResponseBody
    @ApiOperation("字典管理-获取子节点根据父节点")
    @RequestMapping(value = "/getDictionaryByParentCode", method = RequestMethod.GET)
    public CommonResult<List<SysDictionary>> getDictionaryByParentCode(SysDictionaryQuery2Param param) {
        List<SysDictionary> sysDictionaries = dictionaryService.queryDictionaryByParentCode(param);
        return CommonResult.success(sysDictionaries);
    }



}
