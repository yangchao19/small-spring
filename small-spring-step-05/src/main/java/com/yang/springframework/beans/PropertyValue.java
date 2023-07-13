package com.yang.springframework.beans;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/10
 * @Copyright：
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
