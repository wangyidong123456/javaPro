package JAday0306H1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Person {
	/*
	 * 定义一个类Person(name,sex,Date,birth) 按照面对对象(OOP)的思想给类添加必要的构造方法与成员方法
	 * 添加一个方法，计算年龄 添加一个方法，给年龄赋值，注意输入数据的合法性yyyy-MM-dd yyyy/MM/dd
	 */
	// 名字
	String name;
	// 性别
	String sex;
	// 出生日期
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
			// age=(l1-l2)/(1000*3600*24*365); 这个串乘法超过int长度上限
			// age=(l1-l2)/(1000L*3600*24*365);
			// age=(l1-l2)/(1000*3600)/(24*365);
			// age=(l1-l2)/31536000000L;
			age = (l1 - l2) / 1000 / 3600 / 24 / 365;
			// System.out.println(age);
			String s = age + "岁";
			return s;
		} catch (ParseException e) {
			e.printStackTrace();
			return "-1";
		}

	}

	public static String getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个人的出生日期，格式为yyyy-MM-dd");
		String br = sc.nextLine();
		String age = cAge(br);
		System.out.println("这个人的年龄为" + age);
		sc.close();
		return age;
	}

	public static void main(String[] args) {
		String age;
		Person p = new Person("张三", "男", "2000-04-16");
		age = cAge(p.birth);
		System.out.println(p.name + "的年龄为" + age);
		getAge();

	}

}
