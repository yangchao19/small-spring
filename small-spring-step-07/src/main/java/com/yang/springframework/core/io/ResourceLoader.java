package com.yang.springframework.core.io;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/11
 * @Copyright：
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    /**
     * 获取资源
     * @param location 资源位置
     * @return
     */
    Resource getResource(String location);

}
