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

    /**
     * 关闭应用上下文
     * @param
     * @return
     **/
    void close();

    /**
     * 向虚拟机中注册一个钩子方法，在虚拟机关闭之前执行关闭容器等操作
     * @param
     * @return
     **/
    void registerShutdownHook();
}
