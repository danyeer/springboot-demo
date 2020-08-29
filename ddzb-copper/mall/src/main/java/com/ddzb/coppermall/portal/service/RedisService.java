package com.ddzb.coppermall.portal.service;

import org.springframework.data.redis.connection.RedisZSetCommands;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.Set;

/**
 * redis操作Service,
 * 对象和数组都以json形式进行存储
 */
public interface RedisService {
    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key, long expire);

    boolean expireByMinutes(String key, long expire);

    boolean expireByHours(String key, long expire);

    boolean expireByDays(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param delta 自增步长
     */
    Long increment(String key, long delta);

    //单个新增or更新
    Boolean zSetAdd(String key, String value, double score);
    //批量新增or更新
    Long zSetAdd(String key, Set<ZSetOperations.TypedTuple<String>> tuples);
    //使用加法操作分数
    Double incrementScore(String key, String value, double delta);

    //通过key/value删除
    Long remove(String key, Object... values);

    //通过排名区间删除
    Long removeRange(String key, long start, long end);

    //通过分数区间删除
    Long removeRangeByScore(String key, double min, double max);

    Set<String> range(String key, long start, long end);

    //通过排名区间获取列表值和分数集合
    Set<ZSetOperations.TypedTuple<String>> rangeWithScores(String key, long start, long end);

    //通过分数区间获取列表值集合
    Set<String> rangeByScore(String key, double min, double max);

    //通过分数区间获取列表值和分数集合
    Set<ZSetOperations.TypedTuple<String>> rangeByScoreWithScores(String key, double min, double max);

    Set<String> rangeByScore(String key, double min, double max, long offset, long count);

    Set<ZSetOperations.TypedTuple<String>> rangeByScoreWithScores(String key, double min, double max, long offset, long count);

    //通过Range对象删选再获取集合排行
    Set<String> rangeByLex(String key, RedisZSetCommands.Range range);

    //通过Range对象删选再获取limit数量的集合排行
    Set<String> rangeByLex(String key, RedisZSetCommands.Range range, RedisZSetCommands.Limit limit);

    //使用：与rangeByScore调用方法一样，其中有序集成员按分数值递减(从大到小)顺序排列
    Set<String> reverseRangeByScore(String key, double min, double max);

    //使用：与rangeByScoreWithScores调用方法一样，其中有序集成员按分数值递减(从大到小)顺序排列
    Set<ZSetOperations.TypedTuple<String>> reverseRangeByScoreWithScores(String key, double min, double max);

    //使用：与rangeByScore调用方法一样，其中有序集成员按分数值递减(从大到小)顺序排列
    Set<String> reverseRangeByScore(String key, double min, double max, long offset, long count);

    //使用：与rangeByScoreWithScores调用方法一样，其中有序集成员按分数值递减(从大到小)顺序排列
    Set<ZSetOperations.TypedTuple<String>> reverseRangeByScoreWithScores(String key, double min, double max, long offset, long count);


    //获取指定成员的排名
    Long rank(String key, Object o);
    //获取指定成员的分数
    Double score(String key, Object o);

    //统计分数区间的数量
    Long count(String key, double min, double max);
    //统计集合基数(获取有序集合的成员数)
    Long zCard(String key);




}
