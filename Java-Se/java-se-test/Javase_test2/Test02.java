package Javase_test2;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		Test02 ts = new Test02();
		int arr[] = { 222, 33, 44, 111, 23, 32, 21 };
		// ts.maopao(arr);
		// ts.insert(arr);
		ts.select(arr);
	}
	//√∞≈›≈≈–Ú
	public void maopao(int[] arr) {
		// 33,44,21,23,32,111,222
		// 33,21,23,32,44,111,222
		// 21,23,32,33,44,111,222
		// √∞≈›≈≈–Ú
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	//≤Â»Î≈≈–Ú
	public void insert(int[] arr) {
		// 222, 33, 44, 111, 23, 32, 21
		// 33,222,(44, 111, 23, 32, 21 )
		// 33,44,222,(111, 23, 32, 21 )
		// 33,44,111,222,(23, 32, 21 )
		// 23,33,44,111,222,(32, 21 )
		// 21,23,33,44,111,222
		for (int i = 0; i < arr.length - 1; i++) {
			int insert = arr[i + 1];
			int index = i;
			for (; index >= 0 && insert < arr[index]; index--) {
				arr[index + 1] = arr[index];
			}
			arr[index + 1] = insert;
		}
		System.out.println(Arrays.toString(arr));
	}
	//—°‘Ò≈≈–Ú
	public void select(int[] arr) {
		// 222, 33, 44, 111, 23, 32, 21
		for (int j = 0; j < arr.length - 1; j++) {
			int min_temp = arr[j];
			int temp = 0;
			for (int i = j; i < arr.length; i++) {
				if (min_temp > arr[i]) {
					temp = min_temp;
					min_temp = arr[i];
					arr[i] = temp;
				}
			}
			arr[j] = min_temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
