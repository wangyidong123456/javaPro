package Review;

import java.util.Scanner;

public class encrypt {
	// ���󣺼���¼������,Ҫ����������λ������,����Ҫ�����ݽ��м���,���ܹ�������:
	// ÿλ���ֶ�����5,Ȼ�����10���������������,
	// �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
	// ��Ѽ��ܺ���������������̨
	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		dataEncrypt(a);
		sc.close();
		
	}

	public static void dataEncrypt(int data) {
		//ȡ���ĸ�λ���ϵ�����
		int x = data % 10;                 //��һλ
		int y = data / 10 % 10;            //�ڶ�λ
		int z = data /100 % 10;       //����λ
		int w = data / 1000 % 10;  //����λ 
        //���ĸ������м�5�Ĳ���
		int[] arr = { x , y , z , w };
		//���ȡ��Ĳ���
		for(int i=0;i<arr.length;i++){
			arr[i]=(arr[i]+5)%10;
		}
		//���λ�û����Ĳ���
//		int temp = 0;
//		temp = arr[0];
//		arr[0] = arr[3];
//		arr[3] = temp;
//
//		temp = arr[1];
//		arr[1] = arr[2];
//		arr[2] = temp;
		//���������ܵĽ��
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
}
