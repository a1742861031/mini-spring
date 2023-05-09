package cn.bobo.springframework.beans.factory;

/**
 * @author by bobo
 * @Description BeanClassLoaderAware
 * @Date 2023/5/9 15:31
 */
public interface BeanClassLoaderAware {
    /**
     * 实现此接口，即能感知到所属的ClassLoader
     */
    void setBeanClassLoader(ClassLoader classLoader);

}
