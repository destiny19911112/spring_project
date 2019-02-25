package com.xiongxl.thread;

/**
 * @author xiongxl
 * @version $Id: Runnable1.java, v 0.1 2019-02-25 9:45 xiongxl Exp $$
 * @desc 实现多线程方式 -- 实现Runnable接口
 */
public class Runnable1 implements Runnable{

    private String name;

    public Runnable1(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for (int i=0; i<5; i++) {
            System.out.println(name + "运行：" + i);
        }
    }
}
