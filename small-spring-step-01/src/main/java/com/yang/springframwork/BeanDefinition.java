package com.yang.springframwork;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/7
 * @Copyright：
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
