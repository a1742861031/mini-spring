package cn.bobo.springframework.test.bean;

/**
 * @author by bobo
 * @Description 测试类
 * @Date 2023/4/9 11:36
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}

