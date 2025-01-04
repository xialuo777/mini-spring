package springframework.beans.factory.config;

import springframework.beans.factory.BeanFactory;
import springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @className: ConfigurableBeanFactory
 * @author: zhangguowei
 * @date: 2024/12/25 20:23
 * @Version: 1.0
 * @description:
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry, BeanFactory {


    /**
     *
     * @param beanPostProcessor
     */
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例beean
     * @param
     * @return
     **/

    void destroySingletons();

}
