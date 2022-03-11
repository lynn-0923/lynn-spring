package com.wu.springfreamework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: Lynn
 * @date: 2022/3/10
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
