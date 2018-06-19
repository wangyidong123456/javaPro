package Tjavabaseday0503;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy {

	public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("E:/holle/.metadata/Java-Se/Java-base/RPG/Game.java");
        FileWriter fw=new FileWriter("d:aa.java"); 
        char [] c=new char[1024];
        int len=0;
       while((len=fr.read(c))!=-1){
        	fw.write(c,0,len);
        }
//        System.out.println(c.length);
        fw.flush();
        fw.close();
        fr.close();
	}

}
