package JAday0305;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
     //���ڸ�ʽ��:SimpleDateFormat ��һ�������Ի����йصķ�ʽ����ʽ���ͽ������ڵľ�����
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat();
		Date dt=Calendar.getInstance().getTime();
		System.out.println(sdf.format(dt));
		//�����ڸ�ʽ��Ϊ�ַ���
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		System.out.println(sdf2.format(dt));
		//���ַ���ת��Ϊ����
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
