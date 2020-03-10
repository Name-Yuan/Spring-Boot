package com.Spring_Boot.web;

import com.Spring_Boot.Bean.User;
import com.Spring_Boot.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @Autowired
    UserServiceImp userServiceImp;

    @GetMapping("/user")
    @ResponseBody
    public List<User> findAll(){
        List<User> all = userServiceImp.findAll();
        System.out.println(all.toString());
        return all;

    }
}
