package com.yang.springframework.test.bean;

import com.yang.springframework.beans.factory.DisposableBean;
import com.yang.springframework.beans.factory.InitializingBean;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/12
 * @Copyright：
 */
public class UserService implements InitializingBean, DisposableBean {

    private String userId;
    private String company;
    private String location;
    private UserDao userDao;



    public String queryUserInfo() {
        return userDao.queryUserName(userId) + " " + company + " " + location;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("执行UserService销毁方法，接口实现");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行UserService初始化方法，接口实现");
    }
}
