package com.example;

import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.repository.support.RedisRepositoryFactory;
import org.springframework.data.redis.repository.support.RedisRepositoryFactoryBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cuimingqiang on 16/6/1.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
