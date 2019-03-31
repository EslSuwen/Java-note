/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-25 18:48:03
 * @LastEditTime: 2019-03-26 09:18:55
 */

abstract class Vehicle {
    public String brand;
    public String color;

    Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void run() {
        System.out.println("run");
    }

}