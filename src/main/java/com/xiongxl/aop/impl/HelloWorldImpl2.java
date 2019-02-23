package com.xiongxl.aop.impl;

import com.xiongxl.aop.intf.HelloWorld;

/**
 * @author xiongxl
 * @version $Id: HelloWorldImpl2.java, v 0.1 2019-02-23 16:35 xiongxl Exp $$
 * @desc
 */
public class HelloWorldImpl2 implements HelloWorld {

    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
    }
}
