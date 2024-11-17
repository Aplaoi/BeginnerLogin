package com.loginsystem.controller;

import com.loginsystem.pojo.User;
import com.loginsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:5173/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/data")
    public ResponseEntity<String> login(@RequestBody User user){
        boolean isMatch= userService.verifyUser(user.getUsername(), user.getPassword());
        if (isMatch){
            return new ResponseEntity<>("登录成功", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("登录失败",HttpStatus.OK);
        }
    }

}
