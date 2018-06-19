package JAday04;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
	/**
	 * collection接口：实现这个接口允许对象成为 "foreach" 语句的目标。  
	 * Iterator<T> iterator()  返回一个在一组 T 类型的元素上进行迭代的迭代器。
	 * Iterator<E>接口：   对集合进行迭代的迭代器
	 * hasNext()   如果仍有元素可以迭代，则返回 true。
	 * E next()    返回迭代的下一个元素。 
	 *                      
	 */
	public static void main(String[] args) {
		//使用迭代器进行集合元素的遍历
		ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(12);
        arr.add(42);
        arr.add(22);
        arr.add(62);
        arr.add(62);
        //获取集合元素的迭代器      
        Iterator<Integer> it=arr.iterator();
        for(;it.hasNext();){
        	System.out.println(it.next());
        }
	}

}
