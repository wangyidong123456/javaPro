package Test03;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// ���� ���Լ�� ��С������ ������
		Scanner sc = new Scanner(System.in);
		// System.out.println("������һ������:");
		// int i=sc.nextInt();
		// int j=0;
		// for(int x=2;x<i;x++){
		// if(i/x==0){
		// j++;
		// break;
		// }
		// }
		// if(j==0){
		// System.out.println("�����������");
		// }else{
		// System.out.println("����ǲ�������"); //��һ��
		// }
		//
		// System.out.println("��������������");
		// int a=sc.nextInt();
		// int b=sc.nextInt();
		// int max=0;
		// int min=0;
		// for(int x=2;x<=a;x++){
		// if((a%x==0) && (b%x==0)){
		// max=x;
		// }
		// }
		// System.out.println("���Լ��Ϊ��"+max);
		//
		// min=a*b/max;
		// System.out.println("��С������Ϊ��"+min); //�ڶ���
		//

		System.out.println("������һ�����֣�");
		int n = sc.nextInt();
		int index = 0;
		int[] arr = new int[1000];
		for (; n > 0;) {
			arr[index] = n % 10;
			n = n / 10;
			index++;

		}
		int c = 0;
		for (int i1 = 0, i2 = index - 1; i1 <= i2; i1++, i2--) {
			if (arr[i1] == arr[i2]) {
				c++;
				System.out.print(i1);
				System.out.println(i2);
			}
		}
		System.out.println(index);
		System.out.println(c);
		if (c * 2 >= index) {
			System.out.println("������ǻ�������");
		} else {
			System.out.println("��������ǻ�������");
		}

		sc.close();

	}

}
