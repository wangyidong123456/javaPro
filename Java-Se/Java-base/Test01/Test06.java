package Test01;

public class Test06 {
	static class Banana2 {
		static int x = 5;

		public static void main(String[] args) {
			int x = 2;
			Banana2 b = new Banana2();
			b.go(x);
		}

		static {
			x += x;
		}

		void go(int x) {
			++x;
			System.out.println(x);

		}
	}
}