/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.proxy.impl;

import com.xiongxl.proxy.intf.IStudent;

/**
 * 学生类
 * @author xiongxl
 * @version $Id: Student.java, v 0.1 2019-02-21 下午10:59 xiongxl Exp $$
 */
public class Student implements IStudent {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    /**
     * 上交班费
     */
    @Override
    public void payClassFee() {
        System.out.println(name + "正在上交班费中...");
    }
}
