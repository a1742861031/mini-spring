package cn.bobo.springframework.beans;

/**
 * @author by bobo
 * @Description 自定义异常
 * @Date 2023/4/22 22:05
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
