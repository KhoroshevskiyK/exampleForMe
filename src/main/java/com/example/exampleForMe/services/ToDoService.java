package com.example.exampleForMe.services;

import com.example.exampleForMe.entity.ToDoEntity;
import com.example.exampleForMe.entity.UserEntity;
import com.example.exampleForMe.model.ToDo;
import com.example.exampleForMe.repository.ToDoRepo;
import com.example.exampleForMe.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepo toDoRepo;
    @Autowired
    private UserRepo userRepo;

    public ToDo create(ToDoEntity toDoEntity, Long user_id) {
        UserEntity user = userRepo.findById(user_id).get();
        toDoEntity.setUser(user);
        return ToDo.toModel(toDoRepo.save(toDoEntity));
    }

    public ToDo completed(Long id) {
        ToDoEntity toDoEntity = toDoRepo.findById(id).get();
        toDoEntity.setCompleted(!toDoEntity.getCompleted());
        return ToDo.toModel(toDoRepo.save(toDoEntity));
    }
}
