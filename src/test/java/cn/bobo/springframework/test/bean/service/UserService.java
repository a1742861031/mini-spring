package cn.bobo.springframework.test.bean.service;

import cn.bobo.springframework.beans.BeansException;
import cn.bobo.springframework.beans.factory.BeanClassLoaderAware;
import cn.bobo.springframework.beans.factory.BeanFactory;
import cn.bobo.springframework.beans.factory.BeanFactoryAware;
import cn.bobo.springframework.beans.factory.BeanNameAware;
import cn.bobo.springframework.context.ApplicationContext;
import cn.bobo.springframework.context.ApplicationContextAware;
import cn.bobo.springframework.test.bean.dao.UserDao;

/**
 * @author by bobo
 * @Description 测试service
 * @Date 2023/4/22 21:51
 */
public class UserService implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

    private String uId;
    private String company;
    private String location;
    private UserDao userDao;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is：" + name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("ClassLoader：" + classLoader);
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
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

    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }
}

