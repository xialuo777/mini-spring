package springframework.context.support;

import springframework.BeansException;
import springframework.beans.factory.config.BeanPostProcessor;
import springframework.context.ApplicationContext;
import springframework.context.ApplicationContextAware;

/**
 * @author : cycha
 * @time : 2025/1/4 20:12
 */

public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
