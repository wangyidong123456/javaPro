package JAday0203;

public class Math1 {

	public static void main(String[] args) {
		//Math的静态成员
		System.out.println("Math.E:"+Math.E);
		System.out.println("Math.P:"+Math.PI);
		//绝对值
		System.out.println("Math类的静态方法:"+Math.abs(5));
		System.out.println("Math类的静态方法:"+Math.abs(-5));
		//返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。
		System.out.println("Math类的静态方法:"+Math.ceil(3.14));
		System.out.println("Math类的静态方法:"+Math.ceil(3.84));
		System.out.println("Math类的静态方法:"+Math.ceil(-3.14));
		//返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数。
		System.out.println("Math类的静态方法:"+Math.floor(3.18));
		System.out.println("Math类的静态方法:"+Math.floor(3.84));
		System.out.println("Math类的静态方法:"+Math.floor(-3.14));
		//  返回两个 值中较大的一个。
		System.out.println("Math类的静态方法:"+Math.max(3.14,6));
	    //  返回两个 值中较小的一个。
		System.out.println("Math类的静态方法:"+Math.min(3.14,6));
		//返回第一个参数的第二个参数次幂（次方）的值。
		System.out.println("Math类的静态方法:"+Math.pow(2,10));
		//开根号
		System.out.println("Math类的静态方法:"+Math.sqrt(16));
		//取随机数[0,1)
		System.out.println("Math类的静态方法:"+Math.random());
		//取[1,100]
		for(int i=0;i<100;i++){
		int a=(int)(Math.random()*100+1);	
		System.out.print("["+a+"]");
		}
	}

}
