package JAday0202;

public class Chinese {
	// ��̬��Ա�������������
	// ����
	public static String country = "�й�";
	// ��ͨ��Ա��ÿ���������ͨ��Ա�����ݲ�ͬ
	// ����
	private String name;
	// ����
	private int age;
	// ְҵ
	private String work;
	public Chinese(){
		super();
	}
	public Chinese(String name, int age, String work) {
		super();
		this.name = name;
		this.age = age;
		this.work = work;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Chinese.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	/**  
	* @Title: normalMethod  
	* @Description: ��ͨ��ʵ����Ա����      
	*/

	public void normalMethod() {
		System.out.println("��ͨ����");
	}
	
	/**  
	* @Title: method  
	* @Description: ��̬��Ա����      
	*/
	public static void method() {
		//��̬��������ֱ�ӷ��ʷǾ�̬��Ա
		//System.out.println(name);
		//normalMethod();
		System.out.println("static����");
	}
}
