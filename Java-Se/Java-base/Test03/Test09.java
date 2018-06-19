package Test03;

public class Test09 {

	public static void main(String[] args) {
//		
//		  1.获取数组中元素中的最大值 2.获取数组中元素中的最小值 3.获取数组中元素中的平均值
//		  4.查找数字232在数组中出现的位置（索引），如果没有输出-1 
//		  5.查找数字4在数组中首次出现的位置，如果没有输出-1
//		  6.查找数字4在数组中最后一次出现的位置（索引），如果没有输出-1 
//		  7.查找数字4在数组中出现的次数
//		  8.将数组元素收尾互换之后输出
//		
		int[] arr = { 21, 9, 4, 3454, 56, 45, 65, 67, 674, 4, 3, 232, 3, 4 };
		int max = arr[0];
		int min = arr[0];
		double sum = 0;
		double mean = 0;
		int i = 0;

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		System.out.println("数组中的最大值为" + max); // 第一题

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}
		System.out.println("数组中的最小值为" + min); // 第二题

		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}
		System.out.println("数组的长度" + arr.length);
		System.out.println("数组中的所有值的和" + sum);
		mean = sum / (arr.length);
		System.out.println("数组中的所有值平均值" + mean);// 第三题

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == 232) {
				System.out.println("数字232在数组中出现的位置（索引）为" + x); // 第四题
			}
		}

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == 4) {
				System.out.println("数字4在数组中首次出现的位置（索引）为" + x); // 第五题
				break;
			}
		}

		for (int x = arr.length - 1; x > 0; x--) {
			if (arr[x] == 4) {
				System.out.println("数字4在数组中最后一次出现的位置（索引）为" + x); // 第六题
				break;
			}
		}
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == 4) {
				i++;
			}
		}
		System.out.println("数字4在数组中出现的次数为" + i + "次"); // 第七题

		System.out.print("数组元素收尾互换之后为：[");
		int t;
		for (int i1 = 0, j = arr.length - 1; i1 < j; i1++, j--) {
			t = arr[i1];
			arr[i1] = arr[j];
			arr[j] = t;
		}
		for (int x = 0; x < arr.length; x++) {
			if(x==arr.length-1){
				System.out.println(arr[x]+"]");
			}  else{
				System.out.print(arr[x] + ",");
			}
		}
		
		System.out.print("数组元素收尾互换之后为：[");
		for (int x = arr.length - 1; x >= 0; x--) {
			if(x==0){
				System.out.println(arr[x]+"]");
			}  else{
				System.out.print(arr[x] + ",");
			}
			}
		}
	}


