package com.jayden.mapper;

import com.jayden.pojo.Users;

import java.util.List;

/**
 * @Author: Jayden Lee
 * @Date: 2021/12/22 15:57
 */
public interface UsersMapper {
    void insertUser(Users users);

    List<Users> selectUserAll();
}
