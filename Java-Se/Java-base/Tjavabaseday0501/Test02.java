package Tjavabaseday0501;

import java.util.ArrayList;

public class Test02 {
	//public boolean add(E e):添加元素

	public static void main(String[] args) {
		ArrayList<String> stringArrayList=new ArrayList<String>();
		stringArrayList.add("abc");
		stringArrayList.add("123");
		stringArrayList.add("ght");
		stringArrayList.add("567");
		System.out.println(stringArrayList);
		
        //public boolean add(int index, E element):添加元素
		stringArrayList.add(1,"geek");  
		System.out.println(stringArrayList);	
		stringArrayList.add(3,"geek");  
		System.out.println(stringArrayList);
		//IndexOutOfBoundsEsception
        //stringArrayList.add(6,"geek");  
        //System.out.println(stringArrayList);

        // 集合长度 public int size ();返回集合中的元素个数
		System.out.println("size:"+stringArrayList.size());	
		for(int i=0;i<stringArrayList.size();i++){
			System.out.println("stringArrayList:index"+i+":"+stringArrayList.get(i));
		}
		//添加元素
		stringArrayList.add("abc"); 
		System.out.println(stringArrayList);
		
		stringArrayList.remove("abc");
		System.out.println(stringArrayList);
		
		//删除元素public boolean remove(Object o):删除指定的元素，返回删除是否成功
		System.out.println("stringArrayListremove‘"+1+"’:"+stringArrayList.remove(1));
		System.out.println(stringArrayList);		
		//删除元素public E remove(int index)：删除指定索引出的元素，返回被删除的元素
		
		//修改元素
		stringArrayList.set(1,"1000");
		
		System.out.println(stringArrayList);
	}

}
