package springframework.core.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

/**
 * @className: FileSystemResource
 * @author: zhangguowei
 * @date: 2024/12/14 21:51
 * @Version: 1.0
 * @description:
 */
public class FileSystemResource implements Resource{

    private final String filePath;

    public FileSystemResource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        try {
            Path path = new File(this.filePath).toPath();
            return Files.newInputStream(path);
        }catch (NoSuchFileException ex){
            throw new FileNotFoundException(ex.getMessage());
        }

    }
}
