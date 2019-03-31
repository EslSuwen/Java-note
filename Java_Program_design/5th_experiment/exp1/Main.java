/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-26 09:16:42
 * @LastEditTime: 2019-03-27 10:41:29
 */

class Main {
    public static void main(String[] args) {
        AlarmDoor alarmDoor = new AlarmDoor();
        Car car = new Car("benzi", "black");
        alarmDoor.alarm();
        car.alarm();
    }
}