package Tjavabaseday0405;

public class Test11 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {1,2,3};	
		//���÷���
		String s = arrayToString(arr);
		//������
		System.out.println("s:"+s);
	}	
	/*
	* ������ȷ��
	* 		����ֵ���ͣ�String
	* 		�����б�int[] arr
	*/
	/**  
	* @Title: arrayToString  
	* @Description: ������ƴ�ӳ��ַ���  
	* @param arr
	* @return    
	*/
	public static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		//[1, 2, 3]
		sb.append("[");
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				sb.append(arr[x]);
			}else {
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");
		
		String result = sb.toString();
		
		return result;
	}

}
