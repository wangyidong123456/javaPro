package Test02;

public class Test03 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: ForTest3  
		 * @Description: 求出1-100之间偶数和
		 * @date 2017年10月12日 下午4:24:07    
		 * Company www.igeekhome.com
		 *    
		 * 需求：求出1-100之间偶数和
		 * 
		 * 分析：
		 * 		A:定义求和变量，初始化值是0
		 * 		B:获取1-100之间的数据，用for循环实现
		 * 		C:把获取到的数据进行判断，看是否是偶数
		 * 			如果是，就累加
		 * 		D:输出求和结果
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
