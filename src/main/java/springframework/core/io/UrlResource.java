package springframework.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @className: UrlResouce
 * @author: zhangguowei
 * @date: 2024/12/14 21:47
 * @Version: 1.0
 * @description:
 */
public class UrlResource implements Resource {

    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection con = this.url.openConnection();
        try {
            return con.getInputStream();
        }catch (IOException ex) {
            throw ex;
        }
    }
}
