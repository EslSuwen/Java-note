/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-04-14 09:11:34
 * @LastEditTime: 2019-04-14 09:58:25
 */
package chapter10;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame implements FocusListener {
    private static final long serialVersionUID = 1L;
    JTextField value1, value2, sum;
    JLabel plus, equals;

    Calculator() {
        super("Add Two Numbers");
        setSize(350, 90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        setLayout(flow);
        // create components
        value1 = new JTextField("0", 5);
        plus = new JLabel("+");
        value2 = new JTextField("0", 5);
        equals = new JLabel("=");
        sum = new JTextField("0", 5);
        // add listeners
        value1.addFocusListener(this);
        value2.addFocusListener(this);
        // set up sum field
        sum.setEditable(false);
        // add components
        add(value1);
        add(plus);
        add(value2);
        add(equals);
        add(sum);
        setVisible(true);
    }

    // 演示产生异常的情形：两个文本框中本来均为数字，将其中一个
    // 文本框中的内容改成aaa，产生异常并将文本框的值置为0
    public void focusGained(FocusEvent event) {
        try {
            float total = Float.parseFloat(value1.getText()) + Float.parseFloat(value2.getText());
            sum.setText("" + total);
        } catch (NumberFormatException nfe) {
            value1.setText("0");
            value2.setText("0");
            sum.setText("0");
        }
    }

    public void focusLost(FocusEvent event) {
        focusGained(event);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system " + "look and feel: " + exc);
        }
    }

    public static void main(String[] arguments) {
        Calculator frame = new Calculator();
    }
}
