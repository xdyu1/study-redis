package com.dffl.study.redis.pub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisMessagePubService {
    @Autowired
    RedisTemplate redisTemplate;

    public void publish(String channel, String message) {
        redisTemplate.convertAndSend(channel, message);
        System.out.println("Published message: " + message + " to channel: " + channel);
    }
}
