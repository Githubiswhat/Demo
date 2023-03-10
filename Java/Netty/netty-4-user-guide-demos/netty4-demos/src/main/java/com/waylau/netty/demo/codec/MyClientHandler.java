package com.waylau.netty.demo.codec;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * My ClientHandler.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2019年12月16日
 */
public class MyClientHandler extends SimpleChannelInboundHandler<Object> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object obj) throws Exception {
        Channel incoming = ctx.channel();

        if (obj instanceof Msg) {
            Msg msg = (Msg) obj;
            System.out.println("Server->Client:" + incoming.remoteAddress() + msg.getBody());
        } else {
            System.out.println("Server->Client:" + incoming.remoteAddress() + obj.toString());
        }
    }

}
