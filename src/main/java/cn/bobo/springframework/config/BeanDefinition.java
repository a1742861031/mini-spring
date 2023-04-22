package cn.bobo.springframework.config;

/**
 * @author by bobo
 * @Description Bean的实例化信息
 * @Date 2023/4/22 21:46
 */
public class BeanDefinition {
    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
