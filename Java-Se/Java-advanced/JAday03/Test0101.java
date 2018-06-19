package JAday03;

import java.util.Scanner;

public class Test0101 {

	public static void main(String[] args) {
		try {
			TestExcetion();
		} catch (Exception ex) {
			System.out.println("程序报错了！");
			ex.printStackTrace();
		} finally {
			// 此处存放一定要执行的代码
			// 一般把释放资源的代码放到finally中
			// 文件关闭
			// 数据库连接关闭
			System.out.println("这里一般执行释放资源的代码");
			System.out.println("这里一般执行释放资源的代码");
			if(Math.random()>0.5){
				return;
			}
			System.out.println("这里一般执行释放资源的代码");
		}

	}

	public static void TestExcetion() throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		double a = Integer.parseInt(sc.next());
		double ds = 1.0 / a;
		System.out.println("ds" + ds);
        sc.close();
	}
}
