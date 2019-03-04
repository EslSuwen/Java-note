/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2019-02-26 17:54:45
 * @LastEditTime: 2019-03-01 20:43:49
 */
// package exp1;

public class Car {
	int speed;
    void speedUp(int s){
        speed+=s;
    }
    void speedDown(int s){
        speed-=s;
    }
    void showSpeed(){
        System.out.println("speed is "+speed);
    }
}
