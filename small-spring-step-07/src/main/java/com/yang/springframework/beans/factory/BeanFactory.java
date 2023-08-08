package com.yang.springframework.beans.factory;

import com.yang.springframework.beans.BeansException;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/7
 * @Copyright：
 */
public interface BeanFactory {
    /**
     * 获取bean对象
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;

    /**
     * 根据入参，获取bean对象
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;

    /**
     * 获取对应 名称和类型的bean实例对象
     * @param name
     * @param requiredClazz
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredClazz) throws BeansException;
}
