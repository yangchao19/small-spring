package com.yang.springframework;

import com.yang.springframework.bean.UserService;
import com.yang.springframwork.BeanDefinition;
import com.yang.springframwork.BeanFactory;
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

        //1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.注入Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //3.获取Bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
