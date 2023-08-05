package com.yang.springframework.beans.factory.support;

import com.yang.springframework.core.io.DefaultResourceLoader;
import com.yang.springframework.core.io.ResourceLoader;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/13
 * @Copyright：
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{
    /**
     * 用来注册Bean
     */
    private final BeanDefinitionRegistry registry;

    /**
     * 用来读取资源
     */
    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry,new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
