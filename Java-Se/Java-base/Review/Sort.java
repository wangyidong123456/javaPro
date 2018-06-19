package Review;

import org.junit.Test;

public class Sort {
	// 插入排序
	@Test
	public void Test01() {
		int[] arr = { 9, 41, 222, 16, 27, 23, 123, 2 };
		// 把数字9插入数数组的时候
		// 内循环 第一次 arr[index]=123; 9<123
		// arr[index+1]=arr[index] 用123把9覆盖
		// 结果{ 2, 41, 222, 16, 27, 23, 123, 123 }
		//
		// 第二次 arr[index]=23; 9<23
		// arr[index+1]=arr[index] 用23把123覆盖
		// 结果{ 2, 41, 222, 16, 27, 23, 23, 123 }
		// ...
		// ...
		// { 2, 41, 41, 222, 16, 27, 23, 123 }
		// 当 arr[index]=2; 9>2时
		// arr[index+1]=9; 用9把 数字2索引 后一位覆盖
		// 结果 { 2, 9, 41, 222, 16, 27, 23, 123 } 排序7次
		//

		for (int i = 0; i < arr.length - 1; i++) {
			int insert = arr[i + 1];
			int index = i;
			for (; index >= 0 && insert < arr[index]; index--) {
				arr[index + 1] = arr[index];
			}
			arr[index + 1] = insert;
		}
		// 遍历排序后数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// ?排序
	@Test
	public void Test02() {
		int[] arr = { 222, 41, 2, 16, 27, 23, 123, 9 };
		// ?排序法
		// 2 222 41 16 27 23 123 9
		// 2 9 222 41 27 23 123 16
		// 2 9 16 222 41 27 123 23
		// 2 9 16 23 222 41 123 27
		// 2 9 16 23 27 222 123 41
		// 2 9 16 23 27 41 222 123
		// 2 9 16 23 27 41 123 222

		// // 求数组中最小值
		// int min = 0;
		// for (int i = 1; i < arr.length; i++) {
		// if (arr[min] > arr[i]) {
		// arr[min] = arr[i];
		// }
		// }
		// System.out.println(arr[min]);

		// ?排序法
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// 遍历排序后的数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// 直接排序法
	@Test
	public void Test03() {
		int[] arr = { 222, 41, 2, 16, 27, 23, 123, 9 };
		// {222, 41, 2, 16, 27, 23, 123, 9 }; 求最小值放第一个
		// 41 222 2
		// 2  222 41
		
		// { 2,(222, 41, 16,27, 23, 123, 9 )}; 从第2个开始求最小值
		// { 2,9,(222, 41, 16, 27, 23, 123) };从第3个开始求最小值
		// { 2,9,16,(222, 41, 27, 23, 123) } 从第4个开始求最小值
		// { 2,9,16,23,(222, 41, 27, 123) } 从第5个开始求最小值
		// { 2,9,16,23,27,(222,41,123) } 从第6个开始求最小值
		// { 2,9,16,23,27,41,(222, 123) } 从第7个开始求最小值
		// { 2,9,16,23,27,41, 123,222 } 外循环次数7次 arr.length-1
		for (int i = 0; i < arr.length - 1; i++) {
			int min_tem = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min_tem > arr[j]) {
					min_tem = arr[j];
					minIndex = j;
				}	
			}
			arr[minIndex] = arr[i];
			arr[i] = min_tem;
			
		}
		// 遍历排序后的数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	//冒泡排序
	@Test
	public void Test04() {
		int[] arr = { 22, 33, 51, 111, 8, 84, 220, 160 };

		int tem = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					// 使用临时变量进行交换
					tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;
				}
			}
		}
		// 遍历排序后的数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
		
}
