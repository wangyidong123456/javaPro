package Tjavabaseday052;

import java.util.ArrayList;

import org.junit.Test;

public class Test01 {
	@Test
	public void Te01() {
		// �򼯺�����������ĸ��ַ���,��������,���δ�ӡȡ�����ַ���
		ArrayList<String> array = new ArrayList<String>();
		array.add("wyd");
		array.add("wc");
		array.add("xs");
		array.add("xa");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

	@Test
	public void Te02() {
		// ����һ���ַ������飺
		// {�������ᡱ,����Զ�š�,�����޼ɡ�,������ͤ��,���Ŵ�ɽ��,��Ī���ȡ�}��
		// �������е�Ԫ����ӵ������У������������ŵ���Ա��ӡ������̨��
		String[] str={"������","��Զ��","���޼�","����ͤ","Ī����"};
		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			 array.add(str[i]);
		}
	    
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).startsWith("��")){
			System.out.println(array.get(i));
			}
		}
	}
     
	@Test
	public void Te03() {
		
	}
}
