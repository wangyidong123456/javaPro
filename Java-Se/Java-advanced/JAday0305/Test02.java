package JAday0305;

import java.util.Calendar;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//创建自己的实例
		Calendar cal =Calendar.getInstance();
		//设置指定的时间
//		cal.set(1990,7,12);
//		cal.set(1990,7,12,12,0,12);
		//修改日历类中的某个字段的值
		cal.set(Calendar.YEAR, 1990);
		System.out.println(Calendar.YEAR);
		System.out.println("年"+cal.get(Calendar.YEAR));
		System.out.println("月份"+(cal.get(Calendar.MONTH)+1));
		System.out.println("日"+cal.get(Calendar.DATE));
		System.out.println("时"+cal.get(Calendar.HOUR));
		System.out.println("分"+cal.get(Calendar.MINUTE));
		System.out.println("秒"+cal.get(Calendar.SECOND));
		
		//获取该日历对象转成的日期对象
		Date today=cal.getTime();
		System.out.println(today.toString());
		
		
	}

}
