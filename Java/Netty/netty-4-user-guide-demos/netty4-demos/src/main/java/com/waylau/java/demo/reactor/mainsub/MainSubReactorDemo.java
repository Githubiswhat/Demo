package com.waylau.java.demo.reactor.mainsub;

import java.io.IOException;

/**
 * Main Sub Reactor Demo
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2019年11月14日
 */
public class MainSubReactorDemo {

    public static void main(String[] args) throws IOException {
        new Thread(new Reactor(2333)).start();
    }

}
