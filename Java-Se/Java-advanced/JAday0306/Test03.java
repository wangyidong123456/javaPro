package JAday0306;

import java.util.regex.Pattern;

public class Test03 {

	public static void main(String[] args) {
//		�ַ��� 
//		[abc] a��b �� c�����ࣩ 
		System.out.println("--------[abc]---------");
		System.out.println(Pattern.matches("[a.b]", "a"));
		System.out.println(Pattern.matches("[a.b]", "b"));
		System.out.println(Pattern.matches("[a.b]", ".a"));	
//		[^abc] �κ��ַ������� a��b �� c���񶨣� 
		System.out.println("--------[^abc]---------");
		System.out.println(Pattern.matches("[^a.b]", "a"));
		System.out.println(Pattern.matches("[^a.b]", "d"));
		System.out.println(Pattern.matches("[^a.b]", "aa"));
//		[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
		System.out.println("--------[a-z A-Z 1-9]---------");
		System.out.println(Pattern.matches("[a-z]", "a"));
		System.out.println(Pattern.matches("[1-5]", "3"));
		System.out.println(Pattern.matches("[A-D]", "a"));
//		[a-d[m-p]] a �� d �� m �� p��[a-dm-p]�������� 
		System.out.println("--------[a-d[m-p]]---------");
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));
		System.out.println(Pattern.matches("[a-zA-Z]", "1"));
		
//		[a-z&&[def]] d��e �� f�������� 
//		[a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ�� 
//		[a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ�� 

	}

}
