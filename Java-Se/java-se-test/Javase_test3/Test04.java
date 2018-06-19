package Javase_test3;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		int arr[] = { 122, 23, 44, 32, 45, 212 };
//		int temp = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length-1; i++) {
			int itemp = arr[i + 1];
			int j = i;
			for (;  j >= 0&&itemp < arr[j] ; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = itemp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
