package Tjavabaseday0503;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test0201 {

	public static void main(String[] args)  {
		try {
			BufferedReader br = new BufferedReader(new FileReader("d:\\rss.txt"));
			String t;
			while((t=br.readLine())!=null){
				System.out.println(t);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
