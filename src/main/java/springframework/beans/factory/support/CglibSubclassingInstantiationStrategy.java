package springframework.beans.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import springframework.BeansException;
import springframework.beans.factory.config.BeanDefinition;

/**
 * @className: CglibSubclassingInstantiationStrategy
 * @author: zhangguowei
 * @date: 2024/12/14 18:02
 * @Version: 1.0
 * @description:
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    /**
     * 通过CGLIB动态代理生成子类
     *
     * @param beanDefinition
     * @return
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, argsTemp, proxy) -> proxy.invokeSuper(obj, argsTemp));
        return enhancer.create();
    }
}
