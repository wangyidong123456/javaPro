package Tjavabaseday0501;

import java.util.ArrayList;

import Tjavabaseday05.Student;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
        arr.add(1);
        arr.add("abc");
        arr.add(true);
        arr.add(new Student("haha",233));
       System.out.println(arr.toArray());
       System.out.println(1);
        
	}

}
