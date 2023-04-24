package cn.bobo.springframework.factory.config;

/**
 * @author by bobo
 * @Description Bean的实例化信息
 * @Date 2023/4/22 21:46
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
