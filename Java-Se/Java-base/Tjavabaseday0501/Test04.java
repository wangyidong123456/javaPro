package Tjavabaseday0501;

import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
    	 ArrayList<Student1> students=new ArrayList<Student1>();
    	 inputData(students);
    	 outputData(students);
        
	}
	public  static void outputData(ArrayList<Student1> stu){
		for(int i=0;i<stu.size();i++){
			Student1 s=stu.get(i);
			System.out.print("\tId:"+s.getId());
			System.out.print("\tName:"+s.getName());
			System.out.print("\tAge:"+s.getAge());
			System.out.print("\tSex:"+s.getSex());
			System.out.print("\tAddress:"+s.getAddress());
			System.out.println("");
		}
	}
    public static void inputData(ArrayList<Student1> stu){
    	Scanner sc=new Scanner(System.in);
    	for(int i=1;i<=5;i++){
    		Student1 s= new Student1();
    		System.out.println("�������"+i+"��ѧ����Ϣ��");
    		System.out.println("ѧ�ţ�");
    		s.setId(sc.next());
    		System.out.println("������");
    		s.setName(sc.next());
    		System.out.println("���䣺");
    		s.setAge(sc.nextInt());
    		System.out.println("�Ա�");
    		s.setSex(sc.next());
    		System.out.println("��ַ��");
    		s.setAddress(sc.next());
    		stu.add(s);
    	}
    	sc.close();
    }
}
