package Tjavabaseday0405;

import java.util.Scanner;
/**  
* @ClassName: StringBuilderTest3  
* @Description: ����StringBuilder����ַ�����ת
* @date 2017��11��11�� ����11:34:03    
* Company www.igeekhome.com
*    
* ������
* 		A:����¼��һ���ַ���
* 		B:д����ʵ�ַ�ת
* 			String -- StringBuilder -- reverse() -- String
* 		C:���÷���
* 		D:������
*/

public class Test12 {
	public static void main(String[] args) {
		//����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
	    //д����ʵ�ַ�ת
		//���÷���
		String result = myReverse(s);
		//������
		System.out.println("result:"+result);
		sc.close();
	}
	/*
	* ������ȷ��
	* 		����ֵ���ͣ�String
	* 		�����б�String
	*/
	/**  
	* @Title: myReverse  
	* @Description: �ַ�����ת  
	* @param s
	* @return    
	*/
	public static String myReverse(String s) {
		//String -- StringBuilder -- reverse() -- String
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String result = sb.toString();
		return result;
		
	}


}
