package Tjavabaseday0405;

public class Test09 {

	public static void main(String[] args) {
		/*
		* ȥ���ַ������˿ո�	
		*		String trim()
		* ����ָ�����ŷָ��ַ���	
		*		String[] split(String str)
		*/

		String s1 = "helloworld";
		String s2 = "  helloworld  ";
		String s3 = "  hello  world  ";
		System.out.println("---"+s1+"---");
		System.out.println("---"+s1.trim()+"---");
		System.out.println("---"+s2+"---");
		System.out.println("---"+s2.trim()+"---");
		System.out.println("---"+s3+"---");
		System.out.println("---"+s3.trim()+"---");
		System.out.println("-------------------");

		//String[] split(String str)
		//�����ַ�������
		String s4 = "aa,bb,c,cd,de";
		System.out.println(s4.length());
		char[] ch = s4.toCharArray();
		for(int x=0; x<ch.length; x++) {
			System.out.println(ch[x]);
		}
		String[] strArray = s4.split(",");
		for(int x=0; x<strArray.length; x++) {
			System.out.println(strArray[x]);
		}

	}

}
