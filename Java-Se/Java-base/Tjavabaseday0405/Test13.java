package Tjavabaseday0405;
import java.util.Scanner;

/**  
* @ClassName: StringBuilderTest4  
* @Description: �ж�һ���ַ����Ƿ��ǶԳ��ַ���
* @date 2017��11��11�� ����11:35:44    
* Company www.igeekhome.com
*    
* ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
* 
* ������
* 		A:����¼��һ���ַ���
* 		B:д����ʵ���ж�һ���ַ����Ƿ��ǶԳ��ַ���
* 			���ַ�����ת���ͷ�תǰ���ַ������бȽϣ����������ͬ����˵���ǶԳ��ַ���
* 		C:���÷���
* 		D:������
*/
public class Test13{
	public static void main(String[] args) {
		//����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();		
		//д����ʵ���ж�һ���ַ����Ƿ��ǶԳ��ַ���		
		//���÷���
		boolean b = isSymmetry(s);
		
		//������
		System.out.println("b:"+b);
		sc.close();
	}	
	/*
	* ������ȷ��
	* 		����ֵ���ͣ�boolean
	* 		�����б�String s
	*/
	/**  
	* @Title: isSymmetry  
	* @Description: �ж�һ���ַ����Ƿ��ǶԳ��ַ��� 
	* @param s
	* @return    
	*/
	public static boolean isSymmetry(String s) {
		//���ַ�����ת���ͷ�תǰ���ַ������бȽϣ����������ͬ����˵���ǶԳ��ַ���
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String result = sb.toString();
		return result.equals(s);
	}
}
