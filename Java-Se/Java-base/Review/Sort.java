package Review;

import org.junit.Test;

public class Sort {
	// ��������
	@Test
	public void Test01() {
		int[] arr = { 9, 41, 222, 16, 27, 23, 123, 2 };
		// ������9�����������ʱ��
		// ��ѭ�� ��һ�� arr[index]=123; 9<123
		// arr[index+1]=arr[index] ��123��9����
		// ���{ 2, 41, 222, 16, 27, 23, 123, 123 }
		//
		// �ڶ��� arr[index]=23; 9<23
		// arr[index+1]=arr[index] ��23��123����
		// ���{ 2, 41, 222, 16, 27, 23, 23, 123 }
		// ...
		// ...
		// { 2, 41, 41, 222, 16, 27, 23, 123 }
		// �� arr[index]=2; 9>2ʱ
		// arr[index+1]=9; ��9�� ����2���� ��һλ����
		// ��� { 2, 9, 41, 222, 16, 27, 23, 123 } ����7��
		//

		for (int i = 0; i < arr.length - 1; i++) {
			int insert = arr[i + 1];
			int index = i;
			for (; index >= 0 && insert < arr[index]; index--) {
				arr[index + 1] = arr[index];
			}
			arr[index + 1] = insert;
		}
		// �������������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// ?����
	@Test
	public void Test02() {
		int[] arr = { 222, 41, 2, 16, 27, 23, 123, 9 };
		// ?����
		// 2 222 41 16 27 23 123 9
		// 2 9 222 41 27 23 123 16
		// 2 9 16 222 41 27 123 23
		// 2 9 16 23 222 41 123 27
		// 2 9 16 23 27 222 123 41
		// 2 9 16 23 27 41 222 123
		// 2 9 16 23 27 41 123 222

		// // ����������Сֵ
		// int min = 0;
		// for (int i = 1; i < arr.length; i++) {
		// if (arr[min] > arr[i]) {
		// arr[min] = arr[i];
		// }
		// }
		// System.out.println(arr[min]);

		// ?����
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
		// ��������������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// ֱ������
	@Test
	public void Test03() {
		int[] arr = { 222, 41, 2, 16, 27, 23, 123, 9 };
		// {222, 41, 2, 16, 27, 23, 123, 9 }; ����Сֵ�ŵ�һ��
		// 41 222 2
		// 2  222 41
		
		// { 2,(222, 41, 16,27, 23, 123, 9 )}; �ӵ�2����ʼ����Сֵ
		// { 2,9,(222, 41, 16, 27, 23, 123) };�ӵ�3����ʼ����Сֵ
		// { 2,9,16,(222, 41, 27, 23, 123) } �ӵ�4����ʼ����Сֵ
		// { 2,9,16,23,(222, 41, 27, 123) } �ӵ�5����ʼ����Сֵ
		// { 2,9,16,23,27,(222,41,123) } �ӵ�6����ʼ����Сֵ
		// { 2,9,16,23,27,41,(222, 123) } �ӵ�7����ʼ����Сֵ
		// { 2,9,16,23,27,41, 123,222 } ��ѭ������7�� arr.length-1
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
		// ��������������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	//ð������
	@Test
	public void Test04() {
		int[] arr = { 22, 33, 51, 111, 8, 84, 220, 160 };

		int tem = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					// ʹ����ʱ�������н���
					tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;
				}
			}
		}
		// ��������������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
		
}
