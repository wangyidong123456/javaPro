package com.igeek.ad1_5.Map;

import java.util.*;
import java.util.Map.Entry;

import org.junit.Test;

public class HashMap_Test {
	@Test
	public void Te01() {
		HashMap<String, String> map = new HashMap<String, String>();
		// �򼯺������Ԫ��
		map.put("����", "Jack");
		map.put("�Ա�", "��");
		map.put("����", "18");
		map.put("����", "18");
		// ����ͨ������ȡֵ
		String value = map.get("����");
		System.out.println(value);
	}

	@Test
	public void Te02() {
		// �������϶���
		HashMap<String, String> map = new HashMap<String, String>();
		// �򼯺������Ԫ��
		map.put("��ʱ��", "�ν�");
		map.put("������", "¬����");
		map.put("�Ƕ���", "��ٴ");
		map.put("�Ƕ���", "����");
		System.out.println(map);
		System.out.println(map.toString());
		// ����ͨ������ȡֵ
		String name = map.get("��ʱ��");
		System.out.println(name);
		String name2 = map.get("ĸҹ��");
		System.out.println(name2);
	}

	@Test
	public void Te03() {
		// �������϶���
		HashMap<String, String> map = new HashMap<String, String>();
		// �򼯺������Ԫ��
		map.put("001", "�ν�");
		map.put("002", "¬����");
		map.put("003", "��ٴ");
		map.put("003", "����");
		// �������м��ļ���
		Set<String> keySet = map.keySet();
		System.out.println(map);
		System.out.println(keySet);

		// ��������ֵ�ü���
		Collection<String> values = map.values();

		System.out.println(values);
		System.out.println("==========================");
		// map���ϵĳ��ñ���
		// �������м���Set����,���λ�ȡÿһ����
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String thisKey = iterator.next();
			// ͨ������ֵ,��ס����ʹ��map����ͨ������ֵ
			String thisValue = map.get(thisKey);
			System.out.println(thisKey + "=" + thisValue);
		}
	}

	@Test
	public void Te04() {
		// �������϶���
		HashMap<String, String> map = new HashMap<String, String>();
		// �򼯺������Ԫ��
		map.put("001", "�ν�");
		map.put("002", "¬����");
		map.put("003", "��ٴ");
		map.put("003", "����");
		// Entry:����Key��Value 2����
		Set<Entry<String, String>> entrys = map.entrySet();
		Iterator<Entry<String, String>> it = entrys.iterator();
		while (it.hasNext()) {
			Entry<String, String> kv = it.next();
			System.out.println("Key" + kv.getKey() + "value" + kv.getValue());
		}
		for (Entry<String, String> kv : entrys) {
			System.out.println("Key" + kv.getKey() + "value" + kv.getValue());
		}
	}

	@Test
	public void Te05() {
		// ArrayList<ArrayList> a=new ArrayList<ArrayList>();
		// a.add(a);
		// System.out.println(a);

	}
}
