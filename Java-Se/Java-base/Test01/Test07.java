package Test01;

public class Test07 {
	public static void main(String[] args) {
		int[] myArray = new int[] { 1, 2, 3 };
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		myArray = new int[6];
		System.out.println(myArray.length);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);

		}
		Integer x1 = 5;
		int x3 = new Integer(5);
		System.out.println(x3);
		System.out.println(x1 == x3);
		System.out.println(x1.equals(x3));
		int[] x = { 1, 2, 3 };
		x[1] = (x[1] > 1) ? x[2] : 0;
		System.out.println(x[1]);

		int i = 5;
		System.out.print("4" + i + "");
		System.out.print(i + 5 + "7");
		System.out.println(i + "8");

		while (++i < 4) {
			--i;
		}
		System.out.println(i);
		boolean xx = true;
		boolean y = false;
		short z = 20;

		if ((xx == true) && (y = true))
			z++;
		if ((y == true) || (++z == 22))
			z++;
		System.out.println(z);

		int a = 0;
		int b = 4;
		for (int c = 0; c < 3; c++, a++) {
			if (a > 1 & ++b < 10)
				b++;
		}
		System.out.println(b);
	}

}
