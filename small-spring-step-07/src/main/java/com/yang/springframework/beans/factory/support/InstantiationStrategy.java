package com.yang.springframework.beans.factory.support;

import com.yang.springframework.beans.BeansException;
import com.yang.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/9
 * @Copyright：
 */
public interface InstantiationStrategy {
    /**
     * 选择对应构造器实例化bean
     * @param beanDefinition bean
     * @param beanName bean 的名字
     * @param ctor 构造器
     * @param args 构造器使用的参数
     * @return 实例化的bean对象
     * @throws BeansException 异常处理
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
