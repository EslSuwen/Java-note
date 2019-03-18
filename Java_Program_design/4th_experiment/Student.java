/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-11 19:25:47
 * @LastEditTime: 2019-03-18 18:30:39
 */

public class Student {
    public int age = 18; // 年龄
    public String name; // 姓名
    public String department; // 院系名称

    Student() {
    }

    Student(int age, String name, String department) {
        this.age = age;
        this.name = name;
        this.department = department;
    }

    Student(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("name:" + name + " age:" + age + " departmen:" + department);
    }
}
