package Tjavabaseday0405;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 需求:模拟登录,给三次机会,并提示还有几次
		String username = "admin";
		String password = "admin";
		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();
			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("登陆成功");
				break;
			} else {
				if (x == 0) {
					System.out.println("对不起用户名或者密码错误，请重新输入，还有两次机会。");
				} else if (x == 1) {
					System.out.println("对不起用户名或者密码错误，请重新输入，还有一次机会。");
				} else if (x == 2) {
					System.out.println("用户名和密码被锁定，请与管理员联系");
				}
			}
			sc.close();

		}

	}
}
