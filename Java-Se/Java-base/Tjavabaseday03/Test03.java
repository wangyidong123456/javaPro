package Tjavabaseday03;

public class Test03 {
	public static void printFlower() {
		for (int x = 100; x < 10000; x++) {
			int ge = x / 1 % 10;
			int shi = x / 10 % 10;
			int bai = x / 10 / 10 % 10;
			int t = x / 10 / 10 / 10 % 10;

			if ((ge * ge * ge + shi * shi * shi + bai * bai * bai + t * t * t) == x) {
				System.out.println(x);
			}
			if ((ge * ge * ge * ge + shi * shi * shi * shi + bai * bai * bai * bai + t * t * t * t) == x) {
				System.out.println(x);
			}
		}

	}

	public static void main(String[] args) {
		printFlower();
	}

}
