package Test01;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: IfTest  
		 * @Description: ����¼���������ݣ���ȡ���������ݵĽϴ�ֵ
		 * @date 2017��10��12�� ����4:01:26    
		 * Company www.igeekhome.com
		 *    
		 * ����¼���������ݣ���ȡ���������ݵĽϴ�ֵ
		 * 
		 * ������
		 * 		A:��������¼�룬���Ǿ�Ӧ���뵽����¼���������
		 * 			�������������󣬽�������
		 * 		B:��ȡ���������ݵĽϴ�ֵ����ʵ�����ж���������˭�󣬰Ѵ������Ϳ����ˡ�
		 * 
		 * ������
		 * 		A:�ֶ�����
		 * 			import java.util.Scanner;
		 * 		B:�������ɫ��棬�Զ�����
		 * 		C:��ݼ�(�Ƽ�)
		 * 			ctrl+shift+o
		 */
//		if ����
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��������");
		int a=sc.nextInt();
		System.out.println("�������һ��������");
		int b=sc.nextInt();
		
		  if(a>b){
			  System.out.println("�Ƚϴ��ֵ�ǣ�"+ a);			  
		  } else if(a<b){
			  System.out.println("�Ƚϴ��ֵ�ǣ�"+ b);
		  } else   {
			  System.out.println("�������ֵ��һ����ģ���");
		  }
		sc.close();
	}
 
}
