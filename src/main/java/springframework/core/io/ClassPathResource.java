package springframework.core.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @className: ClassPathResource
 * @author: zhangguowei
 * @date: 2024/12/14 21:36
 * @Version: 1.0
 * @description:
 */
public class ClassPathResource implements Resource {

    private final String path;

    public ClassPathResource(String path){
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(this.path);
        if (is == null){
            throw new FileNotFoundException(path + " not found");
        }

        return is;
    }
}
