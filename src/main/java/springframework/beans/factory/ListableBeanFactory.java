package springframework.beans.factory;

import springframework.BeansException;

import java.util.Map;

/**
 * @className: ListableBeanFactory
 * @author: zhangguowei
 * @date: 2024/12/25 20:02
 * @Version: 1.0
 * @description:
 */
public interface ListableBeanFactory extends BeanFactory{


    /**
     * 返回指定类型的所有实例
     *
     * @param type
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回定义的所有bean的名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();

}
