/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-11 19:04:22
 * @LastEditTime: 2019-03-11 19:12:25
 */
// package exp3;

public class Person {
    public int age; // 年龄
    public double height; // 身高
    // 定义一个info方法

    Person() {
    }

    Person(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public void info() {
        System.out.println("我的年龄是：" + age + "，我的身高是：" + height);
    }
}
