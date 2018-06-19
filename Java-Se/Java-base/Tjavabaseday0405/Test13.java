package Tjavabaseday0405;
import java.util.Scanner;

/**  
* @ClassName: StringBuilderTest4  
* @Description: 判断一个字符串是否是对称字符串
* @date 2017年11月11日 上午11:35:44    
* Company www.igeekhome.com
*    
* 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
* 
* 分析：
* 		A:键盘录入一个字符串
* 		B:写方法实现判断一个字符串是否是对称字符串
* 			把字符串反转，和反转前的字符串进行比较，如果内容相同，就说明是对称字符串
* 		C:调用方法
* 		D:输出结果
*/
public class Test13{
	public static void main(String[] args) {
		//键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();		
		//写方法实现判断一个字符串是否是对称字符串		
		//调用方法
		boolean b = isSymmetry(s);
		
		//输出结果
		System.out.println("b:"+b);
		sc.close();
	}	
	/*
	* 两个明确：
	* 		返回值类型：boolean
	* 		参数列表：String s
	*/
	/**  
	* @Title: isSymmetry  
	* @Description: 判断一个字符串是否是对称字符串 
	* @param s
	* @return    
	*/
	public static boolean isSymmetry(String s) {
		//把字符串反转，和反转前的字符串进行比较，如果内容相同，就说明是对称字符串
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String result = sb.toString();
		return result.equals(s);
	}
}
