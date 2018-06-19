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
	// ���XML�������֪ʶ�����һ���ۺϰ�����
	
	//1�� ���󣺱�дһ��BeanFactroy������ȡXML�����ļ������õ�JavaBean��Ϣ��
	//1������ȡ������Ϣʹ��BeanUtils��װ��JavaBean���󣬽�����洢��Map���ϣ�
	
	//2�� ����BeanFactory���ṩͨ��id����JavaBean�ķ�����
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
			throw new RuntimeException("��ö���[" + id + "]������");
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
