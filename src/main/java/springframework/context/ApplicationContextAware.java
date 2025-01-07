package springframework.context;

import springframework.BeansException;
import springframework.beans.factory.Aware;

/**
 * 实现该接口，能感知所属ApplicationContext
 *
 * @author : cycha
 * @createTime : 2025/1/4 20:14
 */

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
