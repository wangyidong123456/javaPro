package JAday04;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
	/**
	 * collection�ӿڣ�ʵ������ӿ���������Ϊ "foreach" ����Ŀ�ꡣ  
	 * Iterator<T> iterator()  ����һ����һ�� T ���͵�Ԫ���Ͻ��е����ĵ�������
	 * Iterator<E>�ӿڣ�   �Լ��Ͻ��е����ĵ�����
	 * hasNext()   �������Ԫ�ؿ��Ե������򷵻� true��
	 * E next()    ���ص�������һ��Ԫ�ء� 
	 *                      
	 */
	public static void main(String[] args) {
		//ʹ�õ��������м���Ԫ�صı���
		ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(12);
        arr.add(42);
        arr.add(22);
        arr.add(62);
        arr.add(62);
        //��ȡ����Ԫ�صĵ�����      
        Iterator<Integer> it=arr.iterator();
        for(;it.hasNext();){
        	System.out.println(it.next());
        }
	}

}
