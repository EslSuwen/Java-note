/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-31 13:11:47
 * @LastEditTime: 2019-03-31 13:12:38
 */
// 实现Comparable接口，重写CompareTo方法，用于功能菜单中的“1、查询所有学生信息”，根据学号进行排序
public class StudentH implements Comparable<StudentH> {
    // 属性和构造方法可以根据题目需求进行更改
    private int id; // 学号
    private String name; // 姓名
    private String classNum; // 班级

    public StudentH() {

    }

    public StudentH(int id, String name, String classNum) {
        this.id = id;
        this.name = name;
        this.classNum = classNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() { // 重写一下toString方法进行打印输出方法
        return "学生" + id + " [学号=" + id + ", 姓名=" + name + ", 班级=" + classNum + "]";
    }

    @Override
    public int compareTo(StudentH o) { // 重写一下compareTo方法根据学号进行排序
        return this.id - o.getId();
    }
}