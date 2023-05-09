package cn.bobo.springframework.beans.factory;

/**
 * @author by bobo
 * @Description Bean销毁后的调用
 * @Date 2023/5/3 20:35
 */
public interface DisposableBean {
    /**
     * bean 销毁后执行的方法
     *
     * @throws Exception 异常
     */
    void destroy() throws Exception;
}
