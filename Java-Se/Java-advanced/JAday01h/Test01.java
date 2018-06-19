package JAday01h;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 初始化超市中的商品信息
		Test01 test=new Test01();
		ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		data.add(new GoodsItem("武汉热干面", "001", 4, 0, "碗", 0));
		data.add(new GoodsItem("少林寺核桃酥", "002", 12, 0, "件", 0));
		data.add(new GoodsItem("可乐", "003", 3, 0, "瓶", 0));
		data.add(new GoodsItem("薯片", "004", 7, 0, "包", 0));
		data.add(new GoodsItem("苹果", "005", 12, 0, "斤", 0));
		boolean isContinue = true;
		while (isContinue) {
			System.out.println("----欢迎使用超市购物系统-----");
			System.out.println("--------1、购  物---------");
			System.out.println("--------2、打印小票-------");
			System.out.println("--------3、退出系统-------");
			System.out.println("----------请选择:--------");
			String choiceString = sc.nextLine();
			switch (choiceString) {
			case "1":
				// 购物
				test.goShopping(data);
				break;
			case "2":
				//打印小票
				test.outPutPrint(data);
				break;
			case "3":
				isContinue = false;
				System.out.println("欢迎下次光临！");
				break;
			default:
				System.out.println("输入数据无效，请重新输入");
				break;
			}
		}
	}   

	// 提供可以购买的商品集合
	public  void goShopping(ArrayList<GoodsItem> data) {
		String isContinue = "Y";
		Scanner sc = new Scanner(System.in);
		GoodsItem gi = new GoodsItem();
		do {
			System.out.println("可购买的清单如下");
			for (int i = 0; i < data.size(); i++) {
				gi = data.get(i);
				System.out.println("--------" + gi.getName() + "(" + gi.getId() + ")----------");
			}
			System.out.println("请输入需要购买的货号");
			String id = sc.next();

			System.out.println("准备购买的商品信息如下：");
			gi = findGoodsItem(data, id);
			if (gi != null) {
				gi.print();
			} else {
				System.out.println("没有此商品请重新输入：");
				continue;
			}
			System.out.println("请输入你要购买的数量：");
			gi.setNumber(sc.nextDouble());

			System.out.println("购物成功！是否继续购买:(Q表示退出，其他则继续。)");
			isContinue = sc.next();
		} while (!isContinue.equalsIgnoreCase("q"));
		sc.close();
	}

	// System.out.println("请输入购买的物品名称");
	// String name = sc.next();
	//
	// System.out.println("请输入购买的单价");
	// double price = sc.nextDouble();
	// System.out.println("请输入购买的数量");
	// double number = sc.nextDouble();
	// System.out.println("请输入购买的计价单元");
	// String unit=sc.next();
	// gi.setName(name);
	// gi.setId(id);
	// gi.setPrice(price);
	// gi.setNumber(number);
	// gi.setUnit(unit);
	// double money = number*price;
	// gi.setMoney(money);
	// data.add(gi);
	// System.out.println("购物成功！");
	// }

	/**
	 * 根据商品货号在集合中差很早对应的商品的信息
	 * 
	 * @param data
	 *            商品所在的集合
	 * @param id
	 *            待查找的商品
	 * @return 按照商品信息查找到的对应商品，若未查到，则返回null
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
	 * 打印已经购买的商品的信息
	 * 
	 * @param data
	 *            商品所在的集合
	 */
	public  void outPutPrint(ArrayList<GoodsItem> data) {
		GoodsItem gi = new GoodsItem();
		// 购买物品的总件数
		int buyNum = 0;
		// 购买的项目数
		int buyItem = 0;
		// 购买的商品总价
		double sum = 0;

		System.out.println("欢迎光临");
		System.out.println("品名\t售价\t数量\t单位\t金额");
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
		System.out.print(buyItem + "项商品");
		System.out.print("\t共计：" + buyNum + "件商品");
		System.out.println("\t总价：" + sum);

	}
}
