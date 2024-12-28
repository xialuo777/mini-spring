package springframework.beans.factory.config;

/**
 * @className: SingletonBeanRegistry
 * @author: zhangguowei
 * @date: 2024/12/14 12:47
 * @Version: 1.0
 * @description: 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
