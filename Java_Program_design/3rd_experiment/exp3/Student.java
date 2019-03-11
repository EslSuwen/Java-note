
public class Student {
    public int age; // 年龄
    public String name; // 姓名
    public String department; // 院系名称
    Student() {
    }
    Student(int age, String name, String department) {
        this.age=age;
        this.name=name;
        this.department=department;
    }
    public void info() {
        System.out.println("name:"+name+"age:"+age+"departmen"+department);
    }
}
