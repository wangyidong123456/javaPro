package Tjavabaseday0501;

import java.util.ArrayList;

public class Test02 {
	//public boolean add(E e):���Ԫ��

	public static void main(String[] args) {
		ArrayList<String> stringArrayList=new ArrayList<String>();
		stringArrayList.add("abc");
		stringArrayList.add("123");
		stringArrayList.add("ght");
		stringArrayList.add("567");
		System.out.println(stringArrayList);
		
        //public boolean add(int index, E element):���Ԫ��
		stringArrayList.add(1,"geek");  
		System.out.println(stringArrayList);	
		stringArrayList.add(3,"geek");  
		System.out.println(stringArrayList);
		//IndexOutOfBoundsEsception
        //stringArrayList.add(6,"geek");  
        //System.out.println(stringArrayList);

        // ���ϳ��� public int size ();���ؼ����е�Ԫ�ظ���
		System.out.println("size:"+stringArrayList.size());	
		for(int i=0;i<stringArrayList.size();i++){
			System.out.println("stringArrayList:index"+i+":"+stringArrayList.get(i));
		}
		//���Ԫ��
		stringArrayList.add("abc"); 
		System.out.println(stringArrayList);
		
		stringArrayList.remove("abc");
		System.out.println(stringArrayList);
		
		//ɾ��Ԫ��public boolean remove(Object o):ɾ��ָ����Ԫ�أ�����ɾ���Ƿ�ɹ�
		System.out.println("stringArrayListremove��"+1+"��:"+stringArrayList.remove(1));
		System.out.println(stringArrayList);		
		//ɾ��Ԫ��public E remove(int index)��ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
		
		//�޸�Ԫ��
		stringArrayList.set(1,"1000");
		
		System.out.println(stringArrayList);
	}

}
