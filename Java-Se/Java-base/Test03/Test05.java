package Test03;

public class Test05 {

	public static void main(String[] args) {
		// ��������[][] ������ = {{Ԫ��...},{Ԫ��...},{Ԫ��...},...};
				int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

				System.out.println(arr); // [[I@104c575
				System.out.println(arr.length); // ��ά�����е�һά����ĸ���
				System.out.println(arr[0]);// [I@3fa5ac
				System.out.println(arr[0].length);
				System.out.println(arr[1]);// [I@95cfbe
				System.out.println(arr[2]);// [I@179dce4
				
				//����λ�ȡ��һ����ά�����Ԫ����?
				System.out.println(arr[0][0]);
				System.out.println(arr[1][1]);
				System.out.println(arr[2][0]);

         }
   }