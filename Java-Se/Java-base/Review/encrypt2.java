package Review;

import java.util.Scanner;

public class encrypt2 {
	// ���󣺼���¼��һ��������int ��Χ��,����Ҫ�����ݽ��м���,���ܹ�������:
	// ÿλ���ֶ�����5,Ȼ�����10���������������,
	// �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
	// ��Ѽ��ܺ���������������̨
	public static void main(String[] args) {
		System.out.println("һ������");
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
		//������� �ָ�����λ���ϵ���
		for(int i=0;i<arr.length;i++){
			 arr[i]= (int) (data%10);
			 data=data/10;
		}
		//���ȡ��Ĳ���
		for(int i=0;i<arr.length;i++){
			arr[i]=(arr[i]+5)%10;
		}
		//foreach ����
		for(int i:arr){
			System.out.print(i);
		}
		System.out.println("");
	}
}
