package springframework.beans.factory;

import springframework.BeansException;

/**
 * [一句话描述该类的功能]
 *
 * @author : [cycha]
 * @version : [v1.0]
 * @createTime : [2025/1/4 20:05]
 */

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
