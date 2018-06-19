package JAday04_end;

import java.util.*;

public class Player {
	private ArrayList<Card> cardsHand;
	public Player(){
		//初始化玩家手牌
		cardsHand=new ArrayList<Card>();
	}
	//获得玩家的手牌
	public ArrayList<Card> getCardsHand() {
		return cardsHand;
	}
	
    //添加玩家手牌
	public void setCardsHand(ArrayList<Card> cardsHand) {
		this.cardsHand = cardsHand;
	}
    //打印手牌
	public void printCardsHand(){
		System.out.println(cardsHand);
	}
	
}
