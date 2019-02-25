package com.xiongxl.test;

import com.xiongxl.thread.Runnable1;
import com.xiongxl.thread.Thread1;

/**
 * @author xiongxl
 * @version $Id: TestThread.java, v 0.1 2019-02-25 9:33 xiongxl Exp $$
 * @desc
 */
public class TestThread {
    public static void main(String[] args) throws Exception{
        Runnable1 runnable1 = new Runnable1("runnable1");
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
