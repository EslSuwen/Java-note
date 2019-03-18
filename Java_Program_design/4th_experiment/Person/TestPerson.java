/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen HS\n
 * @Date: 2019-03-18 19:21:37
 * @LastEditTime: 2019-03-18 20:52:39
 */

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();
        person.learn();
        person = student;
        person.learn();
        person = teacher;
        person.learn(); /**/
    }
}