package springframework.context.support;

import springframework.BeansException;
import springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/28 14:18]
 */

public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    /**
     * 创建beanFactory并加载Beandefinition
     * @param
     * @return
     **/

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinition(beanFactory);
        this.beanFactory = beanFactory;
    }

    /**
     * 加载BeanDefinition
     * @param beanFactory
     * @return
     **/

    protected abstract void loadBeanDefinition(DefaultListableBeanFactory beanFactory) throws BeansException;

    /**
     * 创建bean工厂
     * @param
     * @return
     **/

    protected DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    @Override
    public DefaultListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
