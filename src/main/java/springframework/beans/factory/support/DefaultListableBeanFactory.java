package springframework.beans.factory.support;

import springframework.BeansException;
import springframework.beans.factory.ConfigurableListableBeanFactory;
import springframework.beans.factory.config.BeanDefinition;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: DefaultListableBeanFactory
 * @author: zhangguowei
 * @date: 2024/12/14 13:00
 * @Version: 1.0
 * @description:
 */
public class DefaultListableBeanFactory extends AbstractAutowiredCapableBeanFactory implements ConfigurableListableBeanFactory, BeanDefinitionRegistry{
   private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public Boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' found");
        }
        return beanDefinition;
    }

    @Override
    public void preInstantiateSingletons() throws BeansException {
        beanDefinitionMap.keySet().forEach(this::getBean);
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return Collections.emptyMap();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return new String[0];
    }
}
