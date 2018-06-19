
package JAday0101;


public class Manager extends Employee {
	/**
	 * @Fields bonus:½±½ð
	 */
   private double bonus;
   public Manager(){
	   super();
   }
   public Manager(String name,double salary,double bonus){
	   super(name,salary);
	   this.bonus=bonus;
	   
   }
   public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public void work() {
		System.out.println("¹ÜÀí¾Æµê");
	}
}

