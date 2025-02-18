package com.dffl.study.redis.controller;

import com.dffl.study.redis.pub.RedisMessagePubService;
import com.dffl.study.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    RedisService redisService;
    @Autowired
    RedisMessagePubService redisMessagePubService;

    @PostMapping(value = "/redis/get")
    public String get(@RequestParam(value = "key") String key) {
        return redisService.get(key);
    }

    @PostMapping(value = "/redis/set")
    public void set(@RequestParam(value = "key") String key,@RequestParam(value = "value") String value) {
        redisService.set(key, value);
    }

    @PostMapping(value = "/redis/pub")
    public void pub(@RequestParam(value = "channel") String channel,@RequestParam(value = "message") String message) {
        redisMessagePubService.publish(channel, message);
    }
}
