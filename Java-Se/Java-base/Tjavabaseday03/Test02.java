package Tjavabaseday03;

public class Test02 {
	public static void printNumber(int n) {
		for (int x = 1; x <= n; x++) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		printNumber(2);
		System.out.println("-------------------");
		printNumber(5);
	}

}
