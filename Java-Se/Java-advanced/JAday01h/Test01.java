package JAday01h;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// ��ʼ�������е���Ʒ��Ϣ
		Test01 test=new Test01();
		ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		data.add(new GoodsItem("�人�ȸ���", "001", 4, 0, "��", 0));
		data.add(new GoodsItem("�����º�����", "002", 12, 0, "��", 0));
		data.add(new GoodsItem("����", "003", 3, 0, "ƿ", 0));
		data.add(new GoodsItem("��Ƭ", "004", 7, 0, "��", 0));
		data.add(new GoodsItem("ƻ��", "005", 12, 0, "��", 0));
		boolean isContinue = true;
		while (isContinue) {
			System.out.println("----��ӭʹ�ó��й���ϵͳ-----");
			System.out.println("--------1����  ��---------");
			System.out.println("--------2����ӡСƱ-------");
			System.out.println("--------3���˳�ϵͳ-------");
			System.out.println("----------��ѡ��:--------");
			String choiceString = sc.nextLine();
			switch (choiceString) {
			case "1":
				// ����
				test.goShopping(data);
				break;
			case "2":
				//��ӡСƱ
				test.outPutPrint(data);
				break;
			case "3":
				isContinue = false;
				System.out.println("��ӭ�´ι��٣�");
				break;
			default:
				System.out.println("����������Ч������������");
				break;
			}
		}
	}   

	// �ṩ���Թ������Ʒ����
	public  void goShopping(ArrayList<GoodsItem> data) {
		String isContinue = "Y";
		Scanner sc = new Scanner(System.in);
		GoodsItem gi = new GoodsItem();
		do {
			System.out.println("�ɹ�����嵥����");
			for (int i = 0; i < data.size(); i++) {
				gi = data.get(i);
				System.out.println("--------" + gi.getName() + "(" + gi.getId() + ")----------");
			}
			System.out.println("��������Ҫ����Ļ���");
			String id = sc.next();

			System.out.println("׼���������Ʒ��Ϣ���£�");
			gi = findGoodsItem(data, id);
			if (gi != null) {
				gi.print();
			} else {
				System.out.println("û�д���Ʒ���������룺");
				continue;
			}
			System.out.println("��������Ҫ�����������");
			gi.setNumber(sc.nextDouble());

			System.out.println("����ɹ����Ƿ��������:(Q��ʾ�˳��������������)");
			isContinue = sc.next();
		} while (!isContinue.equalsIgnoreCase("q"));
		sc.close();
	}

	// System.out.println("�����빺�����Ʒ����");
	// String name = sc.next();
	//
	// System.out.println("�����빺��ĵ���");
	// double price = sc.nextDouble();
	// System.out.println("�����빺�������");
	// double number = sc.nextDouble();
	// System.out.println("�����빺��ļƼ۵�Ԫ");
	// String unit=sc.next();
	// gi.setName(name);
	// gi.setId(id);
	// gi.setPrice(price);
	// gi.setNumber(number);
	// gi.setUnit(unit);
	// double money = number*price;
	// gi.setMoney(money);
	// data.add(gi);
	// System.out.println("����ɹ���");
	// }

	/**
	 * ������Ʒ�����ڼ����в�����Ӧ����Ʒ����Ϣ
	 * 
	 * @param data
	 *            ��Ʒ���ڵļ���
	 * @param id
	 *            �����ҵ���Ʒ
	 * @return ������Ʒ��Ϣ���ҵ��Ķ�Ӧ��Ʒ����δ�鵽���򷵻�null
	 */
	public  GoodsItem findGoodsItem(ArrayList<GoodsItem> data, String id) {
		for (int i = 0; i < data.size(); i++) {
			GoodsItem gi = data.get(i);
			if (gi.getId().equals(id)) {
				return gi;
			}

		}
		return null;
	}

	/**
	 * ��ӡ�Ѿ��������Ʒ����Ϣ
	 * 
	 * @param data
	 *            ��Ʒ���ڵļ���
	 */
	public  void outPutPrint(ArrayList<GoodsItem> data) {
		GoodsItem gi = new GoodsItem();
		// ������Ʒ���ܼ���
		int buyNum = 0;
		// �������Ŀ��
		int buyItem = 0;
		// �������Ʒ�ܼ�
		double sum = 0;

		System.out.println("��ӭ����");
		System.out.println("Ʒ��\t�ۼ�\t����\t��λ\t���");
		System.out.println("-------------------------");
		for (int i = 0; i < data.size(); i++) {
			gi = data.get(i);
			if (gi.getNumber() != 0) {
				buyItem++;
				buyNum += gi.getNumber();
				sum += gi.getNumber() * gi.getPrice();
				System.out.print(gi.getName() + "(" + gi.getId() + ")");
				System.out.print("\t" + gi.getPrice());
				System.out.print("\t" + gi.getNumber());
				System.out.print("\t" + gi.getUnit());
				System.out.print("\t" + gi.getNumber() * gi.getPrice());
				System.out.println("");
			}
		}
		System.out.println("-------------------------");
		System.out.print(buyItem + "����Ʒ");
		System.out.print("\t���ƣ�" + buyNum + "����Ʒ");
		System.out.println("\t�ܼۣ�" + sum);

	}
}
