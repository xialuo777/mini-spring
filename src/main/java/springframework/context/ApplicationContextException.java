package springframework.context;

import springframework.BeansException;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/28 13:28]
 */

public class ApplicationContextException extends BeansException {
    public ApplicationContextException(String msg){
        super(msg);
    }

    public ApplicationContextException(String msg, Throwable cause){
        super(msg, cause);
    }
}
