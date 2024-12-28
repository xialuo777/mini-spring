package springframework.beans.factory.support;

import springframework.BeansException;
import springframework.core.io.DefaultResourceLoader;
import springframework.core.io.ResourceLoader;

/**
 *
 *
 * @className: AbstractBeanDefinitionReader
 * @author: zhangguowei
 * @date: 2024/12/23 20:14
 * @Version: 1.0
 * @description:
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String[] locations) throws BeansException {
        for (String location : locations) {
            loadBeanDefinitions(location);
        }
    }

    @Override
    public ResourceLoader getResourceLoader(){
        return resourceLoader;
    }


    public void setResourceLoader(ResourceLoader resourceLoader){
        this.resourceLoader = resourceLoader;
    }


}
