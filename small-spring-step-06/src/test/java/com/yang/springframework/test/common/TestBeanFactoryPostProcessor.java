package com.yang.springframework.test.common;

import com.yang.springframework.beans.BeansException;
import com.yang.springframework.beans.PropertyValue;
import com.yang.springframework.beans.PropertyValues;
import com.yang.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.yang.springframework.beans.factory.config.BeanDefinition;
import com.yang.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/5
 * @Copyright：
 */
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "修改为：字节跳动"));
    }
}
