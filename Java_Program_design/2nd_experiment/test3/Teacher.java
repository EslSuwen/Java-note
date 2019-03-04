/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2019-03-04 19:38:34
 * @LastEditTime: 2019-03-04 19:39:23
 */

/**
 * 模拟大学课堂中的老师类
 */
public class Teacher {
    private String Name;
    private String Tno;

    /**
     * 老师类的宣布上课方法
     */
    public void startLesson() {
        System.out.println("Lesson starts!");
    }

    /**
     * 老师类的宣布下课方法
     */
    public void endLesson() {
        System.out.println("Lesson ends!");
    }

    /**
     * 老师类的提问方法
     */
    public void ask() {
        System.out.println("Who can answer a question!");
    }

    /**
     * 老师类的讲课方法
     */
    public void teach() {
        System.out.println("I am teaching!");
    }
}
