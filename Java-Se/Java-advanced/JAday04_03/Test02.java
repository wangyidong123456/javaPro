package JAday04_03;

import java.util.ArrayList;
import java.util.HashSet;

public class Test02 {
	// set 一个不包含重复元素的collection，无序
	// HashSet
	// List 有序的collection
	// 与set不同，列表通常允许重复的元素
	// ArrayList
	// LinkedList
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// 在list中加入数据
		list.add("Jack");
		list.add("Rose");
		list.add("Trump");
		// 判断集合中是否存在Jack
		System.out.println(list.contains("Jack"));
		System.out.println("========================");
		// ArrayList当中存储自定义数据类型Person
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
	// 如果没有重写该equals方法,则比较地址值. 我们希望比较两个对象时,比较属性内容,所以重写该方法.
	// : Person对象比较是否相等的方法

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