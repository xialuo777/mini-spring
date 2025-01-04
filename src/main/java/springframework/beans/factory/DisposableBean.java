package springframework.beans.factory;

/**
 * [一句话描述该类的功能]
 *
 * @author : [cycha]
 * @version : [v1.0]
 * @createTime : [2024/12/28 16:14]
 */

public interface DisposableBean {

    void destroy() throws Exception;
}
