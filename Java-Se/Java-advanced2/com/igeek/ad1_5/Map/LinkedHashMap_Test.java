package com.igeek.ad1_5.Map;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @ClassName: LinkedHashMapDemo
 * @Description: LinkedHashMap��ʹ��
 * @date 2017��11��20�� ����9:03:01 Company www.igeekhome.com
 *       LinkedHashMap: Linked����ṹ,��֤Ԫ����˳�� Hash�ṹ��֤Ԫ��Ψһ ����Լ���Լ�������
 */
public class LinkedHashMap_Test {
	public static void main(String[] args) {
		// �������϶���
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		// �򼯺������Ԫ��
		map.put("��ƽ", "����");
		map.put("·�˼�", "·����");
		map.put("Jack", "Rose");
		map.put("Jack", "Lily");

		// �۲켯��Ԫ��
		System.out.println(map);
		// ��������
		// ��ȡ���м��ļ���
		Set<String> keys = map.keySet();
		// �������м��ļ���
		for (String thisKey : keys) {
			// ͨ������ֵ
			String thisValue = map.get(thisKey);
			// ��ӡ��Ϣ
			System.out.println(thisKey + ":" + thisValue);
		}
	}
}