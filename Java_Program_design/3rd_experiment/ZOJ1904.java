
/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen HS\n
 * @Date: 2019-03-11 20:03:58
 * @LastEditTime: 2019-03-11 21:03:22
 */
import java.math.*;
public class ZOJ1113 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (scanner.hasNext()) {
            String[] a = scanner.nextLine().split(" ");
            double D = Double.valueOf(a[0]);
            double V = Double.valueOf(a[1]);
            if (D == 0 && V == 0)
                break;
            double x = Math.log((Math.PI * D * D * D / 6 - V) / Math.PI * 6);
            double y = x / 3;
            double z = Math.exp(y);
            System.out.println(String.format("%.3f",z));
        }
        scanner.close();
    }
}