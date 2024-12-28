package springframework.factory.common;

import springframework.BeansException;
import springframework.beans.Car;
import springframework.beans.factory.config.BeanPostProcessor;

/**
 * @className: CustomerBeanPostProcessor
 * @author: zhangguowei
 * @date: 2024/12/25 21:02
 * @Version: 1.0
 * @description:
 */
public class CustomerBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomerBeanPostProcessor#postProcessBeforeInitialization");
        if ("car".equals(beanName)) {
            ((Car) bean).setBrand("lamborghini");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomerBeanPostProcessor#postProcessAfterInitialization");
        return bean;
    }
}
