package cn.bobo.springframework;

/**
 * @author by bobo
 * @Description 定义属性
 * @Date 2023/4/9 14:53
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
