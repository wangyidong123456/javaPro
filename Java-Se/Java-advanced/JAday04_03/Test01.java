package JAday04_03;

import java.util.HashSet;
import java.util.Iterator;

public class Test01 {
	//set һ���������ظ�Ԫ�ص�collection������
	//      HashSet
	//List �����collection
	//      ��set��ͬ���б�ͨ�������ظ���Ԫ��
	//      ArrayList
	//      LinkedList
	public static void main(String[] args) {
           HashSet<String> hs=new HashSet<String>();
           //���set����δ����ָ����Ԫ�أ�����Ӵ�Ԫ��(��ѡ).
           hs.add("aa");
           hs.add("ab");
           hs.add("bc");
           hs.add("dd");
           hs.add("ee");
           hs.add("ff");
           hs.add("ff");
           System.out.println(hs);
            //  ��ȡԪ�أ�ֻ���õ�����
           for(Iterator<String> itr=hs.iterator();itr.hasNext();){
        	   System.out.println(itr.next());
           }
           System.out.println("");
           //foreach ����
           for(String str:hs){
        	   System.out.print(str);
           }
	}
}
