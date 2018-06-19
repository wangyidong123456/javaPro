package Test03;

public class Test04 {

	public static void main(String[] args) {
		// 定义数组
		// 需求：数组获取最值(获取数组中的最大值最小值) for if 写
		int[] arr = { 111, 222, 333, 1, 555 };
		int max = arr[0];
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		System.out.println("max=" + max);
		int min = arr[0];
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}
		System.out.println("min=" + min);
	}
}