/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2019-03-04 19:05:18
 * @LastEditTime: 2019-03-04 20:09:34
 */
// package chapter02.test2;

public class Lesson {
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
