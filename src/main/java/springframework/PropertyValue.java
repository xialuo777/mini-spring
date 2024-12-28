package springframework;

/**
 * @className: PropertyValue
 * @author: zhangguowei
 * @date: 2024/12/14 18:16
 * @Version: 1.0
 * @description: bean属性信息
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
