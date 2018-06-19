package landlord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * * ��Ů�ɹ�:ϴ��\����\�ж����Ƶ�˳��\���ƵĹ���\��Ӯ�Ĺ�??
 * 
 * @author student
 *
 */
public class BeautyDealer {
	private String[] colors = { "����", "����", "÷��", "��Ƭ" };
	// �ƾ��е�??����
	private ArrayList<Card> cards;
	// �������??
	private Player[] players;
	public Player[] getPlayers() {
		return players;
	}
	// ����
	private ArrayList<Card> remain;

	// ��ʼ����ֵ��
	public BeautyDealer() {
		cards = new ArrayList<Card>();
		remain = new ArrayList<Card>();
		players = new Player[3];
		players[0] = new Player();
		players[1] = new Player();
		players[2] = new Player();
	}

	// ��ʼ����??
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
		// ��С??
		cards.add(new Card("Joker", "s"));
		cards.add(new Card("Joker", "S"));

	}

	/**
	 * ϴ��
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

	// ϴ��2
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
	 * ����
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
	 * �ж���Ӯ
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

	// ��ʾ������ϵ�ֽ??
	public void display() {
		for(int i=0;i<3;i++){
			System.out.println("players["+i+"]���ϵ�ֽ��Ϊ;");
			players[i].printCardsInHand();
			System.out.println("");
		}
	}

	// ��ʾ����
	public void displayRemain() {
		System.out.println("����??");
		for (int i = 0; i < remain.size(); i++) {
			System.out.print(remain.get(i) + "  ");
		}
		System.out.println();
	}

	// ����
	public void sortCards() {
		for(int i=0;i<3;i++){
		players[i].sortCard();
		}
	}

	// ��ӡ??�е�ֽ��
	public void printCards() {
		for (Card c : cards) {
			System.out.println(c);
		}
	}
	//ָ������
	public void nameLord(){
		Random r=new Random();
		int t =r.nextInt(3);
		System.out.println("����Ϊ:players["+t+"]");
		players[t].getCardsInHand().addAll(remain);
	}
	public void persistenceCard(){
		for(int i=0;i<3;i++){
//			System.out.println("���player["+i+"]ֽ��Ϊ");
			players[i].storeCards();
		}
	}
}

