package Tjavabaseday0501;

public class Student1 {
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
		
		public  Student1(){
			
		}
		public Student1(String name,int age, String id,String sex,String address){
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

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
