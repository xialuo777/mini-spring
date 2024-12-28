package springframework.beans.factory.config;

import springframework.BeansException;

/**
 * 用于修改实例化后bean的修改扩展点
 * @className: BeanPostProcessor
 * @author: zhangguowei
 * @date: 2024/12/25 20:24
 * @Version: 1.0
 * @description:
 */
public interface BeanPostProcessor {

    /**
     * 在bean执行初始化方法之前执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在bean执行初始化方法之后执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
