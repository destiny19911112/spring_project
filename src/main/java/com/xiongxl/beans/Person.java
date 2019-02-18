/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.beans;

/**
 *
 * @author xiongxl
 * @version $Id: Person.java, v 0.1 2019-02-18 下午10:35 xiongxl Exp $$
 */
public class Person {
    // 私有属性
    private String name = "xiongxl";

    //公有属性
    public int age = 29;

    public String sex = "男";

    //构造方法
    public Person() {

    }

    //私有方法
    private void say() {
        System.out.println("private say()");
    }

    // 公有方法
    public void work() {
        System.out.println("public work()");
    }



}
