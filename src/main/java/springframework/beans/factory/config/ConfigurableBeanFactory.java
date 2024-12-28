package springframework.beans.factory.config;

import springframework.beans.factory.BeanFactory;
import springframework.beans.factory.support.HierarchicalBeanFactory;

/**
 * @className: ConfigurableBeanFactory
 * @author: zhangguowei
 * @date: 2024/12/25 20:23
 * @Version: 1.0
 * @description:
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {


    /**
     *
     * @param beanPostProcessor
     */
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
