package Tjavabaseday0502;


import java.util.ArrayList;
import java.util.Scanner;

import Tjavabaseday0502.Student;

public class StudentSevice {



	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		StudentDao stuDao=new StudentDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------欢迎来到学生管理系统-----------");
		// 为了让程序能够回到这里来，我们使用循环
		boolean isContinue = true;
		while (isContinue) {
			// 这是学生管理系统的主界面
			System.out.println("1、查找学生信息");
			System.out.println("2、查看所有学生信息");
			System.out.println("3、添加学生信息");
			System.out.println("4、删除学生信息");
			System.out.println("5、修改学生信息");
			System.out.println("6、退出本系统");
			System.out.println("请输入你的选择：");
			// 创建键盘录入对象
			String choiceString = sc.nextLine();
			// 用switch语句实现选择
			switch (choiceString) {
			case "1":
				// 查找学生信息
				stuDao.findDataId(students,sc);
				break;
			case "2":
				// 查看所有学生
				stuDao.outputDataAll(students);
				break;
			case "3":
				// 添加学生
				stuDao.addData(students,sc);
				break;
			case "4":
				// 删除学生
				stuDao.deleteData(students,sc);
				break;
			case "5":
				// 修改学生
				stuDao.modifyData(students,sc);
				break;
			case "6":
				isContinue = false;
				System.out.println("谢谢使用本系统！");
				break;
			// 退出;
			// System.out.println("谢谢你的使用");
			// break;
			default:
				System.out.println("输入数据无效，请重新输入");
				break;
			}

		}
	}

}
