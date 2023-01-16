package com.waylau.java.demo.reactor.basic;

import java.io.IOException;

/**
 * Basic Reactor Demo
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2019年11月14日
 */
public class BasicReactorDemo {

    public static void main(String[] args) throws IOException {
        new Thread(new Reactor(2333)).start();
    }

}
