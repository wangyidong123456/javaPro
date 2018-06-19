package Test01;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: IfTest  
		 * @Description: 键盘录入两个数据，获取这两个数据的较大值
		 * @date 2017年10月12日 下午4:01:26    
		 * Company www.igeekhome.com
		 *    
		 * 键盘录入两个数据，获取这两个数据的较大值
		 * 
		 * 分析：
		 * 		A:看到键盘录入，我们就应该想到键盘录入的三步骤
		 * 			导包，创建对象，接收数据
		 * 		B:获取这两个数据的较大值，其实就是判断两个数据谁大，把大的输出就可以了。
		 * 
		 * 导包：
		 * 		A:手动导包
		 * 			import java.util.Scanner;
		 * 		B:鼠标点击红色叉叉，自动生成
		 * 		C:快捷键(推荐)
		 * 			ctrl+shift+o
		 */
//		if 来做
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a=sc.nextInt();
		System.out.println("请输入第一个整数：");
		int b=sc.nextInt();
		
		  if(a>b){
			  System.out.println("比较大的值是："+ a);			  
		  } else if(a<b){
			  System.out.println("比较大的值是："+ b);
		  } else   {
			  System.out.println("这个两个值是一样大的！！");
		  }
		sc.close();
	}
 
}
