package cn.bobo.springframework.beans.factory.config;

/**
 * @author by bobo
 * @Description 单例注册接口
 * @Date 2023/4/22 21:59
 */
public interface SingletonBeanRegistry {
    /**
     * 获取单例bean
     *
     * @param beanName bean名称
     * @return 对象
     */
    Object getSingleTon(String beanName);


}
