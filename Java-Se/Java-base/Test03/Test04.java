package Test03;

public class Test04 {

	public static void main(String[] args) {
		// ��������
		// ���������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ) for if д
		int[] arr = { 111, 222, 333, 1, 555 };
		int max = arr[0];
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		System.out.println("max=" + max);
		int min = arr[0];
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}
		System.out.println("min=" + min);
	}
}