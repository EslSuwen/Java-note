/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen HS\n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-11 21:12:27
 * @LastEditTime: 2019-03-12 21:50:38
 */
public class TestVariable {
    public static void main(String[] args) {
        System.out.println(Variable.contury);
        Variable day = new Variable(1998, 8, 24);
        System.out.println(day.year);
        System.out.println(day.month);
        System.out.println(day.day);
    }
}