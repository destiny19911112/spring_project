package com.xiongxl.aop.impl;

import com.xiongxl.aop.intf.HelloWorld;

/**
 * @author xiongxl
 * @version $Id: HelloWorldImpl1.java, v 0.1 2019-02-23 16:18 xiongxl Exp $$
 * @desc
 */
public class HelloWorldImpl1 implements HelloWorld {

    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
    }
}
