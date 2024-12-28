package springframework.context;

import springframework.beans.factory.HierarchicalBeanFactory;
import springframework.beans.factory.ListableBeanFactory;
import springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 * @author: zhangguowei
 * @date: 2024/12/25 22:16
 * @Version: 1.0
 * @description:
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {

}
