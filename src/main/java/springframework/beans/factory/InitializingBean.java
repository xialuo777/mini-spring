package springframework.beans.factory;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/28 16:43]
 */

public interface InitializingBean {
    void afterPropertiesSet() throws Exception;
}
