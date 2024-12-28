package springframework.factory;

import org.junit.Test;
import springframework.beans.factory.HelloService;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @className: springframework.beans.factory.BeanDefinitionAndBeanDefinitionRegistryTest
 * @author: zhangguowei
 * @date: 2024/12/14 19:53
 * @Version: 1.0
 * @description:
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }

}


