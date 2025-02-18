package com.dffl.study.redis.sub;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RedisMessageSubService implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] pattern) {
        String msg = new String(message.getBody());
        String channel = new String(message.getChannel());
        System.out.println("channel:" + channel + ", msg:" + msg);
    }
}
