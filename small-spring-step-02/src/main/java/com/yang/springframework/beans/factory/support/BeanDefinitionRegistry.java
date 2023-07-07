package com.yang.springframework.beans.factory.support;

import com.yang.springframework.beans.factory.config.BeanDefinition;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/7
 * @Copyright：
 */
public interface BeanDefinitionRegistry {

    /**
     * 想注册表中注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
