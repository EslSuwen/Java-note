/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-26 09:10:15
 * @LastEditTime: 2019-03-26 09:13:38
 */
abstract class Door{
    public double height;
    public double width;
    public void open(){
        System.out.println("open");
    }
    public void close(){
        System.out.println("close");
    }
}