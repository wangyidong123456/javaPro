package Tjavabaseday04;

public class Phtest01 {

	public static void main(String[] args) {
		Phone p = new Phone();
		// �����Ա����
		System.out.println("Ʒ�ƣ�" + p.brand);// null
		System.out.println("�۸�" + p.price);// 0
		System.out.println("��ɫ��" + p.color);// null
		System.out.println("-------------------");

		// ����Ա������ֵ
		p.brand = "��ΪMate10";
		p.price = 3999;
		p.color = "��ɫ";

		// �ٴ������Ա����
		System.out.println("Ʒ�ƣ�" + p.brand);// ��ΪMate10
		System.out.println("�۸�" + p.price);// 3999
		System.out.println("��ɫ��" + p.color);// ��ɫ
		System.out.println("-------------------");

		// ���ó�Ա����
		p.call("�⾩");
		p.sendMessage();
		
		
        System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		//����Ա������ֵ
		p.brand="����";
		p.price=2999;
		p.color="��ɫ";
		
		//�ٴ������Ա����
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		//���ó�Ա����
		p.call("����ϼ");
		p.sendMessage();


	}

}
