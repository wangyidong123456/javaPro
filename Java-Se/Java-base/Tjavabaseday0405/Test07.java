package Tjavabaseday0405;

public class Test07 {

	public static void main(String[] args) {
	     String s = "abcde";
		
		//char[] toCharArray():把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for(int x=0; x<chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("-----------");
		
		//String toLowerCase():把字符串转换为小写字符串
		System.out.println("HelloWorld".toLowerCase());
		//String toUpperCase():把字符串转换为大写字符串
		System.out.println("HelloWorld".toUpperCase());

	}

}
