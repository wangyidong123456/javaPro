package JAday0203;

public class Test01 {
	public static final double PI = 3.1415926;

	public static void main(String[] args) {

		// final���εı����޷����ٴθ�ֵ
		int a = 10;
		a = 20;

		final int b = 20;
		// ��final���εı������ܶ��θ�ֵ
		// b = 30;
		System.out.println(a + b);
		// ʹ�þ�̬����
		double r = 2.5;
		double area = r * r * Test01.PI;
		System.out.println(area);

		// Ϊ���ñ������θ�ֵ,ָp�������ֻ��ָ��һ����ַ,����ָ��ڶ�����ַ
		final Person p = new Person();
		p.setName("����");
		p.setName("����");
		System.out.println(p.getName());

		// ��ַ���ܸ�,Ϊ�±��������
		// p = new Person();
		java.lang.String s = "abc";
		System.out.println(s);

		// ʹ����ȫ������ͬ���µ�������
		JAday0203.Person person = new JAday0203.Person();
		person.setName("Rose");
		System.out.println(person.getName());

		// ʹ����ȫ�����ʲ�ͬ��(���)�µ�������
		// JAday0203.other.Person person2=new JAday0203.Person();
		// System.out.println(person2.getName());

	}

}
