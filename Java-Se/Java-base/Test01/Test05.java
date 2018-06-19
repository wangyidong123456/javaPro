package Test01;

public class Test05 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: WhileTest  
		 * @Description: 求1-100之和
		 * @date 2017年10月12日 下午4:36:45    
		 * Company www.igeekhome.com
		 *    
		 * 求1-100之和。
		 */
		 int a=1; 
		 int sum=0;
         while(a<=100){      	
        	 sum+=a;
        	 a++;
         }
         System.out.println("1-100之和为："+sum);
	}

}
