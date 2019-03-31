/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-25 18:50:16
 * @LastEditTime: 2019-03-31 12:17:14
 */
class Car extends Vehicle implements Alarm {
    Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void alarm() {
        System.out.println("diiiiiiiiii");
    }
}
