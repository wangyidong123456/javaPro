package JAday0305;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04t {
	public static void main(String[] args) {
	/*
	 * �ӿ���̨����һ��������ʱ����
	 * ����ת��Ϊ����
	 * ����ȡ���е���\��\��\���ڼ� ��ֵ
	 * ����ȡ��һ������һ��ĵڼ���
	 * ����100��������
	 * �����ʽ�����й�ϰ��
	 */
	System.out.println("������һ��ʱ���ʽΪ��yyyy-MM-dd HH:mm:ss");	
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	try {
		Date dt=sdf.parse(s);
//		System.out.println(dt.toString());
//		System.out.println(sdf.format(dt));
		Calendar cal =Calendar.getInstance();
		cal.setTime(dt);
		System.out.println(cal.get(Calendar.YEAR)+"��");
		System.out.println((cal.get(Calendar.MONTH)+1)+"�·�");
		System.out.println(cal.get(Calendar.DATE)+"��");
		System.out.println("����"+cal.get(Calendar.DAY_OF_WEEK ));
		System.out.println("��"+cal.get(Calendar.DAY_OF_YEAR)+"��");
		cal.set(Calendar.DATE, cal.get(Calendar.DATE)+100);
//		cal.add(Calendar.DAY_OF_YEAR, 100);
		Date today=cal.getTime();
		System.out.println(sdf.format(today));
	} catch (ParseException e) {
		e.printStackTrace();
	}//ת��Ϊ����	


	
		
		
		
		
		sc.close();
	}

	

}
