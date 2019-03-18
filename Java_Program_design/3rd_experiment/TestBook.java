/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-11 19:20:43
 * @LastEditTime: 2019-03-11 19:24:20
 */
public class TestBook {
    public static void main(String[] args) {
        Book p1 = new Book("Love", 17.8, "CQ");
        Book p2 = new Book("Peace", 15.2, "CQ");
        Book p3 = new Book();
        Book[] Books = new Book[] { p1, p2, p3 };
        for (Book each : Books) {
            each.info();
        }
    }
}