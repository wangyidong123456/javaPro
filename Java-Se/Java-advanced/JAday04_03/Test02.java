package JAday04_03;

import java.util.ArrayList;
import java.util.HashSet;

public class Test02 {
	// set һ���������ظ�Ԫ�ص�collection������
	// HashSet
	// List �����collection
	// ��set��ͬ���б�ͨ�������ظ���Ԫ��
	// ArrayList
	// LinkedList
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// ��list�м�������
		list.add("Jack");
		list.add("Rose");
		list.add("Trump");
		// �жϼ������Ƿ����Jack
		System.out.println(list.contains("Jack"));
		System.out.println("========================");
		// ArrayList���д洢�Զ�����������Person
		ArrayList<Person> list2 = new ArrayList<Person>();
		Person p = new Person("Jack");
		Person p2 = new Person("Rose");
		Person p3 = new Person("Trump");
		list2.add(p);
		list2.add(p2);
		list2.add(p3);
		System.out.println(list2.contains(new Person("Jack")));
		System.out.println(list2);

		HashSet<Person> hs = new HashSet<Person>();
		hs.add(p);
		hs.add(p2);
		hs.add(p3);
		System.out.println(hs.contains(new Person("Jack")));
		System.out.println(hs.contains("Jack"));
		System.out.println(p);
	}
}

class Person {
	private String name;
//	private int age;

	public Person(String name) {
		this.name = name;
//		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// ���û����д��equals����,��Ƚϵ�ֵַ. ����ϣ���Ƚ���������ʱ,�Ƚ���������,������д�÷���.
	// : Person����Ƚ��Ƿ���ȵķ���

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}