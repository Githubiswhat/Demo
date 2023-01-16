package com.waylau.netty.demo.encoder;

/**
 * Message Type.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2019年12月16日
 */
public enum MsgType {
    EMGW_LOGIN_REQ((byte) 0x00),
    EMGW_LOGIN_RES((byte) 0x01);

    private final byte value;

    MsgType(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}
