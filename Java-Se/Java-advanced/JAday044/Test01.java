package JAday044;

import java.util.HashMap;

import org.junit.Test;

public class Test01 {
	@Test
	public void Te01() {
		//创建集合对象
				HashMap<String, String> map = new HashMap<String, String>();
				//向集合中添加元素
				map.put("姓名", "Jack");
				map.put("性别", "男");
				map.put("年龄", "18");
				map.put("分数", "18");
				//可以通过键获取值
				String value = map.get("姓名");
				System.out.println(value);
	}

	
}
