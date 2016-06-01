package com.example;

import org.springframework.data.redis.core.RedisHash;

/**
 * Created by cuimingqiang on 16/6/1.
 */
@RedisHash("user")
public class User {
    public Long id;
    public String name;
}
