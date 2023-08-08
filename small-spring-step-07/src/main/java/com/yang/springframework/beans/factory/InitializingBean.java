package com.yang.springframework.beans.factory;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/8
 * @Copyright：
 */
public interface InitializingBean {

    /**
     * 初始化方法
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
