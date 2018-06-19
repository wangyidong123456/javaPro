package Test03;

public class Test05 {

	public static void main(String[] args) {
		// 数据类型[][] 数组名 = {{元素...},{元素...},{元素...},...};
				int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

				System.out.println(arr); // [[I@104c575
				System.out.println(arr.length); // 二维数组中的一维数组的个数
				System.out.println(arr[0]);// [I@3fa5ac
				System.out.println(arr[0].length);
				System.out.println(arr[1]);// [I@95cfbe
				System.out.println(arr[2]);// [I@179dce4
				
				//我如何获取到一个二维数组的元素呢?
				System.out.println(arr[0][0]);
				System.out.println(arr[1][1]);
				System.out.println(arr[2][0]);

         }
   }