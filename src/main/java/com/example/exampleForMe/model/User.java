package com.example.exampleForMe.model;

import com.example.exampleForMe.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class User {
    private Long id;
    private String username;
    private List<ToDo> toDoList;

    public List<ToDo> getToDoList() {
        return toDoList;
    }

    public void setToDoList(List<ToDo> toDoList) {
        this.toDoList = toDoList;
    }

    public static User toModel(UserEntity userEntity){
        User model = new User();
        model.setId(userEntity.getId());
        model.setUsername(userEntity.getUsername());
        model.setToDoList(userEntity.getToDoEntityList().stream().map(ToDo::toModel).collect(Collectors.toList()));
        return model;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
