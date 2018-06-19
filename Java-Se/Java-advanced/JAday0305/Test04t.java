package JAday0305;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04t {
	public static void main(String[] args) {
	/*
	 * 从控制台输入一个年月日时分秒
	 * 将其转化为日期
	 * 并获取其中的年\月\日\星期几 的值
	 * 并获取者一天是这一年的第几天
	 * 计算100天后的日期
	 * 输入格式按照中国习惯
	 */
	System.out.println("请输入一个时间格式为：yyyy-MM-dd HH:mm:ss");	
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	try {
		Date dt=sdf.parse(s);
//		System.out.println(dt.toString());
//		System.out.println(sdf.format(dt));
		Calendar cal =Calendar.getInstance();
		cal.setTime(dt);
		System.out.println(cal.get(Calendar.YEAR)+"年");
		System.out.println((cal.get(Calendar.MONTH)+1)+"月份");
		System.out.println(cal.get(Calendar.DATE)+"日");
		System.out.println("星期"+cal.get(Calendar.DAY_OF_WEEK ));
		System.out.println("第"+cal.get(Calendar.DAY_OF_YEAR)+"天");
		cal.set(Calendar.DATE, cal.get(Calendar.DATE)+100);
//		cal.add(Calendar.DAY_OF_YEAR, 100);
		Date today=cal.getTime();
		System.out.println(sdf.format(today));
	} catch (ParseException e) {
		e.printStackTrace();
	}//转化为日期	


	
		
		
		
		
		sc.close();
	}

	

}
