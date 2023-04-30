package cn.bobo.springframework.core.io;

/**
 * @author by bobo
 * @Description 包装资源加载器
 * @Date 2023/4/25 15:17
 */
public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";

    /**
     * 从指定位置获取资源
     * @param location 位置
     * @return 资源
     */
    Resource getResource(String location);
}

