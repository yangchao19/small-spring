package com.yang.springframework.util;

/**
 * @description: 获取类加载器工具类
 * @author：杨超
 * @date: 2023/7/11
 * @Copyright：
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader loader = null;

        try {
            loader = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (loader == null) {
            loader = ClassUtils.class.getClassLoader();
        }
        return loader;
    }
}
