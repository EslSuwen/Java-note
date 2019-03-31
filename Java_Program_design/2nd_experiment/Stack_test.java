/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-04 20:01:27
 * @LastEditTime: 2019-03-26 09:23:27
 */
package exp2;
import java.util.Stack;
public class Stack_test {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(-5);
        s.push(27);
        System.out.println(s.peek());
        s.pop();
        s.push(35);
        System.out.println(s.peek());
        s.pop();
        s.push(-123);
        s.push(11);
        s.push(29);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        s.push(66);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
    }
}
