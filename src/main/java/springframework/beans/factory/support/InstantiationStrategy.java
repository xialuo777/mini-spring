package springframework.beans.factory.support;

import springframework.beans.factory.config.BeanDefinition;

/**
 * @className: InstantiationStrategy
 * @author: zhangguowei
 * @date: 2024/12/14 17:44
 * @Version: 1.0
 * @description:
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition);
}
