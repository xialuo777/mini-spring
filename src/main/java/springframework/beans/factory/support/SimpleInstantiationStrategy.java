package springframework.beans.factory.support;

import springframework.BeansException;
import springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @className: SimpleInstantiationStrategy
 * @author: zhangguowei
 * @date: 2024/12/14 17:46
 * @Version: 1.0
 * @description:
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            Constructor constructor = beanClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]" + e);
        }
    }
}