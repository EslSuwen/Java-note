package examples;
import java.util.*;  
public class ComputeCircleArea {
	public static void main(String[] args) {
		double radius,area;
		final double PI=3.1415926;
		System.out.print("������Բ�İ뾶: ");
		Scanner input=new Scanner(System.in);
		radius=input.nextDouble();
		input.close();
		area=radius*radius*PI;
		System.out.println("�뾶Ϊ: " + radius + "\nԲ�������: " + area);
		System.out.println(" wtf");
	}			
}