package landlord;
/**
 * ��д�������ĳ���
 * 		
 * @author student
 *
 */
public class HomeWorks {

	public static void main(String[] args) {
	BeautyDealer dealer=new BeautyDealer();
	//��ʼ���ƾ�
	dealer.initialize();
	//ϴ��
	dealer.shuffle();
	//����
	dealer.deal();
	//�������.ָ������
	dealer.nameLord();
	dealer.sortCards();
	dealer.persistenceCard();
	dealer.getPlayers()[0].readCard();
	

	}

}
