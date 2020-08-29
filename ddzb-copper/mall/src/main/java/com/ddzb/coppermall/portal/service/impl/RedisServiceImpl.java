package com.ddzb.coppermall.portal.service.impl;


import com.ddzb.coppermall.portal.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisZSetCommands;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * redis操作Service的实现类
 */
@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //================基本方法====================
    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public boolean expire(String key, long expire) {
        return stringRedisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    @Override
    public boolean expireByMinutes(String key, long expire) {
        return stringRedisTemplate.expire(key, expire, TimeUnit.MINUTES);
    }

    @Override
    public boolean expireByHours(String key, long expire) {
        return stringRedisTemplate.expire(key,expire,TimeUnit.HOURS);
    }
    @Override
    public boolean expireByDays(String key, long expire) {
        return stringRedisTemplate.expire(key,expire,TimeUnit.DAYS);
    }

    @Override
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }

    @Override
    public Long increment(String key, long delta) {
        return stringRedisTemplate.opsForValue().increment(key,delta);
    }

    //================zSet====================

    @Override
    public Boolean zSetAdd(String key, String value, double score) {
        return stringRedisTemplate.opsForZSet().add(key,value,score);
    }

    @Override
    public Long zSetAdd(String key, Set<ZSetOperations.TypedTuple<String>> tuples) {
        return stringRedisTemplate.opsForZSet().add(key,tuples);
    }

    @Override
    public Double incrementScore(String key, String value, double delta) {
        return stringRedisTemplate.opsForZSet().incrementScore(key, value, delta);
    }

    @Override
    public Long remove(String key, Object... values) {
        return stringRedisTemplate.opsForZSet().remove(key, values);
    }

    @Override
    public Long removeRange(String key, long start, long end) {
        return stringRedisTemplate.opsForZSet().removeRange(key, start, end);
    }

    @Override
    public Long removeRangeByScore(String key, double min, double max) {
        return stringRedisTemplate.opsForZSet().removeRangeByScore(key, min, max);
    }

    @Override
    public Set<String> range(String key, long start, long end) {
        return stringRedisTemplate.opsForZSet().range(key, start, end);
    }

    @Override
    public Set<ZSetOperations.TypedTuple<String>> rangeWithScores(String key, long start, long end) {
        return stringRedisTemplate.opsForZSet().rangeWithScores(key, start, end);
    }

    @Override
    public Set<String> rangeByScore(String key, double min, double max) {
        return stringRedisTemplate.opsForZSet().rangeByScore(key, min, max);
    }

    @Override
    public Set<ZSetOperations.TypedTuple<String>> rangeByScoreWithScores(String key, double min, double max) {
        return stringRedisTemplate.opsForZSet().rangeByScoreWithScores(key, min, max);
    }

    @Override
    public Set<String> rangeByScore(String key, double min, double max, long offset, long count) {
        return stringRedisTemplate.opsForZSet().rangeByScore(key, min, max, offset, count);
    }

    @Override
    public Set<ZSetOperations.TypedTuple<String>> rangeByScoreWithScores(String key, double min, double max, long offset, long count) {
        return stringRedisTemplate.opsForZSet().rangeByScoreWithScores(key, min, max, offset, count);
    }

    @Override
    public Set<String> rangeByLex(String key, RedisZSetCommands.Range range) {
        return stringRedisTemplate.opsForZSet().rangeByLex(key, range);
    }

    @Override
    public Set<String> rangeByLex(String key, RedisZSetCommands.Range range, RedisZSetCommands.Limit limit) {
        return stringRedisTemplate.opsForZSet().rangeByLex(key, range, limit);
    }

    @Override
    public Set<String> reverseRangeByScore(String key, double min, double max) {
        return stringRedisTemplate.opsForZSet().reverseRangeByScore(key, min, max);
    }

    @Override
    public Set<ZSetOperations.TypedTuple<String>> reverseRangeByScoreWithScores(String key, double min, double max) {
        return stringRedisTemplate.opsForZSet().reverseRangeByScoreWithScores(key, min, max);
    }

    @Override
    public Set<String> reverseRangeByScore(String key, double min, double max, long offset, long count) {
        return stringRedisTemplate.opsForZSet().reverseRangeByScore(key, min, max, offset, count);
    }

    @Override
    public Set<ZSetOperations.TypedTuple<String>> reverseRangeByScoreWithScores(String key, double min, double max, long offset, long count) {
        return stringRedisTemplate.opsForZSet().reverseRangeByScoreWithScores(key, min, max, offset, count);
    }

    @Override
    public Long rank(String key, Object o) {
        return stringRedisTemplate.opsForZSet().rank(key,o);
    }

    @Override
    public Double score(String key, Object o) {
        return stringRedisTemplate.opsForZSet().score(key, o);
    }

    @Override
    public Long count(String key, double min, double max) {
        return stringRedisTemplate.opsForZSet().count(key, min, max);
    }

    @Override
    public Long zCard(String key) {
        return stringRedisTemplate.opsForZSet().zCard(key);
    }


}
