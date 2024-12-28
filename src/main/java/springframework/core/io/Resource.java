package springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @className: Resource
 * @author: zhangguowei
 * @date: 2024/12/14 21:35
 * @Version: 1.0
 * @description: 资源的抽象和访问接口
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
