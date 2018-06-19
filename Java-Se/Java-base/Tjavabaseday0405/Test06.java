package Tjavabaseday0405;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//  统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入一个字符串：");
      String str=sc.nextLine();
      int uppercase=0;
      int lowercase=0;
      int number=0;
      for (int x = 0; x < str.length(); x++) {
			char ch=str.charAt(x);
			if(ch>='a'&&ch<='z'){
				lowercase++;
			}else if(ch>='A'&&ch<='Z'){
				uppercase++;
			}else if(ch>='0'&&ch<='9'){
				number++;
			}else{
				System.out.println("该字符"+ch+"非法");
			}
		
		}
  	System.out.println("大写字母字符出现的次数为："+uppercase+"次");
	System.out.println("小写字母字符出现的次数为："+lowercase+"次");
	System.out.println("数字字符出现的次数为："+number+"次");
	sc.close();
	}

}
