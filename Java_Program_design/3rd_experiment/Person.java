/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-11 19:04:22
 * @LastEditTime: 2019-03-18 19:36:28
 */
// package exp3;

public class erson {
    public int age; // ����
    public double height; // ���
    // ����һ��info����

    Person() {
    }

    Person(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public void info() {
        System.out.println("�ҵ������ǣ�" + age + "���ҵ�����ǣ�" + height);
    }
}
