package Test03;

import java.util.Random;
import java.util.Scanner;

public class Test0701 {

	public static void main(String[] args) {
		/**
		 * @ClassName: RandomTest
		 * @Description: 系统产生一个1-100之间的随机数，请猜出这个数据是多少。
		 * @date 2017年10月12日 下午5:19:58 Company www.igeekhome.com
		 * 
		 *       猜数字小游戏案例 系统产生一个1-100之间的随机数，请猜出这个数据是多少。 分析： A:系统产生一个随机数1-100之间的。
		 *       int number = r.nextInt(100) + 1; B:键盘录入我们要猜的数据 用Scanner实现
		 *       C:比较这两个数据(用if语句) 大了：给出提示大了 小了：给出提示小了 猜中了：给出提示，恭喜你，猜中了
		 *       D:多次猜数据，而我们不知道要猜多少次，怎么办呢? while(true) {循环的内容}
		 */
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		int usenumber;
		boolean gameOver = false;
		for (; gameOver == false;) {
			System.out.println("请输入一个数字在（0-100之间）");
			usenumber = sc.nextInt();
			if (usenumber > 100 || usenumber < 0) {
				System.out.println("输入错误请重新输入");
			} else if (number == usenumber) {
				System.out.println("恭喜你猜中了");
				gameOver = true;
			} else if (number > usenumber) {
				System.out.println("猜小了");
			} else {
				System.out.println("猜大了");
			}

		}
		sc.close();
	}

}