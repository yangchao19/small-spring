package com.yang.springframework.beans.factory;

import com.yang.springframework.beans.BeansException;

/**
 * @description:
 * @author：杨超
 * @date: 2023/8/8
 * @Copyright：
 */
public interface DisposableBean {

    /**
     * 销毁方法
     * @throws Exception
     */
    void destroy() throws Exception;
}
