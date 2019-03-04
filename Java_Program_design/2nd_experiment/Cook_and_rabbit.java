
/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen \n
 * @Date: 2019-03-04 20:13:09
 * @LastEditTime: 2019-03-04 20:24:33
 */
import java.util.Scanner;

class Cook_and_rabbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nFeet = scanner.nextInt();
        int x, y;
        for (x = 0; x < nFeet; x++) {
            y=(int)(nFeet-2*x)/4;
            if(x*2+y*4==nFeet&&x>=0&&y>=0)
            System.out.println("鸡有"+x+"只,"+"兔子有"+y+"只。");
        }
        scanner.close();
    }
}