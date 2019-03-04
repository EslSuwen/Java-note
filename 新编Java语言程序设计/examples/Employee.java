/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2018-08-31 21:32:31
 * @LastEditTime: 2019-03-01 21:56:59
 */
package examples;

public class Employee {
	public String name;
	private double salary;

	public Employee(String empName) {
		name = empName;
	}

	public void setSalary(double empSal) {
		salary = empSal;
	}

	public void printEmp() {
		System.out.println("name : " + name + ", salary :" + salary);
	}

	public static void main(String[] args) {
		Employee empOne = new Employee("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
}
