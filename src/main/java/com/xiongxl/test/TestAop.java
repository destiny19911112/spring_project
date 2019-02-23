package com.xiongxl.test;

import com.xiongxl.aop.intf.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author xiongxl
 * @version $Id: TestAop.java, v 0.1 2019-02-23 16:48 xiongxl Exp $$
 * @desc
 */
public class TestAop {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/resource/spring-aop.xml");
        HelloWorld helloWorld1 = (HelloWorld) ctx.getBean("helloWorldImpl1");
        HelloWorld helloWorld2 = (HelloWorld) ctx.getBean("helloWorldImpl2");
        helloWorld1.printHelloWorld();
        System.out.println();
        helloWorld1.doPrint();
        System.out.println();

        helloWorld2.printHelloWorld();
        System.out.println();
        helloWorld2.doPrint();
    }
}
