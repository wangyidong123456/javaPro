package com.igeek.ad1_5.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Collections_Test01 {
	@Test
	// �������Arrays.toString(arr)
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
	// ����ת����asList
	public void Te02() {
		List<String> newList = Arrays.asList("Jack", "Rose", "Trump");
		Integer [] arr={1,3,5,1,111,12,32};
		List<Integer> newList1 = Arrays.asList(arr);
		System.out.println(newList);
		// ʹ��asListת�ɵļ���,������ӻ���ɾ��Ԫ��,�÷������صļ��ϳ��Ȳ��ܸı�!����,����������б���.
		// newList.add("Obama");
		System.out.println(newList1);
	}

	@Test
	/**  
	* 	����ת����:
	* 		����ArrayListתΪ����ķ���ΪArrayList����������������
	* 		public Object[] toArray()		//����ת����
	* 		public <T> T[] toArray(T[] a)
	*/
	// ����ת����
	public void Te03() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		// ���÷���,������תΪObject��������
		Object[] objArr = list.toArray();
		System.out.println(Arrays.toString(objArr));
		Integer i = (Integer) objArr[0];
		// ���ʹ��Ԫ������Integer�����з���,�������ǿת��Integer,����intValue��������ʹ��,�Ƚ��鷳
		System.out.println(i.intValue());
		System.out.println("=======================");
		// ���÷���,������תΪ�����͵�����
		Integer[] intArr = new Integer[2];
		Integer[] returnArr = list.toArray(intArr);
		// ������������㹻���¼���������Ԫ��,�ͷ������������,���ز�������
		// ������������޷����¼���������Ԫ��,���������ֻ��ȷ����������,�����߼����Զ�����������洢��������,������.
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(returnArr));
		// �����ͺ�,Ԫ������ֱ�Ӿ��Ǽ����е�Ԫ������,������ǿת������
		Integer integer = returnArr[0];
		System.out.println(integer.intValue());
	}

	@Test
	// ���Ҽ���˳��shuffle����
	public void Te04() {
		/**
		 * Collections:���Ϲ�����,�������ڶ༯�ϵķ��� public static void shuffle(List<?> list)
		 * //����Ԫ��˳�� ��˳��(����):��һ��Ԫ���Ƕ���,�ڶ���Ԫ���Ƕ���,�ڼ���Ԫ�ض�Ӧ���ǵڼ�,˳�򲻱�.
		 * ����:�����ǵڼ����ŵ�,ֻҪ��������(��Integer����Ϊ��),�Ͱ���һ����˳������������.
		 */
		// ׼�����ϼ�Ԫ��
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		// ����ǰ��˳�򣬾��Ƿ���Ԫ�ص��Ⱥ�˳��
		System.out.println(list);
		// ���Ҽ���˳��
		Collections.shuffle(list);
		// ��ӡ����
		System.out.println(list);
	}

	@Test
	/**  
	*  Collections:���Ϲ�����,�������ڶ༯�ϵķ���
	*  public static <T> void sort(List<T> list)				//����
	*  ����:�����ǵڼ����ŵ�,ֻҪ��������(��Integer����Ϊ��),�Ͱ���һ����˳������������. 
	*  
	*  public static <T> int binarySearch(List<?>list,T key)	//����Ԫ������
	*  ���ַ�����:��һ�����ϵ���,����һ��ָ��Ԫ�ص������Ƕ���,��������ڸ�Ԫ��,�ͷ��ظ�������
	*  ���ַ���ѯ����Ҫ�󼯺��е�Ԫ���ź�˳�� 
	*  
	*  public static void shuffle(List<?> list)				//����Ԫ��˳�� 
	*  ��˳��(����):��һ��Ԫ���Ƕ���,�ڶ���Ԫ���Ƕ���,�ڼ���Ԫ�ض�Ӧ���ǵڼ�,˳�򲻱�.
	*/
	public void Te05() {
		// ��֤���ַ�����Ԫ�ر�������
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
