package Test03;

import java.util.Random;

public class Test08 {

	public static void main(String[] args) {
		Random r = new Random();

		int[] intArr = new int[10];
		for (int x = 0; x < 10; x++) {
			int number = r.nextInt(100);
			intArr[x] = number;
			System.out.println("intArr[" + x + "]=" + intArr[x]);
		}

	}

}
