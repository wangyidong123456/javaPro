package JAday0305;

import java.util.Date;

public class Test01 {
	// Date:��ʾ�ص��˲�䣬��ȷ������
	public static void main(String [] args){
		Date dt =new Date();
		System.out.println(dt);
		//������ǰʱ���Date����
	
		long time = dt.getTime();
		System.out.println(time+"ms");		
		//�ƶ�����ֵ����Date����
		Date dt2 = new Date(0L);
		System.out.println(dt2);	
		//�޸����ں���ֵ
		dt2.setTime(14962627904L);
		System.out.println(dt2);	
		System.out.println(dt2.toString());
		//�Ƚ�ʱ���Ƿ�����֮��
		System.out.println("after:"+dt2.after(dt));
		//-1 before   0:equals    1:after
		System.out.println("compareTo:"+dt2.compareTo(dt));
	
	}
}
