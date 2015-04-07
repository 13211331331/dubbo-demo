package com.hhl.server.service;

import com.hhl.service.DemoServer;

/**
 * Created by ivoss on 2015/4/7.
 */
public class DemoServerImpl implements DemoServer {
    @Override
    public String sayHello(String str) {
        return "Hello," + str;
    }
}
