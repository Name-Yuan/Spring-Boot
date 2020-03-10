package com.Spring_Boot.service.imp;

import com.Spring_Boot.Bean.User;
import com.Spring_Boot.dao.UserMapper;
import com.Spring_Boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
