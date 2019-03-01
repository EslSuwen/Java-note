/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2018-08-31 21:29:46
 * @LastEditTime: 2019-03-01 15:43:23
 */

public class TwoNumber {
	private int num1=100,num2=10;
	public TwoNumber() {
		System.out.println("num1= "+num1+",num2= "+num2);
	}
	public void twoNumberAdd() {
		System.out.println("num1+num2= "+ (num1 +num2));
	}
	public void twoNumberMinus() {
		System.out.println("num1-num2= " + (num1-num2));
	}
	public void twoNumberMultiply() {
		System.out.println("num1*num2= " + num1*num2);
	}
	public void twoNumberDivide() {
		System.out.println("num1/num2= " + num1/num2);
		javax.swing.JOptionPane.showMessageDialog(null, "num1/num2= " + num1/num2);
	}
	public static void main(String[] args) {
		TwoNumber twoNum1= new TwoNumber();
		twoNum1.twoNumberAdd();
		twoNum1.twoNumberMinus();
		twoNum1.twoNumberMultiply();
		twoNum1.twoNumberDivide();
		TwoNumber twoNum2= new TwoNumber();
		twoNum2.twoNumberAdd();
		twoNum2.twoNumberMinus();
		twoNum2.twoNumberMultiply();
		twoNum2.twoNumberDivide();
	}
	
}
