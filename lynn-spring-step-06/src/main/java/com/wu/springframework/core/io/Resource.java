package com.wu.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: Lynn
 * @date: 2022/3/6
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
