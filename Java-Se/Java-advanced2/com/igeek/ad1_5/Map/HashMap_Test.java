package com.igeek.ad1_5.Map;

import java.util.*;
import java.util.Map.Entry;

import org.junit.Test;

public class HashMap_Test {
	@Test
	public void Te01() {
		HashMap<String, String> map = new HashMap<String, String>();
		// 向集合中添加元素
		map.put("姓名", "Jack");
		map.put("性别", "男");
		map.put("年龄", "18");
		map.put("分数", "18");
		// 可以通过键获取值
		String value = map.get("姓名");
		System.out.println(value);
	}

	@Test
	public void Te02() {
		// 创建集合对象
		HashMap<String, String> map = new HashMap<String, String>();
		// 向集合中添加元素
		map.put("及时雨", "宋江");
		map.put("玉麒麟", "卢俊义");
		map.put("智多星", "高俅");
		map.put("智多星", "吴用");
		System.out.println(map);
		System.out.println(map.toString());
		// 可以通过键获取值
		String name = map.get("及时雨");
		System.out.println(name);
		String name2 = map.get("母夜叉");
		System.out.println(name2);
	}

	@Test
	public void Te03() {
		// 创建集合对象
		HashMap<String, String> map = new HashMap<String, String>();
		// 向集合中添加元素
		map.put("001", "宋江");
		map.put("002", "卢俊义");
		map.put("003", "高俅");
		map.put("003", "吴用");
		// 返回所有键的集合
		Set<String> keySet = map.keySet();
		System.out.println(map);
		System.out.println(keySet);

		// 返回所有值得集合
		Collection<String> values = map.values();

		System.out.println(values);
		System.out.println("==========================");
		// map集合的常用遍历
		// 迭代所有键的Set集合,依次获取每一个键
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String thisKey = iterator.next();
			// 通过键找值,记住这里使用map集合通过键找值
			String thisValue = map.get(thisKey);
			System.out.println(thisKey + "=" + thisValue);
		}
	}

	@Test
	public void Te04() {
		// 创建集合对象
		HashMap<String, String> map = new HashMap<String, String>();
		// 向集合中添加元素
		map.put("001", "宋江");
		map.put("002", "卢俊义");
		map.put("003", "高俅");
		map.put("003", "吴用");
		// Entry:包含Key和Value 2部分
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
