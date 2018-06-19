package Tjavabaseday052;

import java.util.ArrayList;

import org.junit.Test;

public class Test01 {
	@Test
	public void Te01() {
		// 向集合中添加任意四个字符串,遍历集合,依次打印取出的字符串
		ArrayList<String> array = new ArrayList<String>();
		array.add("wyd");
		array.add("wc");
		array.add("xs");
		array.add("xa");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

	@Test
	public void Te02() {
		// 给定一个字符串数组：
		// {“张三丰”,“宋远桥”,“张无忌”,“殷梨亭”,“张翠山”,“莫声谷”}，
		// 将数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上
		String[] str={"张三丰","宋远桥","张无忌","殷梨亭","莫声谷"};
		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			 array.add(str[i]);
		}
	    
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).startsWith("张")){
			System.out.println(array.get(i));
			}
		}
	}
     
	@Test
	public void Te03() {
		
	}
}
