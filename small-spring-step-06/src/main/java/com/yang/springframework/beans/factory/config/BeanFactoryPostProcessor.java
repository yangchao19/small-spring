package com.yang.springframework.beans.factory.config;

import com.yang.springframework.beans.BeansException;
import com.yang.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/5
 * @Copyright：
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean之前，提供修改 BeanDefinition 属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
