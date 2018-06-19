package Tjavabaseday03;

public class Test10 {

	public static void main(String[] args) {
		// 定义变量
		int n = 10;
		int m = 20;
		System.out.println("n:" + n + ",m:" + m);// a:10,b:20
		change(n, m);
		System.out.println("n:" + n + ",m:" + m);// a:10,b:20
	}

	/**
	 * @Title: change
	 * @Description: 改变形参的值
	 * @param a
	 * @param b
	 */
	public static void change(int a, int b) { // a=10,b=20
		System.out.println("a:" + a + ",b:" + b);// a:10,b:20
		a = b; // a=20;
		b = a + b; // b=40;
		System.out.println("a:" + a + ",b:" + b);// a:20,b:40

	}

}
