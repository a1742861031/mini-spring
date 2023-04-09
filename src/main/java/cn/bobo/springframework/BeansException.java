package cn.bobo.springframework;

/**
 * @author by bobo
 * @Description 异常
 * @Date 2023/4/9 11:25
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}


