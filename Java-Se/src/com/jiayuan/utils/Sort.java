package com.jiayuan.utils;

public class Sort {
	static int[] arr = { 9, 41, 222, 16, 27, 23, 123, 2 };
	public static void main(String[] args) {
		insertionSort(arr);
		selectionSort(arr);
		bubbleSort(arr);
	}

	// ��������
	public static void insertionSort(int[] arr) {
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

	// ѡ������
	public static void selectionSort(int[] arr) {
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
		// // ��������������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// ð������
	public static void bubbleSort(int[] arr) {
		int tem = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
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
