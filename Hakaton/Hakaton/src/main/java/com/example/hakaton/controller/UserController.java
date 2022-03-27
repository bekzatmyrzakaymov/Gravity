package com.example.hakaton.controller;

import com.example.hakaton.entity.StudentEntity;
import com.example.hakaton.entity.TeachEntity;
import com.example.hakaton.model.User;
import com.example.hakaton.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class UserController {
    final UserService userService;

    @GetMapping("/getStudent")
    public StudentEntity getStudentById(@RequestParam Long id){
        return userService.getStudent(id);
    }

    @GetMapping("/getTeach")
    public TeachEntity getTeachById(@RequestParam Long id){
        return userService.getTeach(id);
    }

    @PostMapping("/login")
    public Boolean LogIn(@RequestBody User user){
        return userService.check_user(user);
    }

    @PostMapping("/teach/register")
    public Boolean RegisterTeach(@RequestBody TeachEntity teach){
        return userService.create_teach(teach);
    }

    @PostMapping("/create/student")
    public Boolean create_student(@RequestBody StudentEntity studentEntity){
        return userService.create_student(studentEntity);
    }



}
