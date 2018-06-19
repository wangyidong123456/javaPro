package JAday0306H1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Person {
	/*
	 * ����һ����Person(name,sex,Date,birth) ������Զ���(OOP)��˼�������ӱ�Ҫ�Ĺ��췽�����Ա����
	 * ���һ���������������� ���һ�������������丳ֵ��ע���������ݵĺϷ���yyyy-MM-dd yyyy/MM/dd
	 */
	// ����
	String name;
	// �Ա�
	String sex;
	// ��������
	String birth;

	public Person() {

	}

	public Person(String name, String sex, String birth) {
		super();
		this.name = name;
		this.sex = sex;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public static String cAge(String p) {
		try {
			Date dt = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(dt);
			long l1 = cal.getTimeInMillis();
			// System.out.println(l1);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dt2 = sdf.parse(p);
			cal.setTime(dt2);
			long l2 = cal.getTimeInMillis();
			// System.out.println(l2);
			long age = 0;
			// Integer.MAX_VALUE=2147483647
			// age=(l1-l2)/(1000*3600*24*365); ������˷�����int��������
			// age=(l1-l2)/(1000L*3600*24*365);
			// age=(l1-l2)/(1000*3600)/(24*365);
			// age=(l1-l2)/31536000000L;
			age = (l1 - l2) / 1000 / 3600 / 24 / 365;
			// System.out.println(age);
			String s = age + "��";
			return s;
		} catch (ParseException e) {
			e.printStackTrace();
			return "-1";
		}

	}

	public static String getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���˵ĳ������ڣ���ʽΪyyyy-MM-dd");
		String br = sc.nextLine();
		String age = cAge(br);
		System.out.println("����˵�����Ϊ" + age);
		sc.close();
		return age;
	}

	public static void main(String[] args) {
		String age;
		Person p = new Person("����", "��", "2000-04-16");
		age = cAge(p.birth);
		System.out.println(p.name + "������Ϊ" + age);
		getAge();

	}

}
