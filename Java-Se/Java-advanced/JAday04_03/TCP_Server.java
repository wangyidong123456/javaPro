package JAday04_03;
//package JAday0401_03;
//
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class TCP_Server {
//
//	public static void main(String[] args) throws Exception{
//		// TODO Auto-generated method stub
//		ServerSocket ss = new ServerSocket(9999);
//		//����
//		System.out.println("���������������");
//		Socket s = ss.accept();
//		System.out.println("ͨ�Ž����ɹ���");
//		
//		OutputStream os = s.getOutputStream();
//		PrintWriter pw = new PrintWriter(new OutputStreamWriter(os),true);
//	
//		InputStream is = s.getInputStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(is));
//		Scanner sc = new Scanner(System.in);
//		while(true){
//			System.out.println("������Կͻ���˵�Ļ���");
//			String s1 = sc.next();
//			pw.println(s1);
//			
//			String tem = br.readLine();
//			System.out.println("�������˽��յ���"+tem);
//		}
//		
//		
//		
//		
//		
//		
//	}
//}
//
