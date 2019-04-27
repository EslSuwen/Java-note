/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-04-13 10:24:45
 * @LastEditTime: 2019-04-14 09:11:11
 */
public class Test {
    public static void main(String[] args) {
        int number = 0;
        int[] numbers = new int[1];
        m(number, numbers);
        System.out.print("number is " + number);
        System.out.println(", and numbers[0] is " + numbers[0]);
    }
    public static void m(int x, int[] y) {
        x = 3;
        y[0] = 3656;
    }
}
