package cn.bobo.springframework.test.bean.dao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by bobo
 * @Description UserDao
 * @Date 2023/4/25 14:58
 */
public class UserDao implements IUserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小傅哥");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public void initDataMethod() {
        System.out.println("执行：init-method");
        hashMap.put("10001", "小傅哥");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public void destroyDataMethod() {
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    @Override
    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
