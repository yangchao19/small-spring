package com.yang.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/11
 * @Copyright：
 */
public interface Resource {
    /**
     * 获取输入流（classPath、URI、本地文件地址）
     * @return 输入流
     * @throws IOException
     */
    public InputStream getInputStream() throws IOException;
}
