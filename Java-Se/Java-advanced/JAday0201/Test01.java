package JAday0201;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.sleep();
		p.work();
		p.study();
		System.out.println("===================");
		// ʹ�ö�̬,ֻ���ֳ�����(�Ⱥ���ߵ���������)�Ĺ���
		Animal a = new Person();
		a.eat();
		a.sleep();
		// ����feed����
		// ʹ�ö�̬����ʽ,�����������,��ֵ����������
//		 Animal a22=new Person();
//		 feed(a22);
//		 Person p22=new Person();
//		 feed(p22);

		feed(new Person());
		System.out.println("===================");
		// ��ǿ������ת��ʱ,������ʲô����,תΪʲô����.
		// ���ʹ�ô�,ʹ������������,�����ʱ������,����ʱ�ᱨ��,��ʾ����ת���쳣:java.lang.ClassCastException

		Animal a2 = new Person();
//		Person p2 = (Person) a;
		method(a2);
		System.out.println("==============================");
	
		
	
		

	}

	public static void feed(Animal x) {
		// x���Խ���Animal�������������
		// ���øö���ĳԷ�����
		System.out.println("feed�����ڵĶ���Է�������������");
		x.eat();
	}
public static void method(Animal a) {	
		//�ȳԷ�
		a.eat();
		//����ǹ�,�Ϳ���,������˾�ѧϰ����
		if(a instanceof Dog) {
			//ǿתΪ��
			Dog d = (Dog)a;
			//���ù��ķ���
			d.keepDoor();
		}	
		//�����,�Ϳ���,������˾�ѧϰ����
		if(a instanceof Person) {
			//ǿתΪ��
			Person p = (Person)a;
			//�����˵ķ���
			p.study();
			p.work();
		}
	}

	
}
