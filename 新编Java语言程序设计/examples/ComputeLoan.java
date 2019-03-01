/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2018-08-31 21:32:34
 * @LastEditTime: 2019-03-01 16:01:31
 */
package examples;
import java.util.*;
public class ComputeLoan {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������������ ��Ʃ�磺5.0 ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate/1200;
		System.out.println("���������������Ʃ�磺10 ");
		int numberOfYears = input.nextInt();
		System.out.println("�������ܴ����Ʃ�磺200000.0 ");
		double loanAmout = input.nextDouble();
		double monthlyPayment = loanAmout * monthlyInterestRate/(1-1/Math.pow(monthlyInterestRate+1,numberOfYears * 12));
		System.out.print("��֧����Ϊ��" + (int)(monthlyPayment * 100)/100.0);
		input.close();
	}
}
