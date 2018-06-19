package Tjavabaseday0501;

import java.util.ArrayList;

public class Test03 {

	public static void main(String[] args) {
//		给定一个字符串数组：{“张三丰”,“宋远桥”,“张无忌”,“殷梨亭”,“张翠山”,“莫声谷”}，
//		 将数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上。
		String []strarry={"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"};
		ArrayList<String> stringArrayList=new ArrayList<String>();
		for(int i=0;i<strarry.length;i++){
			stringArrayList.add(strarry[i]);
		}
		for(int i=0;i<stringArrayList.size();i++){
			String t=stringArrayList.get(i);
			if(t.startsWith("张")){
				System.out.println(t);
			}
		}
	}
	

}
