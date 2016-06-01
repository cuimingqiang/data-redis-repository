package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by cuimingqiang on 16/6/1.
 */
@RestController
@RequestMapping("/")
public class UserController {

//    @Autowired
//    RedisTemplate redisTemplate;

    @Autowired
    UserRepository repository;

    @RequestMapping(value = "/login/{name}",method = RequestMethod.GET)
    public void login(@PathVariable("name")String name){
        User user = new User();
        user.id = new Random().nextLong();
        user.name = name;
        repository.save(user);
//        redisTemplate.opsForValue().set(user.id,user);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Object all(){

        return repository.findAll();
    }
}
