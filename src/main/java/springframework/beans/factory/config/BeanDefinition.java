package springframework.beans.factory.config;

import springframework.PropertyValue;
import springframework.PropertyValues;

/**
 * @className: BeanDefinition
 * @author: zhangguowei
 * @date: 2024/12/14 12:43
 * @Version: 1.0
 * @description: BeanDefinition 实例保存bean的信息，包括class类型、方法构造参数、是否为单例等，此处简化只包含class类型
 */
public class BeanDefinition {

    public static String SCOPE_SINGLETON = "singleton";

    public static String SCOPE_PROTOTYPE = "prototype";

    private Class beanClass;

    private PropertyValues propertyValues;

    private String initMethodName;

    private String destroyMethodName;

    private String scope = SCOPE_SINGLETON;

    private boolean singleton = true;

    private boolean prototype = false;

    public BeanDefinition(Class beanClass) {
        this(beanClass, null);
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

    public boolean isSingleton() {
        return this.singleton;
    }

    public boolean isPrototype() {
        return this.prototype;
    }

    public Class getBeanClass() {
        return beanClass;
    }
    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getInitMethodName(){
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName){
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName(){
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName){
        this.destroyMethodName = destroyMethodName;
    }
}
