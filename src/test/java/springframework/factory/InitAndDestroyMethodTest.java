package springframework.factory;

import org.junit.Test;
import springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/28 17:22]
 */

public class InitAndDestroyMethodTest {

    @Test
    public void testInitAndDestroyMethod() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:init-and-destroy-method.xml");
        applicationContext.registerShutdownHook();

    }
}
