package Tjavabaseday05;

public class Test01 {

	public static void main(String[] args) {
		Student [] students=new Student[3];
		students[0]=new Student("张三",13);
		students[1]=new Student("李四",14);
		students[2]=new Student("王五",15);
		
		for(int x=0;x<students.length;x++){
			System.out.println(students[x].getName()+":"+students[x].getAge());
		}
		
	}

}
