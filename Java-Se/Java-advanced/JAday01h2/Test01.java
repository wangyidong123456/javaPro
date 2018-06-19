package JAday01h2;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("小红", 12);
		Undergraduate ugd = new Undergraduate("小米", 12, "本科");
		stu.show();
		ugd.show();

		SuCar sc = new SuCar("奥迪", 50, 80);
		SuCar sc1 = new SuCar("奔驰", 100, 90);
		sc.show(120);
		System.out.println("");
		sc1.show(120);

	}

}
