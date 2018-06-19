package JAday0305;

public class Test05 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		// 运行垃圾回收器
		System.gc();
		{
			int b = 10;
			System.out.println(b);
		}
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.exit(1);
				// return;
			}
			System.out.println(i);
		}
		System.out.println("-------------");

	}
}
