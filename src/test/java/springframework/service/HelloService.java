package springframework.service;

import javafx.application.Application;
import javafx.stage.Stage;
import springframework.BeansException;
import springframework.beans.factory.BeanFactory;
import springframework.beans.factory.BeanFactoryAware;
import springframework.beans.factory.config.BeanPostProcessor;
import springframework.context.ApplicationContext;
import springframework.context.ApplicationContextAware;

/**
 * @author : cycha
 * @time : 2025/1/4 20:18
 */

public class HelloService implements ApplicationContextAware, BeanFactoryAware {

    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;

    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
}

