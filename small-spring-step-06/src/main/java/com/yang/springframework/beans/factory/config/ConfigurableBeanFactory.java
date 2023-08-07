package com.yang.springframework.beans.factory.config;

import com.yang.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/5
 * @Copyright：
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";

    /**
     * 添加自定义的 Bean后置处理器
     * @param beanPostProcessor
     */
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
