package Test02;

public class Test02 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: ForTest  
		 * @Description: ��ȡ����1-5��5-1
		 * @date 2017��10��12�� ����4:20:32    
		 * Company www.igeekhome.com
		 *    
		 * ���󣺻�ȡ����1-5��5-1
		 */

		for(int a=1;a<=5;a++){
			System.out.println(a);
		}
		for(int a=5;a>=1;a--){
			System.out.println(a);
		}
		/**  
		 * @ClassName: ForTest2  
		 * @Description: ���1-5֮������֮��
		 * @date 2017��10��12�� ����4:21:56    
		 * Company www.igeekhome.com
		 *    
		 * �������1-5֮������֮��
		 * 
		 * ������
		 * 		A:������ͱ�������ʼ��ֵ��0
		 * 		B:��ȡ1-5֮������ݣ���forѭ��ʵ��
		 * 		C:��ÿһ�λ�ȡ�������ݣ��ۼ������Ϳ�����
		 * 		D:�����ͱ�������
		 */
		int sum=0;
		for(int a=1;a<=5;a++){
			sum+=a;		 
		}
		System.out.println(sum);
		
		
	}

}
