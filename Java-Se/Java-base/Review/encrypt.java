package Review;

import java.util.Scanner;

public class encrypt {
	// 需求：键盘录入数据,要求数据是四位的整数,现需要对数据进行加密,加密规则如下:
	// 每位数字都加上5,然后除以10的余数代替该数字,
	// 再将第一位和第四位交换,第二位和第三位交换,
	// 请把加密后的数据输出到控制台
	public static void main(String[] args) {
		System.out.println("请输入一个四位整数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		dataEncrypt(a);
		sc.close();
		
	}

	public static void dataEncrypt(int data) {
		//取出四个位数上的数字
		int x = data % 10;                 //第一位
		int y = data / 10 % 10;            //第二位
		int z = data /100 % 10;       //第三位
		int w = data / 1000 % 10;  //第四位 
        //把四个数进行加5的操作
		int[] arr = { x , y , z , w };
		//完成取余的操作
		for(int i=0;i<arr.length;i++){
			arr[i]=(arr[i]+5)%10;
		}
		//完成位置互换的操作
//		int temp = 0;
//		temp = arr[0];
//		arr[0] = arr[3];
//		arr[3] = temp;
//
//		temp = arr[1];
//		arr[1] = arr[2];
//		arr[2] = temp;
		//遍历出加密的结果
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
}
