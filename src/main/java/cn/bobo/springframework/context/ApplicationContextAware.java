package cn.bobo.springframework.context;

import cn.bobo.springframework.beans.BeansException;

/**
 * @author by bobo
 * @Description ApplicationContextAware
 * @Date 2023/5/9 15:33
 */
public interface ApplicationContextAware {
    /**
     * 实现此接口，即能感知到所属的ApplicaContext
     */
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
