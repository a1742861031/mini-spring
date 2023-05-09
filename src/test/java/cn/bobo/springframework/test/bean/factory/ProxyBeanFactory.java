package cn.bobo.springframework.test.bean.factory;

import cn.bobo.springframework.beans.factory.FactoryBean;
import cn.bobo.springframework.test.bean.dao.IUserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author by bobo
 * @Description 定义FactoryBean对象
 * @Date 2023/5/9 17:15
 */
public class ProxyBeanFactory implements FactoryBean<IUserDao> {
    @Override
    public IUserDao getObject() throws Exception {
        InvocationHandler handler = ((proxy, method, args) -> {
            Map<String, String> map = new HashMap<>();
            map.put("10001", "小傅哥");
            map.put("10002", "八杯水");
            map.put("10003", "阿毛");
            return "你被代理了 " + method.getName() + "：" + map.get(args[0].toString());
        });
        return (IUserDao) Proxy.newProxyInstance(Thread.currentThread()
                        .getContextClassLoader(),
                new Class[]{IUserDao.class}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return IUserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
