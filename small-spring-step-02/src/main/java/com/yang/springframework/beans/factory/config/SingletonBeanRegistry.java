package com.yang.springframework.beans.factory.config;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/7
 * @Copyright：
 */
public interface SingletonBeanRegistry {
    /**
     * 获取单例对象
     * @param beanName bean名字
     * @return 单例对象
     */
    Object getSingleton(String beanName);
}
