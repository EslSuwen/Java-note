/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2018-08-31 16:07:02
 * @LastEditTime: 2019-03-01 17:11:13
 */
package examples;
import java.util.*;  //����Java��
public class SalesTax {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("�����빺����: ");
		double purchaseAmount = input.nextDouble();
		input.close();   //�ر�����
		double tax = purchaseAmount * 0.06;
		System.out.println("Ӫҵ˰Ϊ�� " + (int)(tax*100)/100.0);//������λС��
	}
}
