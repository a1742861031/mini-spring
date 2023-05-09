package cn.bobo.springframework.beans.factory;

/**
 * @author by bobo
 * @Description 初始化bean执行方法接口
 * @Date 2023/5/3 20:33
 */
public interface InitializingBean {
    /**
     * Bean处理了属性填充后的调用
     *
     * @throws Exception 异常
     */
    void afterPropertiesSet() throws Exception;
}
