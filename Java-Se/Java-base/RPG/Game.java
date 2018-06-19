package RPG;

public class Game {
	public static void main(String[] args) {
		Point pt = new Point(0, 0);
		Point pt11 = new Point(0, 3);
		Point pt12 = new Point(0, 4);
		Point pt13 = new Point(0, 5);
		Point pt14 = new Point(0, 6);
		Point pt15 = new Point(0, 7);
		Point pt21 = new Point(0, 9);
		Point pt22 = new Point(3, 9);
		Point pt23 = new Point(6, 9);
		Point pt3 = new Point(9, 9);
		Hero hero = new Hero("伊利丹-怒风", 1, pt, 1 * 100, 1 * 100, 1 * 100, 1 * 100, "无");
		Monster m1 = new Monster("小鱼人1", pt11, "小怪物", 1, 1, 50, 50);
		Monster m2 = new Monster("小鱼人2", pt12, "小怪物", 1, 1, 50, 50);
		Monster m3 = new Monster("小鱼人3", pt13, "小怪物", 1, 1, 50, 50);
		Monster m4 = new Monster("小鱼人4", pt14, "小怪物", 1, 1, 50, 50);
		Monster m5 = new Monster("小鱼人5", pt15, "小怪物", 1, 1, 50, 50);
		Monster e1 = new Monster("鱼人精英1", pt21, "精英怪", 2, 1, 100, 100);
		Monster e2 = new Monster("鱼人精英2", pt22, "精英怪", 2, 1, 100, 100);
		Monster e3 = new Monster("鱼人精英3", pt23, "精英怪", 2, 1, 100, 100);
		Monster boss = new Monster("老瞎眼", pt3, "boss", 5, 1, 200, 200);
		System.out.println(hero.toString() + "\n");
		System.out.println(m1.toString() + "\n");
		// System.out.println(m2.toString() + "\n");
		// System.out.println(m3.toString() + "\n");
		// System.out.println(m4.toString() + "\n");
		// System.out.println(m5.toString() + "\n");
		System.out.println(e1.toString() + "\n");
		// System.out.println(elite2.toString() + "\n");
		// System.out.println(elite3.toString() + "\n");
		System.out.println(boss.toString() + "\n");

		// 第一场战斗
		hero.move("上");
		// hero.setWeapon("倚天剑");
		hero.move("上");
		for (; hero.hp > 0 && m1.hp > 0;) {
			hero.hit(m1);
			if(m1.hp > 0){
			m1.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		System.out.println(m1.toString() + "\n");
		System.out.println("掉落：绝世好剑  伤害+3");
		
		hero.setWeapon("绝世好剑");
		
		System.out.println(hero.toString() + "\n");
		// exp(50/100)

		// 第二场战斗
		hero.move("上");
		for (; hero.hp > 0 && m2.hp > 0;) {
			hero.hit(m2);
			if(m2.hp > 0){
			m2.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		// hero up lv+1
		System.out.println(m2.toString() + "\n");
		System.out.println( "hero up lv+1");
		// exp(100/100)
		hero.setLv(hero.getLv() + 1);
		hero.setMaxhp(hero.getLv() * 100);
		hero.setHp(hero.getLv() * 100);
		hero.setMp(hero.getLv() * 100);
		hero.setMaxmp(hero.getLv() * 100);
		System.out.println(hero.toString() + "\n");

		// 第三场战斗 exp(0/200)
		hero.move("上");
		for (; hero.hp > 0 && m3.hp > 0;) {
			hero.hit(m3);
			if(m3.hp > 0){
			m3.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		System.out.println(m3.toString() + "\n");
		// exp(50/200)

		// 第四场战斗
		hero.move("上");
		for (; hero.hp > 0 && m4.hp > 0;) {
			hero.hit(m4);
			if(m4.hp > 0){
			m4.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		System.out.println(m4.toString() + "\n");
		// exp(100/200)

		// 第五场战斗
		hero.move("上");
		for (; hero.hp > 0 && m5.hp > 0;) {
			hero.hit(m5);
			if(m5.hp > 0){
			m5.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		System.out.println(m5.toString() + "\n");
		// exp(150/200)

		// 第六场战斗
		hero.move("上");
		hero.move("上");
		for (; hero.hp > 0 && e1.hp > 0;) {
			hero.hit(e1);
			if(e1.hp > 0){
			e1.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		System.out.println(e1.toString() + "\n");
		// exp(300/200)
		System.out.println("掉落：倚天剑 伤害+6");
		hero.setWeapon("倚天剑");
		hero.setLv(hero.getLv() + 1);
		hero.setMaxhp(hero.getLv() * 100);
		hero.setHp(hero.getLv() * 100);
		hero.setMp(hero.getLv() * 100);
		hero.setMaxmp(hero.getLv() * 100);
		System.out.println( "hero up lv+1");
		System.out.println(hero.toString() + "\n");
		// exp(100/400)

		// 第六场战斗
		hero.move("上");
		hero.move("右");
		hero.move("右");
		for (; hero.hp > 0 && e2.hp > 0;) {
			hero.hit(e2);
			if(e2.hp > 0){
			e2.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		System.out.println(e2.toString() + "\n");
		// exp(250/400)

		// 第七场战斗
		hero.move("右");
		hero.move("右");
		hero.move("右");
		for (; hero.hp > 0 && e3.hp > 0;) {
			hero.hit(e3);
			if(e3.hp > 0){
			e3.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		System.out.println(e3.toString() + "\n");
		System.out.println("掉落：金箍棒 伤害+10,暴击率10%");
		hero.setWeapon("金箍棒");
		// exp(400/400)
		hero.setLv(hero.getLv() + 1);
		hero.setMaxhp(hero.getLv() * 100);
		hero.setHp(hero.getLv() * 100);
		hero.setMp(hero.getLv() * 100);
		hero.setMaxmp(hero.getLv() * 100);
		System.out.println( "hero up lv+1");
		System.out.println(hero.toString() + "\n");
		// exp(0/800)

		// 第八场战斗
		hero.move("右");
		hero.move("右");
		hero.move("右");
		for (; hero.hp > 0 && boss.hp > 0;) {
			hero.hit(boss);
			if(boss.hp > 0){
			boss.hit(hero);
			}
		}
		System.out.println("\n" + hero.toString() + "\n");
		System.out.println(boss.toString() + "\n");
		if(hero.hp>0){
			System.out.println("恭喜您通关了!");
		}else{
			System.out.println("Game Over!");
		}
	}
}
