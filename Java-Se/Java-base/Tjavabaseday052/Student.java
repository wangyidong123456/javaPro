package Tjavabaseday052;

public class Student {
	  //
    private String  id;
    //ѧ��������
	private String name;
	//ѧ��������
	private int age;
    //ѧ�����Ա�
	private String sex;
	//ѧ���ĵ�ַ
	private String address;
	
	public  Student(){
		
	}
	public Student(String name,int age, String id,String sex,String address){
		super();
		this.id=id;
		this.sex=sex;
		this.address=address;
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public String getId() {
		return id;
	}
	
	public String getSex() {
		return sex;
	}
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString(){
		return "id:"+id+"\tname:"+name+"\tage:"+age+"\tsex:"+sex+"\taddress:"+address;
	}
}
