package springframework.core.io;

/**
 * @className: ResourceLoader
 * @author: zhangguowei
 * @date: 2024/12/14 21:42
 * @Version: 1.0
 * @description: 资源加载器接口
 */
public interface ResourceLoader {

    Resource getResource(String location);
}
