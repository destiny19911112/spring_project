/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.test;

/**
 *
 * @author xiongxl
 * @version $Id: TestDog.java, v 0.1 2019-02-17 下午10:34 xiongxl Exp $$
 */
public class TestDog {
    public static void main(String[] argss) {
        String name = "MyDog";
        System.out.println("1:" + name.hashCode());
        getInfo(name);
        System.out.println("4:" + name.hashCode());
    }

    public static void getInfo(String name) {
        System.out.println("2:" + name.hashCode());
        name = "Dog";
        System.out.println("3:" + name.hashCode());
    }

    public void getInfo(int age, String name) {

    }

    public void getInfo(String name, int age) {

    }
}

class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("狗狗可以跑和跳");
    }
}
