package Tjavabaseday0405;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//  ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
      Scanner sc=new Scanner(System.in);
      System.out.println("������һ���ַ�����");
      String str=sc.nextLine();
      int uppercase=0;
      int lowercase=0;
      int number=0;
      for (int x = 0; x < str.length(); x++) {
			char ch=str.charAt(x);
			if(ch>='a'&&ch<='z'){
				lowercase++;
			}else if(ch>='A'&&ch<='Z'){
				uppercase++;
			}else if(ch>='0'&&ch<='9'){
				number++;
			}else{
				System.out.println("���ַ�"+ch+"�Ƿ�");
			}
		
		}
  	System.out.println("��д��ĸ�ַ����ֵĴ���Ϊ��"+uppercase+"��");
	System.out.println("Сд��ĸ�ַ����ֵĴ���Ϊ��"+lowercase+"��");
	System.out.println("�����ַ����ֵĴ���Ϊ��"+number+"��");
	sc.close();
	}

}
