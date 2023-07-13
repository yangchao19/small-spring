package com.yang.springframework.test.bean;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/12
 * @Copyright：
 */
public class UserService {

    private String userId;

    private UserDao userDao;


    public String queryUserInfo() {
        return userDao.queryUserName(userId);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
