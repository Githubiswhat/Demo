package com.waylau.java.demo.reactor.client;

/**
 * Client Demo
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2019年11月14日
 */
public class ClientDemo {

    public static void main(String[] args) {
        new Thread(new NIOClient("127.0.0.1", 2333)).start();
        new Thread(new NIOClient("127.0.0.1", 2333)).start();
    }

}
