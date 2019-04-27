/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-04-17 19:33:28
 * @LastEditTime: 2019-04-18 19:37:41
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.*;

public class Window {
    public static void main(String args[]) {
        new Windows();
    }
}

class Windows extends JFrame implements Runnable, ActionListener {
    private static final long serialVersionUID = 1L;
    JButton connection, send;
    JTextField inputText1;
    JTextField inputText2;
    JTextArea showResult;
    Socket socket;
    DataInputStream in; // ����������
    DataOutputStream out;
    Thread thread;

    public Windows() {
        socket = new Socket();
        connection = new JButton("���ӷ�����");
        send = new JButton("����");
        send.setEnabled(false);

        inputText1 = new JTextField(6);
        inputText2 = new JTextField(6);
        showResult = new JTextArea();
        add(connection, BorderLayout.NORTH);
        JPanel p = new JPanel();
        p.add(new JLabel("�����볤���εĳ��Ϳ�"));
        p.add(inputText1);
        p.add(inputText2);
        p.add(send);
        add(new JScrollPane(showResult), BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);
        connection.addActionListener(this);
        send.addActionListener(this);
        thread = new Thread();
        setBounds(10, 30, 460, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == connection) {
            try {
                if (socket.isConnected()) {
                } else {
                    InetAddress address = InetAddress.getByName("localhost");
                    InetSocketAddress socketAddress = new InetSocketAddress(address, 4331);
                    socket.connect(socketAddress);
                    in = new DataInputStream(socket.getInputStream());
                    out = new DataOutputStream(socket.getOutputStream());
                    send.setEnabled(true);
                    if (!(thread.isAlive()))
                        thread = new Thread(this);
                    thread.start();
                }
            } catch (IOException ee) {
                System.out.println(ee);
                socket = new Socket();
            }
        }
        if (e.getSource() == send) {
            String s1 = inputText1.getText();
            String s2 = inputText2.getText();
            double r1 = Double.parseDouble(s1);
            double r2 = Double.parseDouble(s2);
            try {
                out.writeDouble(r1);
                out.writeDouble(r2);
            }

            catch (IOException e1) {
            }

        }

    }

    public void run() {
        String s;
        while (true) {
            try {
                s = in.readUTF();
                showResult.append("\n" + s);

            } catch (IOException e) {
                showResult.setText("��������ѶϿ�" + e);
                socket = new Socket();
                break;
            }
        }
    }

}
