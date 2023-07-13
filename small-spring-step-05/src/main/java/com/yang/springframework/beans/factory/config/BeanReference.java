package com.yang.springframework.beans.factory.config;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/10
 * @Copyright：
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
