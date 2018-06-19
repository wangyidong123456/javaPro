package miniGame;

import java.util.Random;
import java.util.Scanner;
public class FingerGuessingGame {
	// 编写一个猜拳游戏，玩家进入后可以选择游戏模式
	// 模式1 可以玩20次0
	// 模式2 可以一直玩到输20次为止
	// 游戏结束，统计输赢平局次数
	// 游戏结束，显示玩家的积分(赢得次数*10)
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("欢迎您进入猜拳游戏! \n请选择游戏模式：\n模式1 可以玩20次(输入1);\n模式2 可以一直玩到输20次为止(输入2)");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			game1();
			break;
		case 2:
			game2();
			break;
		default:
			System.out.println("输入错误请重新输入！");
		}
	}

	private static void game1() {
		// arr[0] 赢次数 arr[1] 输次数 arr[2]平局次数
		int arr[] = new int[3];
		System.out.println("欢迎您进入猜拳游戏.模式1,您可以猜拳20次");
		for (int a = 1; a < 21;) {
			System.out.println("输入1为布,输入2为剪刀,输入3为石头。第" + a + "次请出拳");
			// 玩家出拳
			int i = sc.nextInt();
			if (i >= 1 && i <= 3) {
				a++;
			}
			game(i,arr);
		}
		System.out.println("游戏结束! 谢谢参与！");
		// 游戏结束，统计输赢平局次数
		System.out.println("赢次数为" + arr[0] + " 输次数为" + arr[1] + " 平局次数为" + arr[2]);
		// 游戏结束，显示玩家的积分(赢得次数*10)
		System.out.println("您的积分为" + arr[0] * 10);
	}

	private static void game2() {
		// arr[0] 赢次数 arr[1] 输次数 arr[2]平局次数
		int arr[] = new int[3];
		System.out.println("欢迎您进入猜拳游戏.模式2,您可以一直玩到输20次为止");
		for (int a = 1; arr[1] < 20;) {
			System.out.println("输入1为布,输入2为剪刀,输入3为石头。第" + a + "次请出拳");
			// 玩家出拳
			int i = sc.nextInt();
			if (i >= 1 && i <= 3) {
				a++;
			}
			game(i,arr);
		}
		System.out.println("游戏结束! 谢谢参与！");
		// 游戏结束，统计输赢平局次数
		System.out.println("赢次数为" + arr[0] + " 输次数为" + arr[1] + " 平局次数为" + arr[2]);
		// 游戏结束，显示玩家的积分(赢得次数*10)
		System.out.println("您的积分为" + arr[0] * 10);
	}
	private static void game(int i,int arr []) {
		Random r = new Random();
		// 电脑出拳
		int num = r.nextInt(3) + 1;
		// 猜拳结果
		switch (i) {
		case 1:
			if (num == 1) {
				System.out.println("出布猜拳结果：电脑出布,平局");
				arr[2]++;
			} else if (num == 2) {
				System.out.println("出布猜拳结果：电脑出剪刀,输了");
				arr[1]++;
			} else if (num == 3) {
				System.out.println("出布猜拳结果：电脑出石头,赢了");
				arr[0]++;
			}
			break;
		case 2:
			if (num == 1) {
				System.out.println("出布猜拳结果：电脑出布,赢了");
				arr[0]++;
			} else if (num == 2) {
				System.out.println("出布猜拳结果：电脑出剪刀,平局");
				arr[2]++;
			} else if (num == 3) {
				System.out.println("出布猜拳结果：电脑出石头,输了");
				arr[1]++;
			}
			break;
		case 3:
			System.out.println("出石头猜拳结果 3");
			if (num == 1) {
				System.out.println("出布猜拳结果：电脑出布,输了");
				arr[1]++;
			} else if (num == 2) {
				System.out.println("出布猜拳结果：电脑出剪刀,赢了");
				arr[0]++;
			} else if (num == 3) {
				System.out.println("出布猜拳结果：电脑出石头,平局");
				arr[2]++;
			}
			break;
		default:
			System.out.println("输入错误请重新输入！");
		}
	}



}
