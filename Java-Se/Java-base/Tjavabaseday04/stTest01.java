package Tjavabaseday04;

public class stTest01 {

	public static void main(String[] args) {
		student s = new student();
		s.name = "лу╥и";
		s.age = 25;
//		s.StudentID = "Geek001";

		System.out.println(s.name);
		System.out.println(s.age);
//		System.out.println(s.StudentID);
		s.study();
	}

}
