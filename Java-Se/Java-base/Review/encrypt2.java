package Review;

import java.util.Scanner;

public class encrypt2 {
	// 需求：键盘录入一个整数（int 范围）,现需要对数据进行加密,加密规则如下:
	// 每位数字都加上5,然后除以10的余数代替该数字,
	// 再将第一位和第四位交换,第二位和第三位交换,
	// 请把加密后的数据输出到控制台
	public static void main(String[] args) {
		System.out.println("一个整数");
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
//		encrypt2.dataEncrypt(a);
		dataEncrypt(a);
		sc.close();
		
	}
	public static void dataEncrypt(long data) {
		String sr = String.valueOf(data);
		int n=sr.length();
		int [] arr= new int[n];
		//完成逆序 分隔各个位数上的数
		for(int i=0;i<arr.length;i++){
			 arr[i]= (int) (data%10);
			 data=data/10;
		}
		//完成取余的操作
		for(int i=0;i<arr.length;i++){
			arr[i]=(arr[i]+5)%10;
		}
		//foreach 遍历
		for(int i:arr){
			System.out.print(i);
		}
		System.out.println("");
	}
}
