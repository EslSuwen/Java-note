/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen HS\n
 * @Date: 2019-03-11 19:05:05
 * @LastEditTime: 2019-03-11 21:16:01
 */
// package exp3;
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person(18, 178);
        Person p2 = new Person(16, 156.2);
        Person p3 = new Person();
        Person[] persons = new Person[] { p1, p2, p3 };
        for (Person each : persons) {
            each.info();
        }
    }
}