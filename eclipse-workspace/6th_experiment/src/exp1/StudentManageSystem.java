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
		// 简单的欢迎界面
		System.out.println("---------------------------------");
		System.out.println("\t" + "欢迎进入学生管理系统 ");
		System.out.println("---------------------------------");

		List<StudentH> list = new LinkedList<StudentH>();
		sc = new Scanner(System.in);
		int id = 0;
		try {
			while (true) {
				// 功能菜单界面，每次使用一个功能时，都会把功能菜单打印一次，便于使用者查询功能对应的数字
				System.out.println("功能菜单：");
				System.out.println("----------------------------------");
				System.out.println("1、查询所有学生信息");
				System.out.println("2、根据学号查询信息");
				System.out.println("3、增加学生信息");
				System.out.println("4、删除学生信息");
				System.out.println("5、修改学生信息");
				System.out.println("6、退出系统");
				System.out.println("(提示：为了您的使用方便，请在使用系统前，最大化控制台。)");
				System.out.println("----------------------------------");
				System.out.print("请输入对应的数字进行操作:");
				int input = sc.nextInt(); // 输入数字选择功能

				if (input > 0 && input < 7) { // 输入的数字在1-6时，能执行功能，否则系统退出
					System.out.println("---------------------------------");

					// 3、增加学生信息
					if (input == 3) {
						System.out.print("请输入你要添加几个学生信息：");
						int num = sc.nextInt();
						System.out.println("----------------------------------");
						for (int w = 0; w < num; w++) {
							System.out.println("请添加学生信息");
							System.out.println("----------------------------------");
							id++;
							System.out.print("请输入学生姓名：");
							String name = sc.next();
							System.out.print("请输入学生班级：");
							String classNum = sc.next();
							list.add(new StudentH(id, name, classNum));
							System.out.println("添加成功。");
							System.out.println("---------------------------------");
						}
					}

					// 1、查询所有学生信息
					if (input == 1) {
						if (list.isEmpty() == true) { // 判断集合内是否存在学生对象的信息
							System.out.println("您还没有添加学生信息。");
						} else {
							System.out.println("学生信息表");
							System.out.println("---------------------------------");
							for (int j = 0; j < list.size(); j++) {
								// 自然排序，实现了Comparable接口并重写了CompareTo方法才能调用此方法
								Collections.sort(list);
								// 比较排序，必须定义另外一个自定义的比较类，这里比较类的类名为MyComparator
								// Collections.sort(list, new MyComparator());
								System.out.println(list.get(j).toString());
							}
						}
						System.out.println("---------------------------------");
					}

					// 2、根据学号查询信息
					if (input == 2) {
						if (list.isEmpty() == true) {
							System.out.println("您还没有添加学生信息。");
						} else {
							System.out.print("请输入你要查找的学生学号：");
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
									System.out.println("没有该学生信息。");
									break;
								}
							}
						}
						System.out.println("---------------------------------");
					}

					// 4、删除学生信息
					if (input == 4) {
						if (list.isEmpty() == true) {
							System.out.println("您还没有添加学生信息。");
						} else {
							System.out.print("请输入你要删除的学生学号：");
							int index = sc.nextInt();
							List<Integer> listID = new ArrayList<Integer>();
							for (int c = 0; c < list.size(); c++) {
								listID.add(list.get(c).getId());
							}
							for (int q = 0; q < list.size(); q++) {
								if (listID.contains(index)) {
									if (index == list.get(q).getId()) {
										list.remove(q);
										System.out.println("删除成功。");
										break;
									} else {
										continue;
									}
								} else {
									System.out.println("没有该学生信息。");
									break;
								}
							}
						}
						System.out.println("---------------------------------");
					}

					// 5、修改学生信息
					if (input == 5) {
						if (list.isEmpty() == true) {
							System.out.println("您还没有添加学生信息。");
						} else {
							System.out.print("请输入你要修改的学生学号：");
							int index = sc.nextInt();
							List<Integer> listID = new ArrayList<Integer>();
							for (int c = 0; c < list.size(); c++) {
								listID.add(list.get(c).getId());
							}
							for (int q = 0; q < list.size(); q++) {
								if (listID.contains(index)) {
									if (index == list.get(q).getId()) {
										System.out.print("此学生原信息:");
										// 打印要修改的学生信息的原信息
										System.out.println(list.get(q).toString());
										System.out.println("请修改此学生信息：");
										System.out.println("----------------------------------");
										System.out.print("请重新输入学生姓名：");
										String name = sc.next();
										System.out.print("请重新输入学生班级：");
										String classNum = sc.next();
										list.remove(q); // 先删除该学生所有的信息
										id = index;
										// 重新添加该学生信息
										list.add(new StudentH(id, name, classNum));
										System.out.println("修改成功。");
										break;
									} else {
										continue;
									}

								} else {
									System.out.println("没有该学生信息。");
									break;
								}

							}
						}
						System.out.println("----------------------------------");
					}

					// 6、退出系统
					if (input == 6) {
						System.out.println("系统已退出，欢迎下次使用。。。");
						System.exit(0);
					}
				} else {
					System.out.println("----------------------------------");
					System.out.println("输入有误，系统退出。");
					System.exit(0);
				}
			}
			// 输入时，如果输入的不是数字，会捕捉InputMismatchException异常并提示“输入有误，系统退出”
		} catch (InputMismatchException e) {
			System.out.println("----------------------------------");
			System.out.println("输入有误，系统退出。");
		} catch (Exception e) {
			System.out.println("----------------------------------");
			System.out.println("其他错误。");
			e.printStackTrace();
		} finally {
			System.exit(0); // 退出系统
		}
	}
}