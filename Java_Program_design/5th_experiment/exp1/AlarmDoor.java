/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-26 09:14:32
 * @LastEditTime: 2019-03-26 09:28:53
 */


class AlarmDoor extends Door implements Alarm {
    @Override
    public void alarm() {
        System.out.println("ddddd");
    }
}