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
