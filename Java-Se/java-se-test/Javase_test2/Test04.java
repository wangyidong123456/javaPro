package Javase_test2;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
	int total=0;
	public static void main(String[] args) {
		// ������36����A-Z��0-9��Χ�ڡ���дһ������
		// �Ӹ����ļ��������ѡ��N����ͬ���ַ�������ӡ�����е����к����
		Test04 ts=new Test04();
		List<String> list = new ArrayList<String>();
		List<String> newlist = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
//		list.add("D");
//		list.add("E");
//		list.add("F");
//		list.add("G");
		ts.combe(newlist, list, 3-1);
	}

	public void combe(List<String> newlist, List<String> list, int len) {
		if(len==-1){
			System.out.println(newlist.toString());
			total++;
			System.out.println(total);
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			newlist.add(list.get(i));
			combe(newlist, list, len-1);
		}
	}

}
