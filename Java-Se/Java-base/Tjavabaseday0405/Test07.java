package Tjavabaseday0405;

public class Test07 {

	public static void main(String[] args) {
	     String s = "abcde";
		
		//char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		char[] chs = s.toCharArray();
		for(int x=0; x<chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("-----------");
		
		//String toLowerCase():���ַ���ת��ΪСд�ַ���
		System.out.println("HelloWorld".toLowerCase());
		//String toUpperCase():���ַ���ת��Ϊ��д�ַ���
		System.out.println("HelloWorld".toUpperCase());

	}

}
