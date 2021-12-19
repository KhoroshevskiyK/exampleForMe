package com.example.exampleForMe.controller;

import com.example.exampleForMe.entity.ToDoEntity;
import com.example.exampleForMe.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    @Autowired
   private ToDoService toDoService;
    @PostMapping
    public ResponseEntity createToDo(@PathVariable ToDoEntity toDoEntity,
                                     @RequestParam Long userId){
        try{
            return ResponseEntity.ok(toDoService.create(toDoEntity, userId));
        }
        catch (Exception ex){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PutMapping
    public ResponseEntity createToDo(@RequestParam Long id){
        try{
            return ResponseEntity.ok(toDoService.completed(id));
        }
        catch (Exception ex){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
