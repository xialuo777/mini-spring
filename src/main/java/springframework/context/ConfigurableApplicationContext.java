package springframework.context;

import springframework.BeansException;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/28 13:30]
 */

public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     * @param
     * @return
     **/
    void refresh() throws BeansException;
}
