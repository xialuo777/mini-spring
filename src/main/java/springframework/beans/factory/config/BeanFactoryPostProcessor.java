package springframework.beans.factory.config;

import springframework.BeansException;
import springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @className: BeanFactoryPostProcessor
 * @author: zhangguowei
 * @date: 2024/12/25 20:34
 * @Version: 1.0
 * @description:
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有BeanDefinition加载完成后，但在bean实例化之前，提供修改BeanDefinition属性值的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
