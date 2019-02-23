package com.xiongxl.aop.aspect;

/**
 * @author xiongxl
 * @version $Id: TimeHandler.java, v 0.1 2019-02-23 16:38 xiongxl Exp $$
 * @desc
 */
public class TimeHandler {

    public void printTime() {
        System.out.println("CurrentTime = " + System.currentTimeMillis());
    }
}
