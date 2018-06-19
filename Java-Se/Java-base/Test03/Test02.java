package Test03;

public class Test02 {

	public static void main(String[] args) {

		// 需求：定义两个数组，先定义一个数组，赋值，输出。然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
		// * 然后给第二个数组赋值，再次输出两个数组的名及元素。

		int[] arr2 = { 100, 200, 300 };
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		int[] arr = arr2;
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
