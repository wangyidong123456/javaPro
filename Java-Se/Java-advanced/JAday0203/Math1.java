package JAday0203;

public class Math1 {

	public static void main(String[] args) {
		//Math�ľ�̬��Ա
		System.out.println("Math.E:"+Math.E);
		System.out.println("Math.P:"+Math.PI);
		//����ֵ
		System.out.println("Math��ľ�̬����:"+Math.abs(5));
		System.out.println("Math��ľ�̬����:"+Math.abs(-5));
		//������С�ģ���ӽ��������double ֵ����ֵ���ڵ��ڲ�����������ĳ��������
		System.out.println("Math��ľ�̬����:"+Math.ceil(3.14));
		System.out.println("Math��ľ�̬����:"+Math.ceil(3.84));
		System.out.println("Math��ľ�̬����:"+Math.ceil(-3.14));
		//�������ģ���ӽ��������double ֵ����ֵС�ڵ��ڲ�����������ĳ��������
		System.out.println("Math��ľ�̬����:"+Math.floor(3.18));
		System.out.println("Math��ľ�̬����:"+Math.floor(3.84));
		System.out.println("Math��ľ�̬����:"+Math.floor(-3.14));
		//  �������� ֵ�нϴ��һ����
		System.out.println("Math��ľ�̬����:"+Math.max(3.14,6));
	    //  �������� ֵ�н�С��һ����
		System.out.println("Math��ľ�̬����:"+Math.min(3.14,6));
		//���ص�һ�������ĵڶ����������ݣ��η�����ֵ��
		System.out.println("Math��ľ�̬����:"+Math.pow(2,10));
		//������
		System.out.println("Math��ľ�̬����:"+Math.sqrt(16));
		//ȡ�����[0,1)
		System.out.println("Math��ľ�̬����:"+Math.random());
		//ȡ[1,100]
		for(int i=0;i<100;i++){
		int a=(int)(Math.random()*100+1);	
		System.out.print("["+a+"]");
		}
	}

}
