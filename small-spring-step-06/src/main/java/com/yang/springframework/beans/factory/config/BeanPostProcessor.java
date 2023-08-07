package com.yang.springframework.beans.factory.config;

import com.yang.springframework.beans.BeansException;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/5
 * @Copyright：
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象初始化方法之前执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象初始化方法之后执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
