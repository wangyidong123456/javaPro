package JAday0306;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
	// ������ʽ��ר�Ž���ַ�������ƥ��Ĺ��ߡ�
	public static void main(String[] args) {
		//Ԥ����һ��ģʽ����P��
		//. ��ʾ����һ���ַ�
		Pattern p=Pattern.compile("a.......b");
		//����ģʽӦ�õ�ָ�����ַ����У���ƥ��Ľ����Ϊ����ֵ����Matcher��
		Matcher m=p.matcher("aadfwderb");
		//m.matches()��ȡƥ��Ľ��  ture ��false
        System.out.println(m.matches());     
        System.out.println(Pattern.compile("a.b").matcher("acb").matches());
        System.out.println(Pattern.matches("a.b", "aaaab"));
        
        
	}

}
