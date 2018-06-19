package landlord;

/**
 * //定义一个对象Card(color,number) 
 * //编写一个方法,判定2张牌是否为同一张牌 
 * //编写一个方法,判定2张牌是否为对子
 * //编写一个方法,判定多张牌是否为顺
 * //编写一个方法,判定多张牌是否为3带1或者3带2的结构 
 * //编写一个方法,判定多张牌是否飞机带翅膀
 * 
 * @author student
 */
public class Judge {
	public boolean isPairs(Card card1, Card card2) {
		if (card1.getNumber().equals(card2.getNumber())) {
			return true;
		}
		return false;
	}

	public boolean isSameCard(Card card1, Card card2) {
		if (isPairs(card1, card2) && card1.getColor().equals(card2.getColor())) {
			return true;
		}
		return false;
	}

	public boolean isProgression(Card[] arr) {
		if (arr.length < 5 || arr.length > 12) {
			return false;
		} else if (arr.length >= 5 && arr.length <= 12) {
			String s = "345678910JQKA";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i].getNumber());
			}
			String t = sb.toString();
			if (s.contains(t)) {
				return true;
			}
			// char a =t.charAt(0);
			// for(int i=0;i<s.length();i++){
			// if(a==s.charAt(i)){
			// for(int j=0;j<t.length();j++,i++){
			// if(t.charAt(j)!=s.charAt(i)){
			// return false;
			// }
			// }
			// return true;
			// }
			// }
		}
		return false;
	}
    //
	public boolean isThree(Card[] arr) {
		int count = 0;
		if (arr.length < 4 || arr.length > 5) {
			return false;
		} else if (arr.length >= 4 && arr.length <= 5) {
			for (int i = 0; i < arr.length; i++) {
				String t = arr[i].getNumber();
				count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (t == arr[j].getNumber()) {
						count++;
					}
					if (count == 3) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean isFly(Card[] arr) {
		int count = 0;
		int flyc = 0;
		if (arr.length < 8 || arr.length > 10) {
			return false;
		} else if (arr.length >= 8 && arr.length <= 10) {
			for (int i = 0; i < arr.length; i++) {
				String t = arr[i].getNumber();
				count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (t == arr[j].getNumber()) {
						count++;
					}
				}
				if (count == 3) {
					flyc++;
				}
			}
			if (flyc == 6) {
				return true;
			}
		}
		return false;
	}
}
