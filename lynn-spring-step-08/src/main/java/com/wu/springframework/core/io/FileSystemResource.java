/**
 * Author:   Lynn
 * Date:     2022/3/10 19:39
 */
package com.wu.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public class FileSystemResource implements Resource {

    private final String path;
    private File file;

    public FileSystemResource(String path) {
        this.path = path;
        this.file = new File(path);
    }

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    @Override
    public InputStream getInputStream() throws FileNotFoundException {
        return new FileInputStream(this.file);
    }

    public String getPath() {
        return path;
    }
}