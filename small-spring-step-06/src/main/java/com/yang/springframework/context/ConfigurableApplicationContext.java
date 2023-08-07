package com.yang.springframework.context;

import com.yang.springframework.beans.BeansException;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/5
 * @Copyright：
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
