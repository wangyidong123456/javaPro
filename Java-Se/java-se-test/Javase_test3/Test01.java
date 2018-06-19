package Javase_test3;

public class Test01 {
	public static void main(String[] args) {
		
	try{
		int i=1/0;
		float f=Float.parseFloat("ad");
		System.out.println(i+f);
	}catch(NumberFormatException nfe){
		
	}finally{
		System.out.println("asdf");
	}
	System.out.println("12");
	}
}	
