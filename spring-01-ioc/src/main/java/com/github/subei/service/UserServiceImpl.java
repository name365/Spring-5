package com.github.subei.service;

import com.github.subei.dao.UserDao;
import com.github.subei.dao.UserDaoImpl;
import com.github.subei.dao.UserDaoMysqlImpl;
import com.github.subei.dao.UserDaoSqlserverImpl;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    // 利用set进行动态实现值的注入！！
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
