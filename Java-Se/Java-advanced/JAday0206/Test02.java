package JAday0206;

public class Test02 {
	public static void main(String[] args) {
		//���һ��Shape�ӿں���������ʵ����Square��Circle��Ҫ�����£�
		//1��Shape�ӿ�����һ�����󷽷�area()������������һ��double���͵Ĳ���������һ��double���͵Ľ��
		//2��Square��Circle��ʵ����Shape�ӿڵ�area()���󷽷����ֱ��������κ�Բ�ε����������
		//3���ڲ������д���Square��Circle���󣬼���߳�Ϊ2������������Ͱ뾶Ϊ3��Բ�����
		Square sq=new Square();
		System.out.println(sq.area(2));
		Circle cr=new Circle();
		System.out.println(cr.area(3));
	}
}
