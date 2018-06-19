package JAday04;

import java.util.ArrayList;
import java.util.Collections;

public class Test02 {

	public static void main(String[] args) {
		ArrayList<String> poker = new ArrayList<String>();
		// 定义花色集合
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("♥");
		colors.add("♠");
		colors.add("♦");
		colors.add("♣");

		// 定义数字集合
		ArrayList<String> numbers = new ArrayList<String>();
		for (int i = 2; i <= 10; i++) {
			numbers.add(i + "");
		}
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");
		numbers.add("A");

		// 嵌套迭代完成每张牌的组装
		for (String thisColor : colors) {
			for (String thisNumber : numbers) {
				// 通过花色与数字拼写成对应的每张牌
				String thisCard = thisColor + thisNumber;
				// 将拼好的牌放到集合中
				poker.add(thisCard);
			}
		}

		// 补充大小王
		poker.add("大☺");
		poker.add("小☺");

		 //System.out.println(poker);

		// 洗牌 Collections类.shuffle方法可以将集合打乱顺序
		Collections.shuffle(poker);
		// System.out.println(poker);

		// 发牌：
		// 将每个人以及底牌设计为ArrayList<String>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();

		// 使用普通的for循环,通过索引处理纸牌
		// 除了最后三张，其他的都发给玩家
		for (int i = 0; i < poker.size() - 3; i++) {
			// 获取当前这张牌
			String thisCard = poker.get(i);

			// 对3取模,决定给哪个玩家发牌
			if (i % 3 == 0) {
				player1.add(thisCard);
			} else if (i % 3 == 1) {
				player2.add(thisCard);
			} else {
				player3.add(thisCard);
			}
		}

		// 最后3张是底牌
		for (int i = poker.size() - 3; i < poker.size(); i++) {
			// 获取当前这张牌
			String thisCard = poker.get(i);
			dipai.add(thisCard);
		}

		// 看牌：
		// 直接打印每个集合
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(dipai);

	}

}
