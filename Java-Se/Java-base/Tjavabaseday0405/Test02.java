package Tjavabaseday0405;

public class Test02 {

	public static void main(String[] args) {
		String s11 = new String("hello");
		String s22 = "hello";//�������ĳ�����
		
		System.out.println("s1:"+s11);
		System.out.println("s2:"+s22);
		
		System.out.println("s1==s2:"+(s11==s22)); //false
		
		String s33 = "hello";//�������ĳ�����
		System.out.println("s1==s3:"+(s11==s33)); //false
		System.out.println("s2==s3:"+(s22==s33)); //true

		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		//boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("-----------");
		
		//boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("-----------");
		
		//boolean startsWith(String str):�ж��ַ��������Ƿ���ָ����str��ͷ
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.startsWith("ll"));

	}

}
