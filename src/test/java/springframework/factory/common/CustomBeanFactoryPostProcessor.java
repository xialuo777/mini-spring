package springframework.factory.common;

import springframework.BeansException;
import springframework.PropertyValue;
import springframework.PropertyValues;
import springframework.beans.factory.ConfigurableListableBeanFactory;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @className: CustomBeanFactoryPostProcessor
 * @author: zhangguowei
 * @date: 2024/12/25 20:58
 * @Version: 1.0
 * @description:
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition personBeanDefinition = beanFactory.getBeanDefinition("person");
        PropertyValues propertyValues = personBeanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("name", "John Doe"));
    }
}
