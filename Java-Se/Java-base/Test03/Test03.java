package Test03;

public class Test03 {

	public static void main(String[] args) {
		// ��������
				int[] arr = { 11, 22, 33, 44, 55 };
				// ԭʼ����
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(arr[2]);
				System.out.println(arr[3]);
				System.out.println(arr[4]);
				System.out.println("--------------------");

				// ��forѭ���Ľ�
				for (int x = 0; x < 5; x++) {
					System.out.println(arr[x]);
				}
				System.out.println("--------------------");
				
				//Ϊ�˽������ȥ��������Ԫ�ظ��������⣬������ṩ��һ�����ԣ�length
				//���ڻ�ȡ����ĳ���
				//��ʽ��������.length
				System.out.println("���鹲�У�"+arr.length+"��");
				System.out.println("--------------------");
				
				for(int x=0; x<arr.length; x++) {
					System.out.println(arr[x]);

	             }

         }
   }