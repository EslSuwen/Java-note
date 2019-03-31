/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-04 19:05:18
 * @LastEditTime: 2019-03-26 09:26:43
 */
package exp2.test1;

public class Teacher {
    String Name;
    String Tno;
    void startLesson( ){
        System.out.println("Lesson starts!");
    }
    void endLesson( ){
        System.out.println("Lesson ends!");
    }
    void ask( ){
        System.out.println("Who can answer a question!");
    }
    void teach( ){
        System.out.println("I am teaching!");
    }
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