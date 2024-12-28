package springframework.io;

import cn.hutool.core.io.IoUtil;
import org.junit.Test;
import springframework.core.io.DefaultResourceLoader;
import springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @className: ResourceAndResourceLoaderTeest
 * @author: zhangguowei
 * @date: 2024/12/14 21:57
 * @Version: 1.0
 * @description:
 */
public class ResourceAndResourceLoaderTest {

    @Test
    public void testResourceLoader() throws IOException {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        //加载classpath下的资源
        Resource resource = resourceLoader.getResource("classpath:hello.txt");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);

        //加载文件系统资源
        Resource resource1 = resourceLoader.getResource("src/test/resources/hello.txt");
        InputStream inputStream1 = resource1.getInputStream();
        String content1 = IoUtil.readUtf8(inputStream1);
        System.out.println(content1);

        //加载url资源
        Resource resource2 = resourceLoader.getResource("https://www.baidu.com");
        InputStream inputStream2 = resource2.getInputStream();
        String content2 = IoUtil.readUtf8(inputStream2);
        System.out.println(content2);

    }

}
