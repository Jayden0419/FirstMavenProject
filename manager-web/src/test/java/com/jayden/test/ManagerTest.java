package com.jayden.test;

import com.jayden.mapper.UsersMapper;
import com.jayden.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Jayden Lee
 * @Date: 2021/12/23 9:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        /*Users users=new Users();
        users.setUsername("Kawhi");
        users.setUserage(30);
        this.usersMapper.insertUser(users);*/
    }
}
