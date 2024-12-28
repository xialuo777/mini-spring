package springframework;

/**
 * @className: BeansException
 * @author: zhangguowei
 * @date: 2024/12/14 12:37
 * @Version: 1.0
 * @description:
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
