package JAday0101;


public class Test01 {
     
	public static void main(String[] args) {
		Manager m= new Manager("Jack", 5000, 2000);
		Waiter w1 = new Waiter("Rose", 3000);
		Waiter w2 = new Waiter("Obama", 3000);
		Cook c = new Cook("Trump", 6000);
		m.work();
		w1.work();
		w2.work();
		c.work();
        double sum;
        sum=m.getSalary()+m.getBonus()+w1.getSalary()+w2.getSalary()+c.getSalary();
        System.out.println("所有人的总收入为："+sum);
	}

}
