package JAday04_end;

import java.util.*;

public class Dealer {
	// 卡牌的花色
	private String[] colors = { "♦", "♣", "♥", "♠" };
	// 一组扑克牌
	private ArrayList<Card> cards;
	// 三张底牌
	private ArrayList<Card> remainderCards;
	// 三个玩家
	private Player[] players;
	// 用HashMap排序
	private HashMap<Integer, Card> map;
	// Map键集合
	private ArrayList<Integer> pnumber;

	private Integer itr = 0;

	public Dealer() {
		// 初始化牌集合
		cards = new ArrayList<Card>();
		remainderCards = new ArrayList<Card>();
		pnumber = new ArrayList<Integer>();
		players = new Player[3];
		players[0] = new Player();
		players[1] = new Player();
		players[2] = new Player();
		map = new HashMap<Integer, Card>();
	}

	// 初始化牌，洗牌
	public void shuffle() {
		ArrayList<String> numbers = new ArrayList<String>();
		for (int i = 3; i <= 10; i++) {
			numbers.add(i + "");
		}
		Collections.addAll(numbers, "J", "Q", "K", "A", "2");
		for (int j = 0; j < 13; j++) {
			for (int i = 0; i < 4; i++) {
				Card c = new Card();
				c.setColor(colors[i]);
				c.setNumber(numbers.get(j));
				cards.add(c);
				map.put(itr, c);
				itr++;
			}
		}
		cards.add(new Card("s", "Joker"));
		cards.add(new Card("S", "Joker"));
		map.put(itr++, new Card("s", "Joker"));
		map.put(itr++, new Card("S", "Joker"));
		for (int i = 0; i < map.size(); i++) {
			pnumber.add(i);
		}
		Collections.shuffle(pnumber);
	}

	// 打印牌
	public void printCard() {
		for (int i = 0; i < pnumber.size(); i++) {
			System.out.print(map.get(pnumber.get(i)) + " ");
		}
		System.out.println("");
	}

	// 打印玩家手牌，以及底牌
	public void printCardAll() {
		for (int i = 0; i < 3; i++) {
			System.out.println("玩家" + (i + 1) + "手中的牌");
			players[i].printCardsHand();
		}
		System.out.println("底牌如下:");
		System.out.println(remainderCards);
	}

	// 发牌
	public void deal() {
		ArrayList<Integer> n1 = new ArrayList<Integer>();
		ArrayList<Integer> n2 = new ArrayList<Integer>();
		ArrayList<Integer> n3 = new ArrayList<Integer>();
		ArrayList<Integer> n4 = new ArrayList<Integer>();
		for (int i = 0; i < pnumber.size(); i++) {
			if (i >= pnumber.size() - 3) {
				n4.add(pnumber.get(i));
			} else {
				if (i % 3 == 0) {
					n1.add(pnumber.get(i));
				} else if (i % 3 == 1) {
					n2.add(pnumber.get(i));
				} else if (i % 3 == 2) {
					n3.add(pnumber.get(i));
				}
			}
		}
		Collections.sort(n1);
		Collections.sort(n2);
		Collections.sort(n3);
		Collections.sort(n4);

		for (int i = 0; i < n1.size(); i++) {
			Card c = map.get(n1.get(i));
			players[0].getCardsHand().add(c);
		}
		for (int i = 0; i < n2.size(); i++) {
			Card c = map.get(n2.get(i));
			players[1].getCardsHand().add(c);
		}
		for (int i = 0; i < n3.size(); i++) {
			Card c = map.get(n3.get(i));
			players[2].getCardsHand().add(c);
		}
		for (int i = 0; i < n4.size(); i++) {
			Card c = map.get(n4.get(i));
			remainderCards.add(c);
		}
	}
}
