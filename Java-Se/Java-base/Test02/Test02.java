package Test02;

public class Test02 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: ForTest  
		 * @Description: 获取数据1-5和5-1
		 * @date 2017年10月12日 下午4:20:32    
		 * Company www.igeekhome.com
		 *    
		 * 需求：获取数据1-5和5-1
		 */

		for(int a=1;a<=5;a++){
			System.out.println(a);
		}
		for(int a=5;a>=1;a--){
			System.out.println(a);
		}
		/**  
		 * @ClassName: ForTest2  
		 * @Description: 求出1-5之间数据之和
		 * @date 2017年10月12日 下午4:21:56    
		 * Company www.igeekhome.com
		 *    
		 * 需求：求出1-5之间数据之和
		 * 
		 * 分析：
		 * 		A:定义求和变量，初始化值是0
		 * 		B:获取1-5之间的数据，用for循环实现
		 * 		C:把每一次获取到的数据，累加起来就可以了
		 * 		D:输出求和变量即可
		 */
		int sum=0;
		for(int a=1;a<=5;a++){
			sum+=a;		 
		}
		System.out.println(sum);
		
		
	}

}
