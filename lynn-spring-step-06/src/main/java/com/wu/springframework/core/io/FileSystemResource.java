/**
 * Author:   Lynn
 * Date:     2022/3/6 16:25
 */
package com.wu.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Lynn
 * @create 2022/3/6
 */
public class FileSystemResource implements Resource {

    private final String path;

    private File file;

    public FileSystemResource(String path) {
        this.file = new File(path);
        this.path = path;
    }

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }
}