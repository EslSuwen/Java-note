/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2019-03-04 19:39:57
 * @LastEditTime: 2019-03-04 20:09:56
 */


// package use;

/**
 * 测试类
 */
public class Lesson {
    /**
     * 测试设计好的教师和学生类，即利用类定义对象并调用方法
     */
   public static void main(String[] arguments){
        Teacher t1 = new Teacher();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        t1.startLesson();
        t1.teach();
        t1.ask();
        s1.answer();
        t1.endLesson();
    }
}
