package com.jayden.service.impl;

import com.jayden.mapper.UsersMapper;
import com.jayden.pojo.Users;
import com.jayden.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Jayden Lee
 * @Date: 2021/12/23 12:51
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
