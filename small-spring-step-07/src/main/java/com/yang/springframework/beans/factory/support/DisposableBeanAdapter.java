package com.yang.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.yang.springframework.beans.BeansException;
import com.yang.springframework.beans.factory.DisposableBean;
import com.yang.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/8
 * @Copyright：
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;
    private final String beanName;
    private  String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        // 1. 如果使用接口的形式实现destroy方法
        if (bean instanceof DisposableBean) {
            ((DisposableBean)bean).destroy();
        }

        // 2. 如果是在配置文件中指定destroy方法
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean)) {
            Method method = bean.getClass().getMethod(destroyMethodName);
            if (null == method) {
                throw new BeansException("Could not find an init method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            method.invoke(bean);
        }
    }
}
