package springframework.context;

import org.junit.Test;
import springframework.context.support.ClassPathXmlApplicationContext;
import springframework.service.HelloService;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * @author : cycha
 * @time : 2025/1/4 20:21
 */

public class AwareInterfaceTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
        System.out.println(helloService.getApplicationContext());
        System.out.println(helloService.getBeanFactory());
    }
}
