package Javase_test2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test06 {

	public static void main(String[] args) {
		DateFormat frt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		Date today = c.getTime();
		String td=frt.format(today);
		c.add(Calendar.DAY_OF_MONTH, 30);// ½ñÌì+Maxday
		Date backdate_should = c.getTime();
		System.out.println(c);
		System.out.println(td);
		System.out.println(backdate_should);
	}

}
