package com.igeek.ad1_5.Map;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @ClassName: LinkedHashMapDemo
 * @Description: LinkedHashMap的使用
 * @date 2017年11月20日 上午9:03:01 Company www.igeekhome.com
 *       LinkedHashMap: Linked链表结构,保证元素有顺序 Hash结构保证元素唯一 以上约束对键起作用
 */
public class LinkedHashMap_Test {
	public static void main(String[] args) {
		// 创建集合对象
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		// 向集合中添加元素
		map.put("近平", "丽媛");
		map.put("路人甲", "路人乙");
		map.put("Jack", "Rose");
		map.put("Jack", "Lily");

		// 观察集合元素
		System.out.println(map);
		// 遍历集合
		// 获取所有键的集合
		Set<String> keys = map.keySet();
		// 迭代所有键的集合
		for (String thisKey : keys) {
			// 通过键找值
			String thisValue = map.get(thisKey);
			// 打印信息
			System.out.println(thisKey + ":" + thisValue);
		}
	}
}