package JAday0202;

public class Test01 {

	public static void main(String[] args) {
		//�����������,��֤��̬static���εĳ�Ա�����������
		Chinese c = new Chinese("����ǿ", 34, "��Ա");
		System.out.println(c.getAge()+"���"+c.getName()+"��"+Chinese.country+"��");
		
		Chinese c2 = new Chinese("���ǳ�", 48, "��Ա���ݻ���Ƭ");
		System.out.println(c2.getAge()+"���"+c2.getName()+"��"+Chinese.country+"��");
		
		Chinese.country = "�л��������͹�";
		System.out.println("================================");
		
		System.out.println(c.getAge()+"���"+c.getName()+"��"+Chinese.country+"��");
		
		System.out.println(c2.getAge()+"���"+c2.getName()+"��"+Chinese.country+"��");

		c.normalMethod();
		//����
		Chinese.method();
		//������ ��ôʹ��
//		c.method();
		
	}

}
