package springframework.beans.factory.config;

/**
 * @className: BeanReference
 * @author: zhangguowei
 * @date: 2024/12/14 21:04
 * @Version: 1.0
 * @description: 一个bean对另一个bean的引用
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
    public String getBeanName(){
        return beanName;
    }
}
