//package com.jarvisdong.jarvisroom.config;
//
//
//import com.jarvisdong.jarvisroom.thirdparty.redis.RedisObjectSerializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
///**
// * @author Arvin.Cao
// * @version 1.0
// * @time 2017/3/6 下午7:46
// * @Description TODO redis配置
// */
//@Configuration
//public class RedisConfig {
//    @Bean
//    JedisConnectionFactory jedisConnectionFactory() {
//        return new JedisConnectionFactory();
//    }
//    @SuppressWarnings({ "rawtypes", "unchecked" })
//	@Bean
//    public RedisTemplate redisTemplate() {
//        RedisTemplate template = new RedisTemplate();
//        template.setConnectionFactory(jedisConnectionFactory());
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new RedisObjectSerializer());
//        return template;
//    }
//}
