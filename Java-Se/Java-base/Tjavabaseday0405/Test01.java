package Tjavabaseday0405;

public class Test01 {

	public static void main(String[] args) {
		String s0="abc";
		String s1=new String("abc");
		char[] ch={'a','b','c'};
		String s2=new String(ch);	
//		int [] a={99,88,33,66,70};
//		String str=new String(a,0,5);
//		System.out.println(str);
		//String(char[] value,int index, int count):
		//把字符数组中的一部分数据封装成字符串对象
		char[] ch2={'0','a','b','c','1'};
		String s3=new String(ch2,1,3);
		System.out.println(s1=="abc");
		System.out.println("s0:"+s0);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s0==s1:"+(s0==s1));
		System.out.println("s0==s2:"+(s0==s2));
		System.out.println("s0==s3:"+(s0==s3));
		
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1==s3:"+(s1==s3));
		
		System.out.println("s2==s3:"+(s2==s3));
		String s4="abc";
		System.out.println("s0==s4:"+(s0==s4));
		String s5=new String ("abc");
		System.out.println("s2==s5:"+(s2==s5));
		
	}

}
