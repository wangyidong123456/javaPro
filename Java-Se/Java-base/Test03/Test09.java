package Test03;

public class Test09 {

	public static void main(String[] args) {
//		
//		  1.��ȡ������Ԫ���е����ֵ 2.��ȡ������Ԫ���е���Сֵ 3.��ȡ������Ԫ���е�ƽ��ֵ
//		  4.��������232�������г��ֵ�λ�ã������������û�����-1 
//		  5.��������4���������״γ��ֵ�λ�ã����û�����-1
//		  6.��������4�����������һ�γ��ֵ�λ�ã������������û�����-1 
//		  7.��������4�������г��ֵĴ���
//		  8.������Ԫ����β����֮�����
//		
		int[] arr = { 21, 9, 4, 3454, 56, 45, 65, 67, 674, 4, 3, 232, 3, 4 };
		int max = arr[0];
		int min = arr[0];
		double sum = 0;
		double mean = 0;
		int i = 0;

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		System.out.println("�����е����ֵΪ" + max); // ��һ��

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}
		System.out.println("�����е���СֵΪ" + min); // �ڶ���

		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}
		System.out.println("����ĳ���" + arr.length);
		System.out.println("�����е�����ֵ�ĺ�" + sum);
		mean = sum / (arr.length);
		System.out.println("�����е�����ֵƽ��ֵ" + mean);// ������

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == 232) {
				System.out.println("����232�������г��ֵ�λ�ã�������Ϊ" + x); // ������
			}
		}

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == 4) {
				System.out.println("����4���������״γ��ֵ�λ�ã�������Ϊ" + x); // ������
				break;
			}
		}

		for (int x = arr.length - 1; x > 0; x--) {
			if (arr[x] == 4) {
				System.out.println("����4�����������һ�γ��ֵ�λ�ã�������Ϊ" + x); // ������
				break;
			}
		}
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == 4) {
				i++;
			}
		}
		System.out.println("����4�������г��ֵĴ���Ϊ" + i + "��"); // ������

		System.out.print("����Ԫ����β����֮��Ϊ��[");
		int t;
		for (int i1 = 0, j = arr.length - 1; i1 < j; i1++, j--) {
			t = arr[i1];
			arr[i1] = arr[j];
			arr[j] = t;
		}
		for (int x = 0; x < arr.length; x++) {
			if(x==arr.length-1){
				System.out.println(arr[x]+"]");
			}  else{
				System.out.print(arr[x] + ",");
			}
		}
		
		System.out.print("����Ԫ����β����֮��Ϊ��[");
		for (int x = arr.length - 1; x >= 0; x--) {
			if(x==0){
				System.out.println(arr[x]+"]");
			}  else{
				System.out.print(arr[x] + ",");
			}
			}
		}
	}


