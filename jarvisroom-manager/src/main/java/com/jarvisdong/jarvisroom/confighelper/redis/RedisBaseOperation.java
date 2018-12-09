package com.jarvisdong.jarvisroom.confighelper.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Arvin.Cao
 * @ClassName RedisBaseOperation
 * @Description redis基本操作类
 * @date 15/12/27
 */
@Component
public class RedisBaseOperation<T> {
    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate<String, T> redisTemplate;

    @Autowired
    private RedisTemplate<String, String> redisTemplateCode;

    public void saveOrUpdate(String key, T value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public void saveOrUpdate(String key, T value, long expireTime, TimeUnit timeUnit) {
        ValueOperations<String, T> operations = redisTemplate.opsForValue();
        operations.set(key, value, expireTime, timeUnit);
    }

    public void put(String key, int hashKey, Object t, long timeout, TimeUnit timeUnit) {
        redisTemplate.opsForHash().put(key, hashKey, t);
        redisTemplate.expire(key, timeout, timeUnit);
    }

    public void put(String key, int hashKey, T t) {
        redisTemplate.opsForHash().put(key, hashKey, t);
    }

    public void delete(String key) {
        redisTemplate.delete(key);
    }

    public T get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @SuppressWarnings("unchecked")
    public T get(String key, int hashKey) {
        return (T) redisTemplate.opsForHash().get(key, hashKey);
    }

    /**
     * -------------------------------------
     */
    public String getCode(String key) {
        return redisTemplateCode.opsForValue().get(key);
    }

    public void putCode(String key, String value) {
        redisTemplateCode.opsForValue().set(key, value, 10, TimeUnit.MINUTES);
    }


}
