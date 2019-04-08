/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-04-08 18:37:05
 * @LastEditTime: 2019-04-08 18:40:11
 */

//java 多线程实例
//实验目的
//继承Thread类
//覆盖run方法
//调用子类的时候调用线程对象
//调用start方法启动线程
//run方法里面的代码是启动多线程要执行的方法。

class Demo extends Thread {
    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "<----->" + name + "<----->" + i);
        }
    }

}

public class Thread_test {
    // 三个线程在运行，main(主线程),Thread-1线程,Thread-0线程
    public static void main(String[] args) {

        Demo d1 = new Demo("A");// 创建之后线程就被创建了
        Demo d2 = new Demo("B");
        // start方法会做两件事，开启线程，运行run方法
        d1.start();
        d2.start();
        for (int i = 0; i < 10; i++) {
            // 主线程运行的方法就是main
            System.out.println("打印当前正在运行的线程" + Thread.currentThread().getName());
        }

    }

}