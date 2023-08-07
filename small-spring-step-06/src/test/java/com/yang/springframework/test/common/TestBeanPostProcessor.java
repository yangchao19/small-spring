package com.yang.springframework.test.common;

import com.yang.springframework.beans.BeansException;
import com.yang.springframework.beans.factory.config.BeanPostProcessor;
import com.yang.springframework.test.bean.UserService;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/5
 * @Copyright：
 */
public class TestBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService)bean;
            userService.setLocation("修改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
