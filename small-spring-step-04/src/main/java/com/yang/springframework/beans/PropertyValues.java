package com.yang.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/10
 * @Copyright：
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue (PropertyValue value) {
        this.propertyValueList.add(value);
    }

    public PropertyValue[] getPropertyValues () {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue (String propertyName) {
        for (PropertyValue pv: propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
