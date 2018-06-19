package Tjavabaseday0401;

public class Test01 {

	public static void main(String[] args) {
		student s=new student();
        System.out.println(s.getName());
        
        student s2=new student("Îâ¾©",30);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
	}

}
