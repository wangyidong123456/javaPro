package Tjavabaseday05end;

public class Student {
	  //
    private String  id;
    //ѧ��������
	private String name;
	//ѧ��������
	private String age;
    //ѧ�����Ա�
	private String sex;
	//ѧ���ĵ�ַ
	private String address;
	
	public  Student(){
		
	}
	public Student(String id,String name, String age,String sex,String address){
		super();
		this.id=id;
		this.sex=sex;
		this.address=address;
		this.name=name;
		this.age=age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
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

	public void setAge(String age) {
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
