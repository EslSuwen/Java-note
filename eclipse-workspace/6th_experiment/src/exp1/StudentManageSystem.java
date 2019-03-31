package exp1;

/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-31 13:13:08
 * @LastEditTime: 2019-03-31 13:13:39
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentManageSystem {
	private static Scanner sc;

	public static void main(String[] args) {
		// �򵥵Ļ�ӭ����
		System.out.println("---------------------------------");
		System.out.println("\t" + "��ӭ����ѧ������ϵͳ ");
		System.out.println("---------------------------------");

		List<StudentH> list = new LinkedList<StudentH>();
		sc = new Scanner(System.in);
		int id = 0;
		try {
			while (true) {
				// ���ܲ˵����棬ÿ��ʹ��һ������ʱ������ѹ��ܲ˵���ӡһ�Σ�����ʹ���߲�ѯ���ܶ�Ӧ������
				System.out.println("���ܲ˵���");
				System.out.println("----------------------------------");
				System.out.println("1����ѯ����ѧ����Ϣ");
				System.out.println("2������ѧ�Ų�ѯ��Ϣ");
				System.out.println("3������ѧ����Ϣ");
				System.out.println("4��ɾ��ѧ����Ϣ");
				System.out.println("5���޸�ѧ����Ϣ");
				System.out.println("6���˳�ϵͳ");
				System.out.println("(��ʾ��Ϊ������ʹ�÷��㣬����ʹ��ϵͳǰ����󻯿���̨��)");
				System.out.println("----------------------------------");
				System.out.print("�������Ӧ�����ֽ��в���:");
				int input = sc.nextInt(); // ��������ѡ����

				if (input > 0 && input < 7) { // �����������1-6ʱ����ִ�й��ܣ�����ϵͳ�˳�
					System.out.println("---------------------------------");

					// 3������ѧ����Ϣ
					if (input == 3) {
						System.out.print("��������Ҫ��Ӽ���ѧ����Ϣ��");
						int num = sc.nextInt();
						System.out.println("----------------------------------");
						for (int w = 0; w < num; w++) {
							System.out.println("�����ѧ����Ϣ");
							System.out.println("----------------------------------");
							id++;
							System.out.print("������ѧ��������");
							String name = sc.next();
							System.out.print("������ѧ���༶��");
							String classNum = sc.next();
							list.add(new StudentH(id, name, classNum));
							System.out.println("��ӳɹ���");
							System.out.println("---------------------------------");
						}
					}

					// 1����ѯ����ѧ����Ϣ
					if (input == 1) {
						if (list.isEmpty() == true) { // �жϼ������Ƿ����ѧ���������Ϣ
							System.out.println("����û�����ѧ����Ϣ��");
						} else {
							System.out.println("ѧ����Ϣ��");
							System.out.println("---------------------------------");
							for (int j = 0; j < list.size(); j++) {
								// ��Ȼ����ʵ����Comparable�ӿڲ���д��CompareTo�������ܵ��ô˷���
								Collections.sort(list);
								// �Ƚ����򣬱��붨������һ���Զ���ıȽ��࣬����Ƚ��������ΪMyComparator
								// Collections.sort(list, new MyComparator());
								System.out.println(list.get(j).toString());
							}
						}
						System.out.println("---------------------------------");
					}

					// 2������ѧ�Ų�ѯ��Ϣ
					if (input == 2) {
						if (list.isEmpty() == true) {
							System.out.println("����û�����ѧ����Ϣ��");
						} else {
							System.out.print("��������Ҫ���ҵ�ѧ��ѧ�ţ�");
							int index = sc.nextInt();
							List<Integer> listID = new ArrayList<Integer>();
							for (int c = 0; c < list.size(); c++) {
								listID.add(list.get(c).getId());
							}
							for (int q = 0; q < list.size(); q++) {
								if (listID.contains(index)) {
									if (index == list.get(q).getId()) {
										System.out.println(list.get(q).toString());
										break;
									} else {
										continue;
									}
								} else {
									System.out.println("û�и�ѧ����Ϣ��");
									break;
								}
							}
						}
						System.out.println("---------------------------------");
					}

					// 4��ɾ��ѧ����Ϣ
					if (input == 4) {
						if (list.isEmpty() == true) {
							System.out.println("����û�����ѧ����Ϣ��");
						} else {
							System.out.print("��������Ҫɾ����ѧ��ѧ�ţ�");
							int index = sc.nextInt();
							List<Integer> listID = new ArrayList<Integer>();
							for (int c = 0; c < list.size(); c++) {
								listID.add(list.get(c).getId());
							}
							for (int q = 0; q < list.size(); q++) {
								if (listID.contains(index)) {
									if (index == list.get(q).getId()) {
										list.remove(q);
										System.out.println("ɾ���ɹ���");
										break;
									} else {
										continue;
									}
								} else {
									System.out.println("û�и�ѧ����Ϣ��");
									break;
								}
							}
						}
						System.out.println("---------------------------------");
					}

					// 5���޸�ѧ����Ϣ
					if (input == 5) {
						if (list.isEmpty() == true) {
							System.out.println("����û�����ѧ����Ϣ��");
						} else {
							System.out.print("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
							int index = sc.nextInt();
							List<Integer> listID = new ArrayList<Integer>();
							for (int c = 0; c < list.size(); c++) {
								listID.add(list.get(c).getId());
							}
							for (int q = 0; q < list.size(); q++) {
								if (listID.contains(index)) {
									if (index == list.get(q).getId()) {
										System.out.print("��ѧ��ԭ��Ϣ:");
										// ��ӡҪ�޸ĵ�ѧ����Ϣ��ԭ��Ϣ
										System.out.println(list.get(q).toString());
										System.out.println("���޸Ĵ�ѧ����Ϣ��");
										System.out.println("----------------------------------");
										System.out.print("����������ѧ��������");
										String name = sc.next();
										System.out.print("����������ѧ���༶��");
										String classNum = sc.next();
										list.remove(q); // ��ɾ����ѧ�����е���Ϣ
										id = index;
										// ������Ӹ�ѧ����Ϣ
										list.add(new StudentH(id, name, classNum));
										System.out.println("�޸ĳɹ���");
										break;
									} else {
										continue;
									}

								} else {
									System.out.println("û�и�ѧ����Ϣ��");
									break;
								}

							}
						}
						System.out.println("----------------------------------");
					}

					// 6���˳�ϵͳ
					if (input == 6) {
						System.out.println("ϵͳ���˳�����ӭ�´�ʹ�á�����");
						System.exit(0);
					}
				} else {
					System.out.println("----------------------------------");
					System.out.println("��������ϵͳ�˳���");
					System.exit(0);
				}
			}
			// ����ʱ���������Ĳ������֣��Ჶ׽InputMismatchException�쳣����ʾ����������ϵͳ�˳���
		} catch (InputMismatchException e) {
			System.out.println("----------------------------------");
			System.out.println("��������ϵͳ�˳���");
		} catch (Exception e) {
			System.out.println("----------------------------------");
			System.out.println("��������");
			e.printStackTrace();
		} finally {
			System.exit(0); // �˳�ϵͳ
		}
	}
}