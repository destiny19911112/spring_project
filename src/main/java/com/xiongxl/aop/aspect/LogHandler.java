package com.xiongxl.aop.aspect;

/**
 * @author xiongxl
 * @version $Id: LogHandler.java, v 0.1 2019-02-23 17:24 xiongxl Exp $$
 * @desc
 */
public class LogHandler {

    public void LogBefore() {
        System.out.println("Log before method");
    }

    public void LogAfter() {
        System.out.println("Log After method");
    }
}
