
/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-31 15:55:40
 * @LastEditTime: 2019-03-31 15:57:28
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalcListener implements ActionListener {
    private JTextField jtf;
    // 创建字符缓冲区域
    String content = "";
    private StringBuffer sb = new StringBuffer();

    public CalcListener(JTextField jtf) {
        this.jtf = jtf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
        // case同时写多个条件，数字的基本处理
        case "1":
        case "2":
        case "3":
        case "4":
        case "5":
        case "6":
        case "7":
        case "8":
        case "9":
        case "0":
        case ".":
        case "+":
        case "-":
        case "*":
        case "/":
        case "%":
            sb.append(command);
            jtf.setText(sb.toString().trim());
            break;

        // 清空输入框中内容
        case "C":
        case "CE":
            // 清空StringBuffer
            sb.setLength(0);
            jtf.setText("0");
            break;

        // 退格
        case "←":
            break;

        // 四则运算处理 处理两个运算符问题两个点
        case "=":
            String content = jtf.getText();
            if (content.contains("+")) {
                String[] string = content.split("\\+");
                String frist = string[0];
                String next = string[1];
                double result = Double.valueOf(frist) + Double.valueOf(next);
                jtf.setText(String.valueOf(result));
            } else if (content.contains("-")) {
                String[] string = content.split("-");
                String frist = string[0];
                String next = string[1];
                double result = Double.valueOf(frist) - Double.valueOf(next);
                jtf.setText(String.valueOf(result));
            } else if (content.contains("*")) {
                String[] string = content.split("\\*");
                String frist = string[0];
                String next = string[1];
                double result = Double.valueOf(frist) * Double.valueOf(next);
                jtf.setText(String.valueOf(result));
            } else if (content.contains("/")) {
                String[] string = content.split("\\/");
                String frist = string[0];
                String next = string[1];
                double result = Double.valueOf(frist) / Double.valueOf(next);
                jtf.setText(String.valueOf(result));
            } else if (content.contains("%")) {
                String[] string = content.split("\\%");
                String frist = string[0];
                String next = string[1];
                double result = Double.valueOf(frist) % Double.valueOf(next);
                jtf.setText(String.valueOf(result));
            }
            break;
        }
    }
}