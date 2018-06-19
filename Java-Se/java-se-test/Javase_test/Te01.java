package Javase_test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Te01 {
	public static void main(String[] args) {
		String ss="13,12,23,1,22,45";
		String [] st1=ss.split(",");
		byte [] tbs=new byte[st1.length];
		for(int i=0;i<st1.length;i++){
			String tem=st1[i];
			byte tb=Byte.parseByte(tem);
			tbs[i]=tb;
		}
		
		Arrays.sort(tbs);
		System.out.println(Arrays.toString(tbs));
		Calendar c=Calendar.getInstance();
		Date d=c.getTime();
		System.out.println(d);
	}

}
