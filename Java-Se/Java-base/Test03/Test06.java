package Test03;

public class Test06 {

	public static void main(String[] args) {
		//定义二维数组
				int[][] arr={{1,2,3,4},{4,5,6,7},{7,8,9,10}};
				
				//二维数组中的一维数组名：二维数组名[索引]
				//arr[0]	其实就是二维数组中的第一个一维数组的名称
				//arr[1]	其实就是二维数组中的第二个一维数组的名称
				//arr[2]	其实就是二维数组中的第三个一维数组的名称
				
		//第一个一维数组的元素
				for(int x=0;x<arr[0].length;x++){
					System.out.println(arr[0][x]);
				}
				//第二个一维数组的元素
				for(int x=0;x<arr[1].length;x++){
					System.out.println(arr[1][x]);
				}
				//第三个一维数组的元素
				for(int x=0;x<arr[2].length;x++){
					System.out.println(arr[2][x]);
				}
				
				
				//改进代码，二维数组的长度
				for(int y=0;y<arr.length;y++){
					for(int x=0;x<arr[y].length;x++){
						System.out.println(arr[y][x]);
					}
				}
				System.out.println("---------------");
				
				System.out.println("hello");
				System.out.println("world");
				System.out.print("hello");
				System.out.print("world");
				System.out.println();
				System.out.println("hello");
				System.out.println("world");
				
				System.out.println("---------------");
				
				//最终改进
				for(int y=0;y<arr.length;y++){
					for(int x=0;x<arr[y].length;x++){
						System.out.print(arr[y][x]+" ");
					}
					System.out.println();
				}
//x=4 y=3

         }
   }