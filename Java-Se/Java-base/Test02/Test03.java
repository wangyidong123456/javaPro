package Test02;

public class Test03 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: ForTest3  
		 * @Description: ���1-100֮��ż����
		 * @date 2017��10��12�� ����4:24:07    
		 * Company www.igeekhome.com
		 *    
		 * �������1-100֮��ż����
		 * 
		 * ������
		 * 		A:������ͱ�������ʼ��ֵ��0
		 * 		B:��ȡ1-100֮������ݣ���forѭ��ʵ��
		 * 		C:�ѻ�ȡ�������ݽ����жϣ����Ƿ���ż��
		 * 			����ǣ����ۼ�
		 * 		D:�����ͽ��
		 */
		  int sum=0;
          for(int x=1;x<=100;x++){
        	  x++;
        	  sum+=x;
          }
          System.out.println(sum);
          
          int su=0;
          for(int x=1;x<=100;x++){
        	  if(x%2!=0){
        	  su+=x;
        	  }
          }
          System.out.println(su); 
	}

}
