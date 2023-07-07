package com.yang.springframework.beans;

/**
 * @description: 定义bean异常
 * @author：杨超
 * @date: 2023/7/7
 * @Copyright：
 */
public class BeansException extends RuntimeException{
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
