package com.example.exampleForMe.services;

import com.example.exampleForMe.entity.UserEntity;
import com.example.exampleForMe.exception.UserAlreadyExistException;
import com.example.exampleForMe.exception.UserNotFoundException;
import com.example.exampleForMe.model.User;
import com.example.exampleForMe.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExistException {
        if (userRepo.findByUsername(user.getUsername()) != null) {
            throw new UserAlreadyExistException("Пользователь с таким именем существует");
        }
       return userRepo.save(user);
    }

    public User getOne(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if (user == null){
            throw new UserNotFoundException("Пользователь не найден");
        }
        return User.toModel(user);
    }
    public String delete(Long id){
        userRepo.deleteById(id);
        return "Пользователь удален";
    }
}
