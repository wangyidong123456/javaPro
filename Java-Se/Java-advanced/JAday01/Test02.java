package JAday01;

public class Test02 {

	public static void main(String[] args) {
		Person p=new Person("96465","�Ʋ���","��");
		p.work();
		Employee e1=new Employee("42323","���","��","007",8888);
        e1.work();
        //������д���ٵ��ø��෽��
        Person p1=e1;
        p1.work();
       
	}

}
