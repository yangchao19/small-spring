package com.yang.springframework.beans.factory;

import com.yang.springframework.beans.BeansException;

import java.util.Map;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/5
 * @Copyright：
 */
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 根据类型返回 对应类型的 Bean实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeanOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的 Bean名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
