package Tjavabaseday0501;

import java.util.ArrayList;

public class Test03 {

	public static void main(String[] args) {
//		����һ���ַ������飺{�������ᡱ,����Զ�š�,�����޼ɡ�,������ͤ��,���Ŵ�ɽ��,��Ī���ȡ�}��
//		 �������е�Ԫ����ӵ������У������������ŵ���Ա��ӡ������̨�ϡ�
		String []strarry={"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"};
		ArrayList<String> stringArrayList=new ArrayList<String>();
		for(int i=0;i<strarry.length;i++){
			stringArrayList.add(strarry[i]);
		}
		for(int i=0;i<stringArrayList.size();i++){
			String t=stringArrayList.get(i);
			if(t.startsWith("��")){
				System.out.println(t);
			}
		}
	}
	

}
