package JAday0201;

public class Person extends Animal {
	public void eat() {
		System.out.println("�ù��߳Է�");
	}
	
	/**  
	* @Title: sleep  
	* @Description: ʵ�ָ����˯������  
	* @see com.igeek_03.Animal#sleep()
	*/
	@Override
	public void sleep() {
		System.out.println("�ڴ�������˯��");
	}

	//�����������з���
	/**  
	* @Title: study  
	* @Description: ѧϰ����     
	*/
	public void study() {
		System.out.println("ѧϰ�鱾֪ʶ��ʵ����ѧ");
	}
	
	/**  
	* @Title: work  
	* @Description: ��������      
	*/
	public void work() {
		System.out.println("Ŭ��,�ù�ʱ��");
	}

}
