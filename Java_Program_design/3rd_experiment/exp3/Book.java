/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-11 19:16:44
 * @LastEditTime: 2019-03-11 19:20:38
 */
public class Book {
    private String name;
    private double price;
    private String experss;

    Book() {
    }

    Book(String name, double price, String experss) {
        this.name = name;
        this.price = price;
        this.experss = experss;
    }

    public void info() {
        System.out.println("Name:" + name + "Price:" + price + "Express:" + experss);
    }
}