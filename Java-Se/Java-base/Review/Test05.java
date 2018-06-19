package Review;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
//		boolean bl = true;
		for (; i<100000;) {
			i++;
			if (i % 2 == 1 && i % 3 == 2 && i % 4 == 3 && i % 5 == 4 && i % 6 == 5 && i % 7 == 0) {
//				bl = false;
				System.out.println(i);
			}
		}
//		System.out.println(i);
	}

}
