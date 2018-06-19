package Tjavabaseday0404;

public class Test01 {

	public static void main(String[] args) {
		Point p1=new Point(3,4);
		Point p2=new Point(6,8);
		System.out.println(p1.distance());
		System.out.println(p2.distance());
		System.out.println(p1.distance(p2));
		System.out.println(p2.distance(p1));
		System.out.println(p2.equals(p1));
		Point p3=new Point(3,4);
		System.out.println(p3.equals(p1));
	}

}
