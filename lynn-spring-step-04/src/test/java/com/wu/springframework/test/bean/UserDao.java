package com.wu.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wl
 * @date 2022/2/4
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小吴");
        hashMap.put("10002", "小吴");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
