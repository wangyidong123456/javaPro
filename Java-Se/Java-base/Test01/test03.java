package Test01;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		/**  
		 * @ClassName: IfTest2  
		 * @Description: 键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
		 * @date 2017年10月12日 下午4:05:01    
		 * Company www.igeekhome.com
		 *   
		 * 键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
		 * 90-100	优秀
		 * 80-90	好
		 * 70-80	良
		 * 60-70	及格
		 * 60以下	不及格
		 * 
		 * 分析：
		 * 		A:键盘录入学生考试成绩
		 * 			三步骤
		 * 		B:通过简单的分析，我们决定采用if语句格式3来实现
		 * 
		 * 程序一定要考虑周全了。
		 * 		安全数据
		 * 		边界数据
		 * 		错误数据
		 */
         Scanner sc=new Scanner(System.in);
         System.out.println("请输入考试成绩：");
           int a=sc.nextInt();
                if (a>=0&&a<60){
        	   System.out.println("考试成绩为不及格。");
           }else if(a>=60&&a<70){
        	   System.out.println("考试成绩为及格。");
           }else if(a>=70&&a<80){
        	   System.out.println("考试成绩为良。");
           }else if(a>=80&&a<90){
        	   System.out.println("考试成绩为好。");
           }else if(a>=90&&a<=100){
        	   System.out.println("考试成绩为优秀。");
           }else if(a>100||a<0){
        	   System.out.println("输入错误"); 
           }
           sc.close();
	}

}
