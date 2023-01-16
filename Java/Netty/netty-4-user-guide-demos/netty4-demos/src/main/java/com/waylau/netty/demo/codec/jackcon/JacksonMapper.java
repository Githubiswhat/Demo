package com.waylau.netty.demo.codec.jackcon;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ObjectMapper instance.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2020年1月2日
 */
public class JacksonMapper {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static ObjectMapper getInstance() {
        return MAPPER;
    }

}
