package JAday04_end;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**  
* @ClassName: CardDemo  
* @Description: 按照斗地主的规则，完成洗牌发牌的动作
* @date 2017年11月20日 上午10:41:34    
* Company www.igeekhome.com
*    
* ???? 大?小?
* 具体规则：
* 		使用54张牌打乱顺序
* 		三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
* 
* 逻辑分析:
* 
* 	每张牌由花色数字两部分组成，我们可以使用花色集合与数字集合嵌套迭代完成每张牌的组装。
* 	使用一个Map集合,<<将小的数字与小的牌对应起来>>,做成Map集合的键与值
* 	即:
* 		键:数字
* 		值:花色+数字的字符串(牌)
* 
* 准备牌：
* 	牌可以设计为一个ArrayList<Integer>,每个数字为一张牌。
* 	牌由Collections类的shuffle方法进行随机排序。
* 发牌：
* 	将每个人以及底牌设计为ArrayList<Integer>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
* 看牌：
* 	将所有集合排序Collections类的sort方法进行排序
* 	将每个集合的数字依次找到对应的纸牌字符串打印出来
*/

public class Test01 {
	public static void main(String[] args) {
		//确立纸牌与数字的对应关系
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//花色集合
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("♥");
		colors.add("♦");
		colors.add("♣");
		colors.add("♠");
		
		//数字集合,加入数字时,直接按照从小到大的顺序加入
		ArrayList<String> numbers = new ArrayList<String>();
		for(int i = 3; i<= 10; i++) {
			numbers.add(i+"");
		}
		Collections.addAll(numbers, "J","Q","K","A","2");
		//定义数字,用于记录数字与字符串纸牌的对应关系
		int cardNumber = 0;
		//遍历数字集合,使用每个数字匹配每种花色
		for(String thisNumber : numbers) {
			//使用数字匹配所有花色
			for(String thisColor : colors) {
				String thisCard = thisColor + thisNumber;
				//匹配数字与字符串纸牌,完成对应关系
				map.put(cardNumber, thisCard);
				//每加入一个对应关系,就让数字加1
				cardNumber++;
			}
		}
		
		//加入大小王对应关系
		map.put(cardNumber++, "小王");
		map.put(cardNumber, "大王");
//		System.out.println(map);

		//准备牌：
		ArrayList<Integer> poker = new ArrayList<Integer>();
		for(int i = 0; i<54; i++) {
			poker.add(i);
		}
		//打乱顺序
		Collections.shuffle(poker);

		//发牌：
		//将每个人以及底牌设计为ArrayList<Integer>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
		ArrayList<Integer> player01 = new ArrayList<Integer>();
		ArrayList<Integer> player02 = new ArrayList<Integer>();
		ArrayList<Integer> player03 = new ArrayList<Integer>();
		ArrayList<Integer> dipai = new ArrayList<Integer>();
				
		for(int index = 0; index <poker.size()-3; index++) {
			//通过索引,获取代表牌的数字
			Integer integerCard = poker.get(index);
			//对3取模判断发给哪个玩家
			if(index%3==0) {
				player01.add(integerCard);
			}else if(index%3==1){
				player02.add(integerCard);
			}else{
				player03.add(integerCard);
			}
		}
		
		//最后3张是底牌
		for(int index=poker.size()-3; index<poker.size(); index++){
			//获取当前这张牌
			Integer integerCard = poker.get(index);
			dipai.add(integerCard);
		}
		
		//将所有集合排序Collections类的sort方法进行排序
		Collections.sort(player01);
		Collections.sort(player02);
		Collections.sort(player03);
		Collections.sort(dipai);

		//看牌玩家1
		for(int i=player01.size()-1;i>=0;i--) {
			Integer integer = player01.get(i);
			String realCard = map.get(integer);
			System.out.print(realCard+"  ");
		}
		System.out.println();
		//看牌玩家2
		for(int i=player02.size()-1;i>=0;i--) {
			Integer integer = player02.get(i);
			String realCard = map.get(integer);
			System.out.print(realCard+"  ");
		}
		System.out.println();
		//看牌玩家3
		for(int i=player03.size()-1;i>=0;i--) {
			Integer integer = player03.get(i);
			String realCard = map.get(integer);
			System.out.print(realCard+"  ");
		}
		System.out.println();
		//看牌底牌
		for(Integer integer : dipai) {
			String realCard = map.get(integer);
			System.out.print(realCard+"  ");
		}
	}
}