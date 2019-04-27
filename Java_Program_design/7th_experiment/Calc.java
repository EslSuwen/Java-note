
/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-31 15:54:10
 * @LastEditTime: 2019-04-13 08:28:38
 */
import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calc extends JFrame {
    private static final long serialVersionUID = 1L;

    private void initFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setSize(300, 400);
        this.setTitle("SIMPLE_CALC");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        // JTextField调用方法时传递
        JTextField jtf = this.topSurface();
        this.bottomSurface(jtf);
        this.setVisible(true);
    }

    private JTextField topSurface() {
        JPanel topPanel = new JPanel();
        topPanel.setBounds(-5, 10, 300, 50);
        JTextField jtf = new JTextField(16);
        // 设置文件右边往左边输出
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        jtf.setForeground(Color.red);
        jtf.setFont(new Font("SansSerif", Font.PLAIN, 20));
        jtf.setEditable(false);
        jtf.setText("0");
        topPanel.add(jtf);
        this.add(topPanel);
        return jtf;
    }

    private void bottomSurface(JTextField jtf) {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(8, 80, 270, 250);
        bottomPanel.setLayout(new GridLayout(5, 4, 1, 1));

        String[] buttonValue = { "1", "2", "3", "C", "4", "5", "6", "CE", "7", "8", "9", "←", "+", "-", "0", ".", "*",
                "/", "%", "=" };
        // 监听器不能重复创建
        CalcListener cl = new CalcListener(jtf);
        for (int i = 0; i < buttonValue.length; i++) {
            JButton button = new JButton(buttonValue[i]);
            button.setBorder(BorderFactory.createRaisedBevelBorder());
            button.setFont(new Font("宋体", 0, 25));
            button.setForeground(Color.blue);
            bottomPanel.add(button);
            button.addActionListener(cl);
        }

        this.add(bottomPanel);
    }

    /**
     * =============================计算器分割线========================================
     **/
    // 定义自己的画笔，把paint方法的Graphics对象强转为自定义画笔
    private Graphics2D g;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.g = (Graphics2D) g;
        this.g.setStroke(new BasicStroke(3));
        this.g.setColor(new Color(18, 18, 9));
        this.g.drawLine(0, 95, this.getWidth(), 95);
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.initFrame();
    }
}