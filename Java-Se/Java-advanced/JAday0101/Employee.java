package JAday0101;

/**
 * ����Ա����
 * 
 * @author student
 *
 */
public class Employee {
	private String name;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void work() {
		System.out.println("work");
	}

}
