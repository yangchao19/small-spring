package com.yang.springframework.beans.test;

import com.yang.springframework.beans.factory.config.BeanDefinition;
import com.yang.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.yang.springframework.beans.test.bean.UserService;
import org.junit.Test;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/7
 * @Copyright：
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {

        //初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registryBeanDefinition("userService", beanDefinition);

        //获取bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");

        UserService userService1 = (UserService)beanFactory.getSingleton("userService");
        UserService userService2 = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        userService1.queryUserInfo();
        System.out.println(userService == userService1 && userService1 == userService2);
    }
}
