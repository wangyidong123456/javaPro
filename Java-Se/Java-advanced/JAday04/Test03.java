package JAday04;

import java.util.LinkedList;

public class Test03 {

	public static void main(String[] args) {
		LinkedList<String> linkList =new LinkedList<String>();
		linkList.add("abc");
		linkList.add("123");
		linkList.add(1,"hehe");
		linkList.add("poker");
		linkList.addFirst("haha");
		for(int i=0;i<linkList.size();i++){
			System.out.println(linkList.get(i));
		}
	}

}
