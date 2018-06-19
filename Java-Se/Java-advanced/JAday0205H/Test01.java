package JAday0205H;

public class Test01 {

	public static void main(String[] args) {
		Cat sanmao=new Cat();
		sanmao.craw();
		
		ICraw ic=new Dog();
		ic.craw();
		
		ic=new Cat();
		ic.craw();
		
		Frog f=new Frog();
		ic=new Frog();
		ic=f;
		ic.craw();	
		ISwimming is=f; 
		is.swim();
	}

}
