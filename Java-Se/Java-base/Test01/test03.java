package Test01;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: IfTest2  
		 * @Description: ����¼��ѧ�����Գɼ�������ݳɼ��жϸ�ѧ�������ĸ�����
		 * @date 2017��10��12�� ����4:05:01    
		 * Company www.igeekhome.com
		 *   
		 * ����¼��ѧ�����Գɼ�������ݳɼ��жϸ�ѧ�������ĸ�����
		 * 90-100	����
		 * 80-90	��
		 * 70-80	��
		 * 60-70	����
		 * 60����	������
		 * 
		 * ������
		 * 		A:����¼��ѧ�����Գɼ�
		 * 			������
		 * 		B:ͨ���򵥵ķ��������Ǿ�������if����ʽ3��ʵ��
		 * 
		 * ����һ��Ҫ������ȫ�ˡ�
		 * 		��ȫ����
		 * 		�߽�����
		 * 		��������
		 */
         Scanner sc=new Scanner(System.in);
         System.out.println("�����뿼�Գɼ���");
           int a=sc.nextInt();
                if (a>=0&&a<60){
        	   System.out.println("���Գɼ�Ϊ������");
           }else if(a>=60&&a<70){
        	   System.out.println("���Գɼ�Ϊ����");
           }else if(a>=70&&a<80){
        	   System.out.println("���Գɼ�Ϊ����");
           }else if(a>=80&&a<90){
        	   System.out.println("���Գɼ�Ϊ�á�");
           }else if(a>=90&&a<=100){
        	   System.out.println("���Գɼ�Ϊ���㡣");
           }else if(a>100||a<0){
        	   System.out.println("�������"); 
           }
           sc.close();
	}

}
