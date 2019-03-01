/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2018-08-31 21:32:32
 * @LastEditTime: 2019-03-01 16:00:00
 */
package examples;
import javax.swing.*;
public class ComputeLoanUsingInputDialog {
	public static void main (String[] args) {
		String annualInterestRateString = JOptionPane.showInputDialog("请输入年利率 ，譬如：5.0 ");
		String numberOfYearsString = JOptionPane.showInputDialog("请输入贷款年数，譬如：10 ");
		String loanAmoutString = JOptionPane.showInputDialog("请输入总贷款金额，譬如：200000.0 ");
		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		double monthlyInterestRate = annualInterestRate/1200;
		int numberOfYears = Integer.parseInt(numberOfYearsString);
		double loanAmout = Double.parseDouble(loanAmoutString);
		double monthlyPayment = loanAmout * monthlyInterestRate/(1-1/Math.pow(monthlyInterestRate+1,numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		JOptionPane.showMessageDialog(null, "月支付额为：" + (int)(monthlyPayment * 100)/100.0 + "\n总支付额为：" + (int)(totalPayment * 100)/100.0);
	}
}
