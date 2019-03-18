/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-11 19:33:08
 * @LastEditTime: 2019-03-18 18:28:36
 */
public class TestStudent {
    public static void main(String[] args) {
        Student p1 = new Student(18, "Suwem","Computer science");
        Student p2 = new Student(16, "Tom","Foreign language");
        Student p3 = new Student();
        Student p4=new Student("Susie");
        Student[] Students = new Student[] { p1, p2, p3 ,p4};
        for (Student each : Students) {
            each.info();
        }
    }
}