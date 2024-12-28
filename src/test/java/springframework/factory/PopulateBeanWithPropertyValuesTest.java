package springframework.factory;

import org.junit.Test;
import springframework.PropertyValue;
import springframework.PropertyValues;
import springframework.beans.Car;
import springframework.beans.Person;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.config.BeanReference;
import springframework.beans.factory.support.DefaultListableBeanFactory;
import springframework.beans.factory.support.DefaultSingletonBeanRegistry;

import static org.junit.Assert.assertEquals;

/**
 * @className: springframework.beans.factory.PopulateBeanWithPropertyValuesTest
 * @author: zhangguowei
 * @date: 2024/12/14 20:40
 * @Version: 1.0
 * @description:
 */
public class PopulateBeanWithPropertyValuesTest {

    @Test
    public void testPopulateBeanWithPropertyValues() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "John"));
        propertyValues.addPropertyValue(new PropertyValue("age", 20));

        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        beanFactory.registerBeanDefinition("person", beanDefinition);
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertEquals("John", person.getName());
        assertEquals(20, person.getAge());

    }

    @Test
    public void testPopulateBeanWithBean() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        DefaultSingletonBeanRegistry singletonBeanRegistry = new DefaultSingletonBeanRegistry();

        //注册Car实例
        PropertyValues propertyValuesForCar = new PropertyValues();
        propertyValuesForCar.addPropertyValue(new PropertyValue("brand", "porsche"));
        BeanDefinition carBeanDefinition = new BeanDefinition(Car.class, propertyValuesForCar);
        beanFactory.registerBeanDefinition("car", carBeanDefinition);

        //注册Person实例
        PropertyValues propertyValuesForPerson = new PropertyValues();
        propertyValuesForPerson.addPropertyValue(new PropertyValue("name", "John"));
        propertyValuesForPerson.addPropertyValue(new PropertyValue("age", 20));
        //Person实例依赖Car实例
        propertyValuesForPerson.addPropertyValue(new PropertyValue("car", new BeanReference("car")));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValuesForPerson);
        beanFactory.registerBeanDefinition("person", beanDefinition);

        Person person = (Person)beanFactory.getBean("person");
        System.out.println(person);

        Car car = person.getCar();
        System.out.println(car);

    }
}
