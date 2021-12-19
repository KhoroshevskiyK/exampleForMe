package com.example.exampleForMe.repository;

import com.example.exampleForMe.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    public UserEntity findByUsername(String username);
}
