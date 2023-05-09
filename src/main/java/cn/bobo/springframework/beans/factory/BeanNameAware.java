package cn.bobo.springframework.beans.factory;

/**
 * @author by bobo
 * @Description BeanNameAware
 * @Date 2023/5/9 15:32
 */
public interface BeanNameAware {
    /**
     * 实现此接口，即能感知到所属的beanName
     */
    void setBeanName(String name);
}
