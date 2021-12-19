package com.example.exampleForMe.model;

import com.example.exampleForMe.entity.ToDoEntity;

public class ToDo {
    private Long id;

    private String title;

    private Boolean completed;

    public static ToDo toModel(ToDoEntity toDoEntity){
        ToDo toDo = new ToDo();
        toDo.setId(toDoEntity.getId());
        toDo.setTitle(toDoEntity.getTitle());
        toDo.setCompleted(toDoEntity.getCompleted());
        return toDo;
    }
    public ToDo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
