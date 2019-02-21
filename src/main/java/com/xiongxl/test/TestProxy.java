/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.test;

import com.xiongxl.proxy.impl.Student;
import com.xiongxl.proxy.impl.StudentsProxy;
import com.xiongxl.proxy.intf.IStudent;

/**
 *
 * @author xiongxl
 * @version $Id: TestProxy.java, v 0.1 2019-02-21 下午11:18 xiongxl Exp $$
 */
public class TestProxy {

    public static void main(String[] args) {
        IStudent student = new Student("xiongxl");
        StudentsProxy studentsProxy = new StudentsProxy(student);
        studentsProxy.payClassFee();
    }
}
