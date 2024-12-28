package springframework.context;

import org.junit.Test;
import springframework.beans.Car;
import springframework.beans.Person;
import springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;


/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/28 14:17]
 */

public class ApplicationContextTest {


    @Test
    public void testApplicationContext() throws Exception {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        //从name属性在CustomBeanFactoryPostProcessor中被修改为ivy
        assertTrue(person.getName().equals("John Doe"));

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);
        //brand属性在CustomerBeanPostProcessor中被修改为lamborghini
        assertTrue(car.getBrand().equals("lamborghini"));
    }
}
