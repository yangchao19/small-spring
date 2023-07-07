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
}
