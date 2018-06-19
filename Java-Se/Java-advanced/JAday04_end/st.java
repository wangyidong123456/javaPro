package JAday04_end;

public class st {

	public static void main(String[] args) {
       Dealer dr=new Dealer();
       // 初始化牌，洗牌
       dr.shuffle();
       dr.printCard();
       //发牌，看手牌
       dr.deal();
       dr.printCardAll();
       
	}

}
