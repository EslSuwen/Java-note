/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-04-08 18:37:05
 * @LastEditTime: 2019-04-08 18:40:11
 */

//java ���߳�ʵ��
//ʵ��Ŀ��
//�̳�Thread��
//����run����
//���������ʱ������̶߳���
//����start���������߳�
//run��������Ĵ������������߳�Ҫִ�еķ�����

class Demo extends Thread {
    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "<----->" + name + "<----->" + i);
        }
    }

}

public class Thread_test {
    // �����߳������У�main(���߳�),Thread-1�߳�,Thread-0�߳�
    public static void main(String[] args) {

        Demo d1 = new Demo("A");// ����֮���߳̾ͱ�������
        Demo d2 = new Demo("B");
        // start�������������£������̣߳�����run����
        d1.start();
        d2.start();
        for (int i = 0; i < 10; i++) {
            // ���߳����еķ�������main
            System.out.println("��ӡ��ǰ�������е��߳�" + Thread.currentThread().getName());
        }

    }

}