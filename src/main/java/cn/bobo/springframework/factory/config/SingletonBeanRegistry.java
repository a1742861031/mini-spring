package cn.bobo.springframework.factory.config;

/**
 * @author by bobo
 * @Description 单例bean注册
 * @Date 2023/4/9 11:17
 */
public interface SingletonBeanRegistry {
    /**
     * 获取单例bean
     *
     * @param beanName beanName
     * @return 单例bean对象
     */
    Object getSingleton(String beanName);
}
