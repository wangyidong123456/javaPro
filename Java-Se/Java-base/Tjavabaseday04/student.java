package Tjavabaseday04;


public class student {

	private String studentId="1000";
	public String name="wyd";
	Integer age;
	public student() {
		super();
	}
	public student(String studentId, String name, Integer age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}
	public String studentId() {
		return studentId;
	}
	public void setStudentID(String studentID) {
		this.studentId = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	
	

	public void study() {
		System.out.println("�ú�ѧϰ���������ϣ�");
	}


	public void eat() {
		System.out.println("ѧϰ���ˣ�Ҫ�Է���");
	}
	
	public String toString(){
		return studentId+":"+name+":"+age;
	}
	
  
}
