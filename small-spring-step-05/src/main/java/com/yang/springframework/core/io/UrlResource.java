package com.yang.springframework.core.io;

import cn.hutool.core.lang.Assert;

import javax.print.DocFlavor;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/11
 * @Copyright：
 */
public class UrlResource implements Resource{
    private final URL url;

    public UrlResource(URL url) {
        Assert.notNull(url, "URL must mot be null");
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection connection = this.url.openConnection();
        try {
            InputStream inputStream = connection.getInputStream();
            return inputStream;
        } catch (IOException e) {
            if (connection instanceof HttpURLConnection) {
                ((HttpURLConnection)connection).disconnect();
            }
            throw e;
        }
    }
}
