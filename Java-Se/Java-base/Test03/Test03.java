package Test03;

public class Test03 {

	public static void main(String[] args) {
		// 定义数组
				int[] arr = { 11, 22, 33, 44, 55 };
				// 原始做法
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(arr[2]);
				System.out.println(arr[3]);
				System.out.println(arr[4]);
				System.out.println("--------------------");

				// 用for循环改进
				for (int x = 0; x < 5; x++) {
					System.out.println(arr[x]);
				}
				System.out.println("--------------------");
				
				//为了解决我们去数数组中元素个数的问题，数组就提供了一个属性：length
				//用于获取数组的长度
				//格式：数组名.length
				System.out.println("数组共有："+arr.length+"个");
				System.out.println("--------------------");
				
				for(int x=0; x<arr.length; x++) {
					System.out.println(arr[x]);

	             }

         }
   }