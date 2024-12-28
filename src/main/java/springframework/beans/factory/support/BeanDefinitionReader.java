package springframework.beans.factory.support;

import springframework.BeansException;
import springframework.core.io.Resource;
import springframework.core.io.ResourceLoader;

/**
 * 读取bean定义信息即BeanDefinifion的接口
 * @className: BeanDefinitionReader
 * @author: zhangguowei
 * @date: 2024/12/23 20:05
 * @Version: 1.0
 * @description:
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String[] locations) throws BeansException;

}
