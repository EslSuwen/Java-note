package exp1;

/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-31 13:11:47
 * @LastEditTime: 2019-03-31 13:12:38
 */
// ʵ��Comparable�ӿڣ���дCompareTo���������ڹ��ܲ˵��еġ�1����ѯ����ѧ����Ϣ��������ѧ�Ž�������
public class StudentH implements Comparable<StudentH> {
    // ���Ժ͹��췽�����Ը�����Ŀ������и���
    private int id; // ѧ��
    private String name; // ����
    private String classNum; // �༶

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
    public String toString() { // ��дһ��toString�������д�ӡ�������
        return "ѧ��" + id + " [ѧ��=" + id + ", ����=" + name + ", �༶=" + classNum + "]";
    }

    @Override
    public int compareTo(StudentH o) { // ��дһ��compareTo��������ѧ�Ž�������
        return this.id - o.getId();
    }
}