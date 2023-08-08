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

    static {
        hashMap.put("100001", "羊");
        hashMap.put("100002", "羊羊");
        hashMap.put("100003", "羊羊羊");
    }
    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
