package Test03;

public class Test02 {

	public static void main(String[] args) {

		// ���󣺶����������飬�ȶ���һ�����飬��ֵ�������Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ������顣
		// * Ȼ����ڶ������鸳ֵ���ٴ�����������������Ԫ�ء�

		int[] arr2 = { 100, 200, 300 };
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		int[] arr = arr2;
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
