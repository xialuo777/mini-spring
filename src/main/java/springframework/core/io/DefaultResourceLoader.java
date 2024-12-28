package springframework.core.io;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @className: DefaultResourceLoader
 * @author: zhangguowei
 * @date: 2024/12/14 21:41
 * @Version: 1.0
 * @description:
 */
public class DefaultResourceLoader implements ResourceLoader {

    public static final String CLASSPATH_URL_PREFIX = "classpath:";
    @Override
    public Resource getResource(String location) {

        if (location.startsWith(CLASSPATH_URL_PREFIX)){
            //classpath下的资源
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));

        }else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {
                return new FileSystemResource(location);
            }
        }
    }
}
