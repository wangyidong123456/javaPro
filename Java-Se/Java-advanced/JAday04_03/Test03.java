package JAday04_03;

import java.util.HashSet;


public class Test03 {

	public static void main(String[] args) {
		// ��һ���ַ���"aiodjl;hriWFUADJSVUEHiowfjnivowe"
		// ��һ���м������ظ�����ĸ,���ִ�Сд,��a,A�������ַ�
		String s = "aiodjl;hriWFUADJSVUEHiowfjnivowe";
		// char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		char[] carr = s.toCharArray();
		//���岻�����ظ�Ԫ�ص�HashSet����
		HashSet<Character> hs = new HashSet<Character>();
		//ʹ����ǿforѭ����������
		for (char a : carr) {
			//�ж��ַ��Ƿ�Ϊ��ĸ
			if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
				hs.add(a);
			}
		}
		System.out.println(hs);
		System.out.println("\n���ظ�����ĸ����Ϊ:"+hs.size());
		String str="ss";
//		Test03 tss=new Test03();
		System.out.println(new Test03().toString());
		System.out.println(str.hashCode());
		System.out.println(str.getClass()+"@"+Integer.toHexString(str.hashCode()));
	}
//	public String toString() {
//		return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	}
}
