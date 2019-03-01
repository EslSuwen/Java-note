/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2019-02-26 17:54:45
 * @LastEditTime: 2019-03-01 15:53:06
 */
package exp1;

public class CarApplication {
	   public static void main(String[] arguments) {
	    Car car1=new Car();
	    car1.speed=100;
	    car1.showSpeed();
	    car1.speedUp(10);
	    car1.showSpeed();
	    }

}
