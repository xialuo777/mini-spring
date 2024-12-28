package springframework.factory.xml;

import org.junit.Test;
import springframework.beans.Car;
import springframework.beans.Person;
import springframework.beans.factory.support.DefaultListableBeanFactory;
import springframework.beans.factory.xml.XmlBeanDefinitionReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * @className: XmlBeanDefinitionTest
 * @author: zhangguowei
 * @date: 2024/12/23 21:11
 * @Version: 1.0
 * @description:
 */
public class XmlBeanDefinitionTest {
    @Test
    public void testXmlFile() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertTrue(person.getName().equals("derek"));
        assertTrue(person.getCar().getBrand().equals("porsche"));

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        assertEquals(car.getBrand(), "porsche");

    }
}
