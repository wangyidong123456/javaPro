package JAday0305;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
     //日期格式化:SimpleDateFormat 是一个与语言环境有关的方式来格式化和解析日期的具体类
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat();
		Date dt=Calendar.getInstance().getTime();
		System.out.println(sdf.format(dt));
		//将日期格式化为字符串
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		System.out.println(sdf2.format(dt));
		//将字符串转化为日期
		String s="1990-12-13";
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date dt2=sdf3.parse(s);
			System.out.println(dt2.toString());
			System.out.println(sdf3.format(dt2));
		} catch (ParseException e) {	
			e.printStackTrace();
		}
		
	}

}
