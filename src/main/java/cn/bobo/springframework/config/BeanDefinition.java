package cn.bobo.springframework.config;

/**
 * @author by bobo
 * @Description BeanDefinition
 * @Date 2023/4/9 11:17
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
