package Tjavabaseday05;

public class Student {
    //ѧ��������
	private String name;
	//ѧ��������
	private int age;
    
	public  Student(){
		
	}
	public Student(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
