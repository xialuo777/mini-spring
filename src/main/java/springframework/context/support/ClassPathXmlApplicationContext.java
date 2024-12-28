package springframework.context.support;

import springframework.BeansException;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/28 14:37]
 */

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{

    private String[] configLocations;

    /**
     * 从xml文件中加载BeanDefinition，并自动刷新上下文
     * @param configLocation
     * @return
     **/
    
    public ClassPathXmlApplicationContext(String configLocation) throws BeansException{
        this(new String[]{configLocation});
    }

    /**
     * 从xml文件加载BeanDefinition,并自动刷新上下文
     * @param configLocations
     * @return
     **/

    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException{
        this.configLocations = configLocations;
        refresh();
    }

    
    
    @Override
    protected String[] getConfigLocations() {
        return this.configLocations;
    }
}
