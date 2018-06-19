package landlord;

import java.util.Comparator;

/**
 * 纸牌类
 * @author student
 *
 */
public class Card implements Comparator<Card>{
	//花色
	private String color;
	//数字
	private String number;
	public Card(){	
	}
	public Card(String color, String number) {
		this.color = color;
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * 获取纸牌的点数
	 */
	public int getDots(){
		switch(number){
		case"3":
		case"4":
		case"5":
		case"6":
		case"7":
		case"8":
		case"9":
		case"10":
			return Integer.parseInt(number);
		case"J":
			return 11;
		case"Q":
			return 12;
		case"K":
			return 13;
		case"A":
			return 14;
		case"2":
			return 15;	
		case"s":
			return 16;
		case"S":
			return 17;
		default:
			return 0;
		}
	}
	@Override
	public String toString(){
		return this.color+this.number;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		Card c = (Card)obj;
		if(this.getNumber().equals(c.getNumber())&&this.getColor().equals(c.getColor())){
			return true;
		}
		return false;
	}
	@Override
	public int compare(Card c1, Card c2) {
		return c1.getDots()-c2.getDots();
	}
	
	
}
