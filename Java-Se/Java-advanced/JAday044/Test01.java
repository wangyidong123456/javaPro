package JAday044;

import java.util.HashMap;

import org.junit.Test;

public class Test01 {
	@Test
	public void Te01() {
		//�������϶���
				HashMap<String, String> map = new HashMap<String, String>();
				//�򼯺������Ԫ��
				map.put("����", "Jack");
				map.put("�Ա�", "��");
				map.put("����", "18");
				map.put("����", "18");
				//����ͨ������ȡֵ
				String value = map.get("����");
				System.out.println(value);
	}

	
}
