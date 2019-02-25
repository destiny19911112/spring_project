package com.xiongxl.thread;

/**
 * @author xiongxl
 * @version $Id: Thread1.java, v 0.1 2019-02-25 9:29 xiongxl Exp $$
 * @desc 实现多线程方式 -- 继承 Thread 类
 */
public class Thread1 extends Thread{
    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(name + "运行：" + i);
        }
    }
}
