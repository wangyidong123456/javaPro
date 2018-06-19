package JAday0305;

import java.util.Date;

public class Test01 {
	// Date:表示特点的瞬间，精确到毫秒
	public static void main(String [] args){
		Date dt =new Date();
		System.out.println(dt);
		//创建当前时间的Date对象
	
		long time = dt.getTime();
		System.out.println(time+"ms");		
		//制定毫秒值创建Date对象
		Date dt2 = new Date(0L);
		System.out.println(dt2);	
		//修改日期毫秒值
		dt2.setTime(14962627904L);
		System.out.println(dt2);	
		System.out.println(dt2.toString());
		//比较时间是否在它之后
		System.out.println("after:"+dt2.after(dt));
		//-1 before   0:equals    1:after
		System.out.println("compareTo:"+dt2.compareTo(dt));
	
	}
}
