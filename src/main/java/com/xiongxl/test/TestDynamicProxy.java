package com.xiongxl.test;

import com.xiongxl.proxy.impl.Student;
import com.xiongxl.proxy.intf.IStudent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiongxl
 * @version $Id: TestDynamicProxy.java, v 0.1 2019-02-23 13:37 xiongxl Exp $$
 * @desc 测试动态代理
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        final Student student = new Student("xiongsm");
        IStudent proxy = (IStudent) Proxy.newProxyInstance(
                student.getClass().getClassLoader(),
                student.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("您将进行上交班费，请准备好您的钱！！！");
                        //执行目标方法
                        Object returnValue = method.invoke(student, args);
                        System.out.println("您已完成上交班费，谢谢！！！");
                        return returnValue;
                    }
                }
        );
        proxy.payClassFee();
    }
}
