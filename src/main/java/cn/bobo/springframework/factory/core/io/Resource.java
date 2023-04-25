package cn.bobo.springframework.factory.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author by bobo
 * @Description 处理资源加载流
 * @Date 2023/4/25 15:09
 */
public interface Resource {
    /**
     * 定义Resource接口
     *
     * @return 输入流
     * @throws IOException io异常
     */
    InputStream getInputStream() throws IOException;
}
