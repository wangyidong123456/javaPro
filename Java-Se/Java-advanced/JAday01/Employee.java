package JAday01;
/*
 * ��Ա��
 */
public class Employee extends Person{
 
	 private String employeeId;
	 private int salary;
	 public Employee(){	 
	 } 
	public Employee(String cardId, String name, String sex,String employeeId, int salary) {
		//���ø���Ĺ��췽��
		super(cardId, name, sex);
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public Employee(String cardId, String name){
		//���õ��ǵ�ǰ���е�Employee(String cardId, String name, String sex,String employeeId, int salary)
		this(cardId, name,null,null,0);
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void work(){		
			System.out.println("�������߹���");
	
	 }

}
