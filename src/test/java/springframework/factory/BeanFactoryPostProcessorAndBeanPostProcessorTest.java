package springframework.factory;

import org.junit.Test;
import springframework.beans.Car;
import springframework.beans.Person;
import springframework.beans.factory.support.DefaultListableBeanFactory;
import springframework.beans.factory.xml.XmlBeanDefinitionReader;
import springframework.factory.common.CustomBeanFactoryPostProcessor;
import springframework.factory.common.CustomerBeanPostProcessor;

import static org.junit.Assert.assertTrue;

/**
 * @className: BeanFactoryProcessorAndBeanPostProcessorTest
 * @author: zhangguowei
 * @date: 2024/12/25 21:05
 * @Version: 1.0
 * @description:
 */
public class BeanFactoryPostProcessorAndBeanPostProcessorTest {

    @Test
    public void testBeanFactoryPostProcessor() throws Exception {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        //在所有的BeanDefinition加载完成后，但在bean实例化之前，修改BeanDefinition的属性值
        CustomBeanFactoryPostProcessor beanFactoryPostProcessor = new CustomBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        Person person = (Person)beanFactory.getBean("person");
        System.out.println(person);
        assertTrue(person.getName().equals("John Doe"));
    }

    @Test
    public void testBeanPostProcessor() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        //添加bean实例化后的处理器
        CustomerBeanPostProcessor customerBeanPostProcessor = new CustomerBeanPostProcessor();
        beanFactory.addBeanPostProcessor(customerBeanPostProcessor);

        Car car = (Car)beanFactory.getBean("car");
        System.out.println(car);
        assertTrue(car.getBrand().equals("lamborghini"));
    }
}
