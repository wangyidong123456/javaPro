package JAday04_03;
//package JAday0401_03;
//
//import java.io.*;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class TCP_Click {
//
//	public static void main(String[] args) throws Exception{
//		
//		//�ͻ�����������������˽���ͨ��
//		Socket s = new Socket("192.168.13.2",9999);
//		InputStream is = s.getInputStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(is));
//		
//		OutputStream os = s.getOutputStream();
//		PrintWriter pw = new PrintWriter(new OutputStreamWriter(os),true);
//		Scanner sc = new Scanner(System.in);
//		while(true){
//			
//			String tem = br.readLine();
//			System.out.println("�ͻ��˽��յ���"+tem);
//			
//			
//			System.out.println("������Է�������˵�Ļ���");
//			String s1 = sc.nextLine();
//			
//			pw.println(s1);
//		}
//		
//		
//		
//		
//	}
//
//}
