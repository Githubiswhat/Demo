package com.waylau.netty.demo.encoder;

/**
 * Message.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2019年12月16日
 */
public class Msg {

    private MsgHeader msgHeader = new MsgHeader();
    private String body;

    public MsgHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MsgHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
