package landlord;
/**
 * 编写斗地主的程序
 * 		
 * @author student
 *
 */
public class HomeWorks {

	public static void main(String[] args) {
	BeautyDealer dealer=new BeautyDealer();
	//初始化牌局
	dealer.initialize();
	//洗牌
	dealer.shuffle();
	//发牌
	dealer.deal();
	//玩家理牌.指定地主
	dealer.nameLord();
	dealer.sortCards();
	dealer.persistenceCard();
	dealer.getPlayers()[0].readCard();
	

	}

}
