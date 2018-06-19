package com.igeek.ad2_2.XML;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BeanFactory  {
	// 结合XML、反射的知识点完成一个综合案例。
	
	//1、 需求：编写一个BeanFactroy类来读取XML配置文件中配置的JavaBean信息，
	//1、将读取都的信息使用BeanUtils封装进JavaBean对象，将对象存储在Map集合，
	
	//2、 并在BeanFactory中提供通过id查找JavaBean的方法。
	private static Map<String, BeanConfig> map = new HashMap<String, BeanConfig>();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SAXReader saxreader = new SAXReader();
		try {
			Document dc = saxreader.read("NewFile.xml");
			Element el = dc.getRootElement();
			List<Element> list = el.elements();
			for (Element temp : list) {
				BeanConfig bc = new BeanConfig();
				String id = temp.attributeValue("id");
				String className = temp.attributeValue("className");
				bc.setId(id);
				bc.setClassName(className);
				List<Element> list1 = temp.elements();
				for (Element temp1 : list1) {
					String name = temp1.attributeValue("name");
					String value = temp1.attributeValue("value");
					bc.getProps().setProperty(name, value);
					// System.out.println(obj);
				}
				map.put(id, bc);
				System.out.println(getBean(id));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(map);
		
	}

	public static Object getBean(String id) {
		BeanConfig bc = map.get(id);
		Object obj = null;
		if (bc == null) {
			throw new RuntimeException("获得对象[" + id + "]不存在");
		}
		try {
			String className = bc.getClassName();
			Class<?> clazz = Class.forName(className);
			obj = clazz.newInstance();
			Properties props = bc.getProps();
			for (String temp : props.stringPropertyNames()) {
				BeanUtils.setProperty(obj, temp, props.get(temp));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;

	}
}
