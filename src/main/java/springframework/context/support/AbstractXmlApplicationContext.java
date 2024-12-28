package springframework.context.support;

import springframework.BeansException;
import springframework.beans.factory.support.DefaultListableBeanFactory;
import springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/28 14:32]
 */

public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{


    @Override
    protected void loadBeanDefinition(DefaultListableBeanFactory beanFactory) throws BeansException {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (configLocations != null) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
