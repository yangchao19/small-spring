package com.yang.springframework.beans.factory.support;

import com.yang.springframework.beans.BeansException;
import com.yang.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/7
 * @Copyright：
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (null == beanDefinition) {
            throw new BeansException("No bean named'" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {

        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public String[] getBeanDefinitionName() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }

    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }

}
