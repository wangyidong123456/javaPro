package Tjavabaseday0405;

public class Test05 {

	public static void main(String[] args) {
		String s = "abcde";

		// 原始做法
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println("---------");

		for (int x = 0; x < s.length(); x++) {
			System.out.println(s.charAt(x));
		}
		System.out.println("---------");
	}

}
