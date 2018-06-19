package landlord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 斗地主的玩家
 * @author student
 *
 */
public class Player {
	//手中的牌
	private ArrayList<Card> cardsInHand;
	
	public Player(){
		cardsInHand=new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCardsInHand() {
		return cardsInHand;
	}

	public void setCardsInHand(ArrayList<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}

	/**
	 * 理牌
	 */
	
	public void sortCard(){
		Collections.sort(cardsInHand, new Card());
	}
	
	/**
	 * 查看手中的牌
	 */
	public void printCardsInHand(){
		for(int i =0 ;i<cardsInHand.size();i++){
			System.out.print(cardsInHand.get(i)+"  ");
		}
	}
	/**
	 * 查看手中的牌的数目
	 */
	public int num(){
		
		return this.cardsInHand.size();
	}
		/**
		 * 打牌
		 */
	public void playCard(int...a){
		Card [] c= new Card[a.length];
		for(int i=0;i<a.length;i++){
			c[i]=cardsInHand.get(a[i]-1);
		}
		this.cardsInHand.removeAll(Arrays.asList(c));
		this.printCardsInHand();
	}
		
	/**
	 * 持久化手中的纸牌
	 */
	public void storeCards() {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw= new FileWriter("e:/landlord.txt",true);
			bw= new BufferedWriter(fw);
			for(Card c:cardsInHand){
				bw.write(c.toString()+"\t");
			}
				bw.write("\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void readCard(){
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr= new FileReader("e:/landlord.txt");
			br= new BufferedReader(fr);
			String t;
			while((t=br.readLine())!=null){
				System.out.println(t);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
	}

