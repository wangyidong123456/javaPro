package Tjavabaseday0503;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test0202 {

	public static void main(String[] args)  {
		try {
			BufferedReader br = new BufferedReader(new FileReader("d:\\rss.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\rsss.txt"));
			String t;
			while((t=br.readLine())!=null){
				bw.write(t);
				bw.newLine();
			}
			bw.flush();
			bw.close();
			br.close();
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
