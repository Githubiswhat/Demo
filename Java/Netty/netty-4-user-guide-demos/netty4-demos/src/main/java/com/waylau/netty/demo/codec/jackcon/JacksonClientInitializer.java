package com.waylau.netty.demo.codec.jackcon;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;

/**
 * JacksonClient ChannelInitializer.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2020年1月2日
 */
public class JacksonClientInitializer extends
        ChannelInitializer<Channel> {

    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new JacksonDecoder<JacksonBean>(JacksonBean.class));
        pipeline.addLast(new JacksonEncoder());
        pipeline.addLast(new JacksonClientHandler());
    }
}