/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.xiongxl.test;

import com.xiongxl.beans.Person;

import java.lang.reflect.Field;

/**
 * 反射学习
 * @author xiongxl
 * @version $Id: TestReflex.java, v 0.1 2019-02-18 下午10:44 xiongxl Exp $$
 */
public class TestReflex {
    public static void main(String[] args) {
        /**** 得到Class的三种方式 ****/

        /**
         * 第一种方式：通过对象调用 getClass()来获取，通常应用在：
         * 比如你传过来一个Object类型的对象，而我不知道你具体是什么类，用这种方法
         */
        Person p1 = new Person();
        Class c1 = p1.getClass();

        /**
         * 第二种方式：直接通过 类名.class 的方式得到，该方法最为安全可靠，程序性能最高
         * 这说明任何一个类都有一个隐藏的静态成员变量 class
         */
        Class c2 = Person.class;

        /**
         * 第三种方式：通过Class类的静态方法 forName() 来获取，用的最多
         * 但该种方法可能会抛出 ClassNotFoundException 异常
         */
        Class c3 = null;
        try {
            c3 = Class.forName("com.xiongxl.beans.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * 需要注意的是：
         * 一个类在JVM中只会有一个 Class 实例，即我们对上面获取的 c1,c2,c3进行equals()比较，发现结果均为 true
         */
        c1.equals(c2);   // true
        c2.equals(c3);  // true
        c1.equals(c3);   // true

        /*** 以下 通过 Class 类获取成员变量、成员方法、接口、超类、构造方法等 ***/

        String className = c2.getName();   //getName() 获得类的全类名【com.xiongxl.beans.Person】
        Field[] fields = c2.getFields();   //getFields() 获得类的Public类型的属性
        for (Field field : fields) {
            field.getName();      // age 、 sex
        }
    }
}
