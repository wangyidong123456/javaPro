package Tjavabaseday0405;

public class Test10 {

	public static void main(String[] args) {

			//��������
			StringBuilder sb = new StringBuilder();
			System.out.println("sb:"+sb);
			System.out.println("sb.capacity():"+sb.capacity());
			System.out.println("sb.length():"+sb.length());
			//��������		
//			public StringBuilder append(��������)
			StringBuilder sb2 = sb.append("hello");	
			System.out.println("sb:"+sb);
			System.out.println("sb2:"+sb2);
			System.out.println(sb == sb2); //true
			
			
			
			sb2.append("hello");
			sb2.append("world");
			sb2.append(true);
			sb2.append(100);
			
			StringBuilder sb1 = new StringBuilder();
			
			//��ʽ���
			sb1.append("hello").append("world").append(true).append(100);
			
			System.out.println("sb:"+sb1);
			
			//public StringBuilder reverse()
			sb1.reverse();
			System.out.println("sb:"+sb1);
			
			String s = "helloworld";
			StringBuilder sbr = new StringBuilder(s);
			System.out.println(sbr);


	}

}
