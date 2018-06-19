package JAday0101;

public class Cook extends Employee{
     public Cook(){
    	 super();
     }
     public Cook(String name, double salary) {
 		super(name,salary);
 	}
     @Override
     public void work() {
 		System.out.println("ื๖ทน");
 	}

}
