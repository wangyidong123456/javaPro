package Javase_test2;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
	int total=0;
	public static void main(String[] args) {
		// 我们有36个在A-Z和0-9范围内。编写一个程序，
		// 从给定的集合中随机选择N个不同的字符，并打印出所有的排列和组合
		Test04 ts=new Test04();
		List<String> list = new ArrayList<String>();
		List<String> newlist = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
//		list.add("D");
//		list.add("E");
//		list.add("F");
//		list.add("G");
		ts.combe(newlist, list, 3-1);
	}

	public void combe(List<String> newlist, List<String> list, int len) {
		if(len==-1){
			System.out.println(newlist.toString());
			total++;
			System.out.println(total);
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			newlist.add(list.get(i));
			combe(newlist, list, len-1);
		}
	}

}
