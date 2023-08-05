package com.yang.springframework.beans.factory.support;

import com.yang.springframework.beans.BeansException;
import com.yang.springframework.core.io.Resource;
import com.yang.springframework.core.io.ResourceLoader;

/**
 * @description: 读取定义的 Bean 的接口
 * @author：杨超
 * @date: 2023/7/13
 * @Copyright：
 */
public interface BeanDefinitionReader {
    /**
     * 获取 Bean定义注册器
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 获取资源加载器
     * @return
     */
    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
