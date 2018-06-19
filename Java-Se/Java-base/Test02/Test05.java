package Test02;

public class Test05 {

	public static void main(String[] args) {

/**  
 * @ClassName: ForTest4  
 * @Description: 在控制台输出所有的”水仙花数”
 * @date 2017年10月12日 下午4:28:43    
 * Company www.igeekhome.com
 *    
 * 需求：在控制台输出所有的”水仙花数”
 * 
 * 分析：
 * 		什么是水仙花数呢?
 * 			所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
 *			举例：153就是一个水仙花数。
 *			153 = 1*1*1 + 5*5*5 + 3*3*3
 *
 *		A:三位数其实就告诉了我们水仙花数的范围
 *			100-999
 *		B:如何获取一个数据的每一个位上的数呢?
 *			举例：我有一个数据153，请问如何获取到个位，十位，百位
 *			个位：153%10 = 3;
 *			十位：153/10%10 = 5;
 *			百位：153/10/10%10 = 1;
 *			千位：...
 *			万位：...
 *		C:让每个位上的立方和相加，并和该数据进行比较，如果相等，就说明该数据是水仙花数，在控制台输出
 */    

		  
		for(int x=100;x<1000;x++){
			int a=0;
			int b=0;
			int c=0;			
			a=x/10/10%10;
			b=x/10%10;
			c=x%10;
			if(x==a*a*a+b*b*b+c*c*c){
				System.out.println(x);
			}
			
		}
		
		
	}

}
