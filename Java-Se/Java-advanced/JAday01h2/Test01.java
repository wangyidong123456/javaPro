package JAday01h2;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("С��", 12);
		Undergraduate ugd = new Undergraduate("С��", 12, "����");
		stu.show();
		ugd.show();

		SuCar sc = new SuCar("�µ�", 50, 80);
		SuCar sc1 = new SuCar("����", 100, 90);
		sc.show(120);
		System.out.println("");
		sc1.show(120);

	}

}
