package com.example.exampleForMe.repository;

import com.example.exampleForMe.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ToDoRepo extends CrudRepository<ToDoEntity, Long> {
}
