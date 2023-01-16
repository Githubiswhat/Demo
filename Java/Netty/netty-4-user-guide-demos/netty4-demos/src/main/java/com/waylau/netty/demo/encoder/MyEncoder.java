/**
 *
 */
package com.waylau.netty.demo.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * My Encoder.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2019年12月16日
 */
public class MyEncoder extends MessageToByteEncoder<Msg> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Msg msg, ByteBuf out) throws Exception {
        if (msg == null | msg.getMsgHeader() == null) {
            throw new Exception("The encode message is null");
        }

        // 获取消息头
        MsgHeader header = msg.getMsgHeader();

        // 获取消息体
        String body = msg.getBody();
        byte[] bodyBytes = body.getBytes(StandardCharsets.UTF_8);

        // 计算消息体的长度
        int bodySize = bodyBytes.length;

        System.out.printf("MyEncoder header: %s, body: %s", header.getMsgType(), body);

        out.writeByte(MsgType.EMGW_LOGIN_RES.getValue());
        out.writeInt(bodySize);
        out.writeBytes(bodyBytes);
    }

}