package cn.bobo.springframework.beans.factory;

/**
 * @author by bobo
 * @Description FactoryBean接口
 * @Date 2023/5/9 16:25
 */
public interface FactoryBean<T> {
    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
