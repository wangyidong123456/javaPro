package com.igeek.ad1_5.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Collections_Test01 {
	@Test
	// 数组遍历Arrays.toString(arr)
	public void Te01() {
		String[] arr = { "Jack", "Rose", "Trump" };
		System.out.println(Arrays.toString(arr));
		int[] a = { 1, 2, 3, 5, 10 };
		System.out.println(Arrays.toString(a));
		for(String str:arr){
			System.out.println(str);
		}
	}

	@Test
	// 数组转集合asList
	public void Te02() {
		List<String> newList = Arrays.asList("Jack", "Rose", "Trump");
		Integer [] arr={1,3,5,1,111,12,32};
		List<Integer> newList1 = Arrays.asList(arr);
		System.out.println(newList);
		// 使用asList转成的集合,不能添加或者删除元素,该方法返回的集合长度不能改变!所以,下面代码运行报错.
		// newList.add("Obama");
		System.out.println(newList1);
	}

	@Test
	/**  
	* 	集合转数组:
	* 		集合ArrayList转为数组的方法为ArrayList的以下两个方法：
	* 		public Object[] toArray()		//集合转数组
	* 		public <T> T[] toArray(T[] a)
	*/
	// 集合转数组
	public void Te03() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		// 调用方法,将集合转为Object类型数组
		Object[] objArr = list.toArray();
		System.out.println(Arrays.toString(objArr));
		Integer i = (Integer) objArr[0];
		// 如果使用元素类型Integer的特有方法,则必须先强转成Integer,否则intValue方法不能使用,比较麻烦
		System.out.println(i.intValue());
		System.out.println("=======================");
		// 调用方法,将集合转为带类型的数组
		Integer[] intArr = new Integer[2];
		Integer[] returnArr = list.toArray(intArr);
		// 如果参数数组足够放下集合中所有元素,就放入参数数组中,返回参数数组
		// 如果参数数组无法放下集合中所有元素,则参数数组只起到确定类型作用,方法逻辑会自动创建新数组存储集合内容,并返回.
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(returnArr));
		// 带泛型后,元素类型直接就是集合中的元素类型,避免了强转的问题
		Integer integer = returnArr[0];
		System.out.println(integer.intValue());
	}

	@Test
	// 打乱集合顺序shuffle方法
	public void Te04() {
		/**
		 * Collections:集合工具类,包含了众多集合的方法 public static void shuffle(List<?> list)
		 * //打乱元素顺序 有顺序(有序):第一个元素是多少,第二个元素是多少,第几个元素对应的是第几,顺序不变.
		 * 排序:不管是第几个放的,只要到集合中(以Integer集合为例),就按照一定的顺序重新排列了.
		 */
		// 准备集合及元素
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		// 打乱前的顺序，就是放入元素的先后顺序
		System.out.println(list);
		// 打乱集合顺序
		Collections.shuffle(list);
		// 打印集合
		System.out.println(list);
	}

	@Test
	/**  
	*  Collections:集合工具类,包含了众多集合的方法
	*  public static <T> void sort(List<T> list)				//排序
	*  排序:不管是第几个放的,只要到集合中(以Integer集合为例),就按照一定的顺序重新排列了. 
	*  
	*  public static <T> int binarySearch(List<?>list,T key)	//查找元素索引
	*  二分法查找:在一个集合当中,查找一个指定元素的索引是多少,如果不存在该元素,就返回负数索引
	*  二分法查询必须要求集合中的元素排好顺序 
	*  
	*  public static void shuffle(List<?> list)				//打乱元素顺序 
	*  有顺序(有序):第一个元素是多少,第二个元素是多少,第几个元素对应的是第几,顺序不变.
	*/
	public void Te05() {
		// 验证二分法查找元素必须有序
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		int binarySearch = Collections.binarySearch(list, 9);
		System.out.println(binarySearch);
		Collections.sort(list);
		System.out.println(list);
		int binarySearch2 = Collections.binarySearch(list, 9);
		System.out.println(binarySearch2);
	}

}
