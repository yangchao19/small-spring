package com.yang.springframework.beans.factory.support;

import com.yang.springframework.beans.BeansException;
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

    /**
     * 根据 bean名称获取 beanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 查看是否已经注册过对应名称的 beanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 获取bean名称列表
     * @return 返回注册表所有的bean名称
     */
    String[] getBeanDefinitionNames();
}
