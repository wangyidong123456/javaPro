package Tjavabaseday05end;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test0101 {

	public static void main(String[] args) {
//		
//		Student s1=new Student("001","张翠山","40","男","武当山");
//		Student s2=new Student("007","周星驰","60","男","香港");
//		Student s3=new Student("005","周芷若","20","女","峨眉山");
//		saveToFile(s1,"d:\\student.txt");
//		saveToFile(s2,"d:\\student.txt");
//		saveToFile(s3,"d:\\student.txt");
		Student ss=readFromFile("d:\\student.txt");
		System.out.print("\t学号:" + ss.getId());
		System.out.print("\t姓名:" + ss.getName());
		System.out.print("\t年龄:" + ss.getAge());
		System.out.print("\t性别:" + ss.getSex());
		System.out.print("\t地址:" + ss.getAddress());
		System.out.println("");
	}
    public static void saveToFile(Student s,String t){
    	try {
			BufferedWriter bw=new BufferedWriter(new FileWriter(t,true));
			bw.write(s.getId());
			bw.newLine();
			bw.write(s.getName());
			bw.newLine();
			bw.write(s.getAge());
			bw.newLine();
			bw.write(s.getSex());
			bw.newLine();
			bw.write(s.getAddress());
			bw.newLine();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {	
			e.printStackTrace();
		}
    }
    public static Student readFromFile(String t){
    	Student s=new Student();
    	try {
			BufferedReader br=new BufferedReader(new FileReader(t));
		
			s.setId(br.readLine());
			s.setName(br.readLine());
			s.setAge(br.readLine());
			s.setSex(br.readLine());
			s.setAddress(br.readLine());
			br.close();
			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
    }
}
