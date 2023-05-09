package cn.bobo.springframework.test.bean.service;

import cn.bobo.springframework.beans.factory.DisposableBean;
import cn.bobo.springframework.beans.factory.InitializingBean;
import cn.bobo.springframework.test.bean.dao.UserDao;

/**
 * @author by bobo
 * @Description 测试service
 * @Date 2023/4/22 21:51
 */
public class UserService implements InitializingBean, DisposableBean {

    private String uId;
    private String company;
    private String location;
    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + ", 公司：" + company + ", 地点" + location;
    }


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行userservice销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service bean初始化完成");
    }
}
