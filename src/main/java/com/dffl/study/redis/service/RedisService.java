package com.dffl.study.redis.service;

public interface RedisService {

    void set(String key, String value);

    void set(String key, String value, int expire);

    String get(String key);
}
