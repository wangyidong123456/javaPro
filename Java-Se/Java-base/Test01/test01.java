package Test01;

/*
 * bbbbbbbbbbbbb
 */
public class test01 {

	/**
	 * aaaaaaaaaaaaaaaaaaaa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("壹");
		System.out.println(12);
		System.out.println(-23);
		// 字符串常量
		System.out.println("HelloWorld");

		// 整数常量
		System.out.println(12);
		System.out.println(-23);

		// 小数常量
		System.out.println(12.34);

		// 字符常量
		System.out.println('a');
		System.out.println('0');

		// 布尔常量
		System.out.println(true);
		System.out.println(2 + 2);

		byte b = 10;
		System.out.println(10);
		System.out.println(b);

		// 定义short类型的变量
		short s = 100;
		System.out.println(s);

		// 定义int类型的变量
		int i = 10000;
		System.out.println(i);

		// 定义long类型的变量
		long l = 1000000000000000L;
		System.out.println(l);

		// 定义float类型的变量
		float f = 12.34F;
		System.out.println(f);

		// 定义double类型的变量
		double d = 12.34;
		System.out.println(d);

		// 定义char类型的变量
		char c = 'a';
		System.out.println(c);

		// 定义boolean类型的变量
		boolean bb = false;
		System.out.println(bb);
		/*
		 * +:是一个运算符，做加法运算的。 我们在做运算的时候，一般要求参与运算的数据类型必须一致。
		 * 
		 * 类型转换： 隐式转换 强制转换
		 * 
		 * 隐式转换 byte 1,short2,char2 -- int4 -- long8 -- float4 -- double8
		 */

		System.out.println(3 + 4);

		// 定义两个int类型的变量
		int a = 3;

		int b1 = 4;
		int c1 = a + b1;
		System.out.println(c1);

		// 定义一个byte类型,定义一个int类型
		byte bb1 = 2;
		int cc = 5;
		System.out.println(bb1 + cc);

		// 我能不能不直接输出，用一个变量接受呢?
		// 用变量接受，这个变量应该有类型
		// 可能损失精度
		// byte dd = bb + cc;
		int ii1 = 100;
		byte dd = (byte) ii1;
		System.out.println(dd);

		// char->int 按照ASCII码进行转化
		// A-Z 65-90
		// a-z 97-122
		// 0-9 48-57
		char ch = 'b';
		int ii = ch;
		System.out.println("ii=" + ii);

		// + +号两边是数字类型,则执行正常的数学运算
		// + +号两边出现了一个字符串,则执行连接运算
		int i1 = 10;
		double i2=(double)i1;
		double f1 = 20.13;		
		double d1 = i2 + f1;
		System.out.println(i2);
		System.out.println(f1);
		System.out.println(d1);
		// step 1: i1->float

		// step 2: i1+f1=30.12f
		// step 3: 30.12f->30.12d;
		// step 4: d1=30.12d;

		String s1 = "11.22";
		String s2 = s1 + i1;
		System.out.println("s2=" + s2);

		System.out.println(Integer.MAX_VALUE);

//		for (char ch1 = 0; ch1 <= 127; ch1++) {
//
//			System.out.println(ch1);
//		}
//		
//		for (int u = 0; u <= 127; u++) {
//			char uu = (char) u;
//			System.out.println(uu);
//
//		}
//	

	}

}
