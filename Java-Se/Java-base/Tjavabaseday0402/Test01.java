package Tjavabaseday0402;

public class Test01 {

	public static void main(String[] args) {
		Cat cat1=new Cat("��˹è","white");
		Cat cat2=new Cat("��˹è","white");
       System.out.println(cat1==cat2);
       System.out.println(cat1.equals(cat2));
       
      Cat cat3= cat1.createCat("��è", "black");
       System.out.println(cat3==cat1);
	}
      
}
