package JAday0306H2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
		// ��ȡ�ļ��е����ݣ���ȡ��Ч����ַ��Ϣ
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:\\rss.txt"));
			while ((br.readLine()) != null) {
//				System.out.println(t);
				//��ȡ��Ч��ַ����
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
