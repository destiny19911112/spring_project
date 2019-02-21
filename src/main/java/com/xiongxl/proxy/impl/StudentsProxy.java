/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.proxy.impl;

import com.xiongxl.proxy.intf.IStudent;

/**
 * 学生代理类
 * @author xiongxl
 * @version $Id: StudentsProxy.java, v 0.1 2019-02-21 下午11:01 xiongxl Exp $$
 */
public class StudentsProxy implements IStudent {
    private IStudent student;

    public StudentsProxy(IStudent student) {
        this.student = student;
    }

    @Override
    public void payClassFee() {
        System.out.println("您将进行上交班费，请准备好您的钱！！！");
        student.payClassFee();
        System.out.println("您已完成上交班费，谢谢！！！");
    }
}
