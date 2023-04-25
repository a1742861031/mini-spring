package cn.bobo.springframework.beans.factory.config;

/**
 * @author by bobo
 * @Description Bean 的引用
 * @Date 2023/4/25 14:53
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
