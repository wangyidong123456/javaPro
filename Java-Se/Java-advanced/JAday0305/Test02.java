package JAday0305;

import java.util.Calendar;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//�����Լ���ʵ��
		Calendar cal =Calendar.getInstance();
		//����ָ����ʱ��
//		cal.set(1990,7,12);
//		cal.set(1990,7,12,12,0,12);
		//�޸��������е�ĳ���ֶε�ֵ
		cal.set(Calendar.YEAR, 1990);
		System.out.println(Calendar.YEAR);
		System.out.println("��"+cal.get(Calendar.YEAR));
		System.out.println("�·�"+(cal.get(Calendar.MONTH)+1));
		System.out.println("��"+cal.get(Calendar.DATE));
		System.out.println("ʱ"+cal.get(Calendar.HOUR));
		System.out.println("��"+cal.get(Calendar.MINUTE));
		System.out.println("��"+cal.get(Calendar.SECOND));
		
		//��ȡ����������ת�ɵ����ڶ���
		Date today=cal.getTime();
		System.out.println(today.toString());
		
		
	}

}
