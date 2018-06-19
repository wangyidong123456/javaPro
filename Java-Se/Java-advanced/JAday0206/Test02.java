package JAday0206;

public class Test02 {
	public static void main(String[] args) {
		//设计一个Shape接口和它的两个实现类Square和Circle，要求如下：
		//1、Shape接口中有一个抽象方法area()，方法接收有一个double类型的参数，返回一个double类型的结果
		//2、Square和Circle中实现了Shape接口的area()抽象方法，分别求正方形和圆形的面积并返回
		//3、在测试类中创建Square和Circle对象，计算边长为2的正方形面积和半径为3的圆形面积
		Square sq=new Square();
		System.out.println(sq.area(2));
		Circle cr=new Circle();
		System.out.println(cr.area(3));
	}
}
