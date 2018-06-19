package JAday04_03;

import java.util.HashSet;
import java.util.Iterator;

public class Test01 {
	//set 一个不包含重复元素的collection，无序
	//      HashSet
	//List 有序的collection
	//      与set不同，列表通常允许重复的元素
	//      ArrayList
	//      LinkedList
	public static void main(String[] args) {
           HashSet<String> hs=new HashSet<String>();
           //如果set中尚未存在指定的元素，则添加此元素(可选).
           hs.add("aa");
           hs.add("ab");
           hs.add("bc");
           hs.add("dd");
           hs.add("ee");
           hs.add("ff");
           hs.add("ff");
           System.out.println(hs);
            //  获取元素，只能用迭代器
           for(Iterator<String> itr=hs.iterator();itr.hasNext();){
        	   System.out.println(itr.next());
           }
           System.out.println("");
           //foreach 迭代
           for(String str:hs){
        	   System.out.print(str);
           }
	}
}
