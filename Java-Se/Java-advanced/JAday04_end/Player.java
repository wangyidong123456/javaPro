package JAday04_end;

import java.util.*;

public class Player {
	private ArrayList<Card> cardsHand;
	public Player(){
		//��ʼ���������
		cardsHand=new ArrayList<Card>();
	}
	//�����ҵ�����
	public ArrayList<Card> getCardsHand() {
		return cardsHand;
	}
	
    //����������
	public void setCardsHand(ArrayList<Card> cardsHand) {
		this.cardsHand = cardsHand;
	}
    //��ӡ����
	public void printCardsHand(){
		System.out.println(cardsHand);
	}
	
}
