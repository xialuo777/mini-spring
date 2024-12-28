package springframework.beans.factory.config;

import springframework.BeansException;
import springframework.beans.factory.BeanFactory;

/**
 * @className: AutowireCapableBeeanFactory
 * @author: zhangguowei
 * @date: 2024/12/25 20:37
 * @Version: 1.0
 * @description:
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行BeanPostProcessors的postProcessBeforeInitialization 方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行BeanPostProcessors的postProcessorAfterInitialization方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
