package springframework.context;

import org.junit.Test;
import springframework.beans.Car;
import springframework.beans.Person;
import springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * @author : cycha
 * @time : 2025/1/4 20:44
 */

public class PrototypeBeanTest {

    @Test
    public void testPrototype() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:prototype-bean.xml");
        Car car1 = applicationContext.getBean("car", Car.class);
        Car car2 = applicationContext.getBean("car", Car.class);

        Person person1 = applicationContext.getBean("person", Person.class);
        Person person2 = applicationContext.getBean("person", Person.class);
        assertTrue(car2 != car1);
        assertTrue(person2 == person1);
    }
}
