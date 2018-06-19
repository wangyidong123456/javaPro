package landlord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * * 美女荷官:洗牌\发牌\判定打牌的顺序\打牌的规则\输赢的规??
 * 
 * @author student
 *
 */
public class BeautyDealer {
	private String[] colors = { "红桃", "黑桃", "梅花", "方片" };
	// 牌局中的??有牌
	private ArrayList<Card> cards;
	// 三个玩家??
	private Player[] players;
	public Player[] getPlayers() {
		return players;
	}
	// 底牌
	private ArrayList<Card> remain;

	// 初始化键值对
	public BeautyDealer() {
		cards = new ArrayList<Card>();
		remain = new ArrayList<Card>();
		players = new Player[3];
		players[0] = new Player();
		players[1] = new Player();
		players[2] = new Player();
	}

	// 初始化牌??
	public void initialize() {
		for (int i = 0; i < 4; i++) {
			for (int n = 1; n <= 13; n++) {
				Card c = new Card();
				c.setColor(colors[i]);
				if (n == 1) {
					c.setNumber("A");
				} else if (n == 11) {
					c.setNumber("J");
				} else if (n == 12) {
					c.setNumber("Q");
				} else if (n == 13) {
					c.setNumber("K");
				} else {
					c.setNumber(n + "");
				}

				cards.add(c);
			}
		}
		// 大小??
		cards.add(new Card("Joker", "s"));
		cards.add(new Card("Joker", "S"));

	}

	/**
	 * 洗牌
	 */
	public void shuffle(){
		Collections.shuffle(cards);
	}
	public void shuffle0() {
		Card t = new Card();
		Random r = new Random();
		int e;
		for (int i = 0; i < 54; i++) {
			e = r.nextInt(54);
			t.setColor(cards.get(i).getColor());
			t.setNumber(cards.get(i).getNumber());
			cards.get(i).setColor(cards.get(e).getColor());
			cards.get(i).setNumber(cards.get(e).getNumber());
			cards.get(e).setColor(t.getColor());
			cards.get(e).setNumber(t.getNumber());
		}
	}

	// 洗牌2
	public void shuffle2() {
		Card t = new Card();
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			int m = r.nextInt(54);
			t = cards.set(m, cards.get(cards.size() - 1 - m));
			cards.set(cards.size() - 1 - m, t);
		}
	}

	/**
	 * 发牌
	 */
	public void deal() {
		for (int i = 0; i < cards.size() - 3; i++) {
			players[i%3].getCardsInHand().add(cards.get(i));
		}
		for (int j = cards.size() - 3; j < cards.size(); j++) {
			remain.add(cards.get(j));
		}
	}

	/**
	 * 判定输赢
	 */
	public void win() {
		int a = players[0].num();
		int b = players[1].num();
		int c = players[2].num();
		if (a == 0) {
			System.out.println("players[0] WIN THE GAMES");
			System.out.println(" GAMES OVER");
			return;
		} else if (b == 0) {
			System.out.println("players[1] WIN THE GAMES");
			System.out.println(" GAMES OVER");
			return;
		} else if (c == 0) {
			System.out.println("players[2] WIN THE GAMES");
			System.out.println(" GAMES OVER");
			return;
		}
	}

	// 显示玩家手上的纸??
	public void display() {
		for(int i=0;i<3;i++){
			System.out.println("players["+i+"]手上的纸牌为;");
			players[i].printCardsInHand();
			System.out.println("");
		}
	}

	// 显示底牌
	public void displayRemain() {
		System.out.println("底牌??");
		for (int i = 0; i < remain.size(); i++) {
			System.out.print(remain.get(i) + "  ");
		}
		System.out.println();
	}

	// 理牌
	public void sortCards() {
		for(int i=0;i<3;i++){
		players[i].sortCard();
		}
	}

	// 打印??有的纸牌
	public void printCards() {
		for (Card c : cards) {
			System.out.println(c);
		}
	}
	//指定地主
	public void nameLord(){
		Random r=new Random();
		int t =r.nextInt(3);
		System.out.println("地主为:players["+t+"]");
		players[t].getCardsInHand().addAll(remain);
	}
	public void persistenceCard(){
		for(int i=0;i<3;i++){
//			System.out.println("玩家player["+i+"]纸牌为");
			players[i].storeCards();
		}
	}
}

