package cn.bobo.springframework.utils;

/**
 * @author by bobo
 * @Description Class相关工具
 * @Date 2023/4/25 16:31
 */
public class ClassUtils {
    /**
     * 获取默认类加载器
     */
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back to system class loader...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}
