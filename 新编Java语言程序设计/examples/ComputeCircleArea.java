/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2018-08-31 21:32:35
 * @LastEditTime: 2019-03-01 21:56:19
 */
package examples;

import java.util.*;

public class ComputeCircleArea {
	public static void main(String[] args) {
		double radius, area;
		final double PI = 3.1415926;
		System.out.print("请输入圆的半径: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		input.close();
		area = radius * radius * PI;
		System.out.println("半径为: " + radius + "\n圆的面积是: " + area);
		System.out.println(" wtf");
	}
}