package JAday01;

public class Test01 {

	public static void main(String[] args) {
	Employee e1=new Employee();
      e1.setCardId("13246546");
      e1.setName("张三丰");
      e1.setSex("男");
      e1.setEmployeeId("geek20180402");
      e1.setSalary(8888);
      Employee e2=new Employee("13246546","张三","男","geek1",9999);
      e2.toString();
	}

}
