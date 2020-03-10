package com.Spring_Boot.service;

import com.Spring_Boot.Bean.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
}
