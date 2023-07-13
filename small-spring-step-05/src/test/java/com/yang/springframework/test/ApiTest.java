package com.yang.springframework.test;

import com.yang.springframework.beans.PropertyValue;
import com.yang.springframework.beans.PropertyValues;
import com.yang.springframework.beans.factory.config.BeanDefinition;
import com.yang.springframework.beans.factory.config.BeanReference;
import com.yang.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.yang.springframework.test.bean.UserDao;
import com.yang.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/12
 * @Copyright：
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 注册bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册 UserDao
        beanFactory.registryBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 设置userService 属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("userId", "100001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 注册userService
        beanFactory.registryBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));

        UserService userService = (UserService)beanFactory.getBean("userService");
        String userInfo = userService.queryUserInfo();
        System.out.println(userInfo);
    }
}
