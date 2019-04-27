/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-04-17 19:32:59
 * @LastEditTime: 2019-04-17 19:39:44
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[]){
		ServerSocket server = null;
		//ServerThread thread;
		Socket you = null;
		while(true){
			try{
				server = new ServerSocket(4331);
			}
			catch(IOException e1){
				System.out.println("���ڼ���");
			}
			try{
				System.out.println("�ȴ��ͻ�����");
				you = server.accept();
				System.out.println("�ͻ��ĵ�ַ��"+you.getInetAddress());

			}catch(IOException e){
				System.out.println("���ڵȴ��ͻ�");
			}
			if(you!=null){
				new ServerThread(you).start();
			}
		}
	}
}
	class ServerThread extends Thread{
		Socket socket;
		DataOutputStream out;
		DataInputStream in;
		String s;
		ServerThread(Socket t){
			socket = t;
			try{
				out = new DataOutputStream(socket.getOutputStream());
				in = new DataInputStream(socket.getInputStream());

			}catch(IOException e){}

		}
		public void run()
		{
			while(true){
				try{
					double s1 = in.readDouble();
					double s2 = in.readDouble();
					double area = s1*s2;
					out.writeUTF("��"+s1+"��"+s2+"�ĳ���������"+area);

				}
				catch (IOException e){
					System.out.println("�ͻ��뿪");
					return;
				}
			}
		}
	}
