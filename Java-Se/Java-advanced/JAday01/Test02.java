package JAday01;

public class Test02 {

	public static void main(String[] args) {
		Person p=new Person("96465","唐伯虎","男");
		p.work();
		Employee e1=new Employee("42323","邦德","男","007",8888);
        e1.work();
        //方法重写后不再调用父类方法
        Person p1=e1;
        p1.work();
       
	}

}
