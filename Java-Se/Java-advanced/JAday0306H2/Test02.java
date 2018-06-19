package JAday0306H2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
		// 读取文件中的数据，提取有效的网址信息
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:\\rss.txt"));
			while ((br.readLine()) != null) {
//				System.out.println(t);
				//提取有效网址操作
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
