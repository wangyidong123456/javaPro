package JAday04_03;

import java.util.HashSet;


public class Test03 {

	public static void main(String[] args) {
		// 求一个字符串"aiodjl;hriWFUADJSVUEHiowfjnivowe"
		// 中一共有几个不重复的字母,区分大小写,如a,A算两个字符
		String s = "aiodjl;hriWFUADJSVUEHiowfjnivowe";
		// char[] toCharArray():把字符串转换为字符数组
		char[] carr = s.toCharArray();
		//定义不包含重复元素的HashSet集合
		HashSet<Character> hs = new HashSet<Character>();
		//使用增强for循环遍历数组
		for (char a : carr) {
			//判断字符是否为字母
			if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
				hs.add(a);
			}
		}
		System.out.println(hs);
		System.out.println("\n不重复的字母个数为:"+hs.size());
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
