package cn.bobo.springframework.beans;

/**
 * @author by bobo
 * @Description 属性
 * @Date 2023/4/25 14:36
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
