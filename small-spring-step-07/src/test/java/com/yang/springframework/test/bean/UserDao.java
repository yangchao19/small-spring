package com.yang.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/12
 * @Copyright：
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

    public void initMethod() {
        System.out.println("执行UserDao的初试化方法");
        hashMap.put("100001", "羊");
        hashMap.put("100002", "羊羊");
        hashMap.put("100003", "羊羊羊");
    }

    public void destroyMethod() {
        System.out.println("执行UserDao的销毁方法");
        hashMap.clear();

    }
}
