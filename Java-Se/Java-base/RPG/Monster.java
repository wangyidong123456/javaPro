package RPG;

import java.util.Random;

public class Monster extends Role {
	String name;
	Point point;
	String monsterLv;
	int attack;
	int rage;
	int hp;
	int maxhp;

	public Monster() {

	}

	public Monster(String name, Point point, String monsterLv, int attack, int rage, int hp, int maxhp) {
		super();
		this.name = name;
		this.point = point;
		this.monsterLv = monsterLv;
		this.attack = attack;
		this.rage = rage;
		this.hp = hp;
		this.maxhp = maxhp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public String getMonsterLv() {
		return monsterLv;
	}

	public void setMonsterLv(String monsterLv) {
		this.monsterLv = monsterLv;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getRage() {
		return rage;
	}

	public void setRage(int rage) {
		this.rage = rage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	@Override
	public String toString() {
		return "属性：\n名字:" + name + "\n坐标:" + point.toString() + "\n怪物类别:" + monsterLv + "\n攻击力:" + attack + "\n愤怒值："
				+ rage + "\nHP/MaxHP:" + hp + "/" + maxhp;
	}

	// 怪物攻击方法
	public void hit(Hero hero) {
		Random r = new Random();
		int i = r.nextInt(10);
		if (this.monsterLv == "小怪物") {
			if (this.hp < this.maxhp * 0.2) {
				this.rage = 2;
				System.out.print("狂暴状态！ ");
			}
//			hero.hp -= this.attack * this.rage * 2;
//			System.out.println(this.name + "攻击,打出伤害为" + this.attack * this.rage * 2);

		} else if (this.monsterLv == "精英怪") {
			if (this.hp < this.maxhp * 0.3) {
				this.rage = 2;
				System.out.print("狂暴状态！ ");
			}
//			hero.hp -= this.attack * this.rage * 2;
//			System.out.println(this.name + "攻击,打出伤害为" + this.attack * this.rage * 2);
		} else if (this.monsterLv == "boss") {
			if (this.hp < this.maxhp * 0.5) {
				this.rage = 3;
				System.out.print("狂暴状态！ ");
				if (this.hp < this.maxhp * 0.2) {
					this.attack = 5 * 2;
					System.out.print("狂化状态！ ");
//					if (i < 1) {
//						hero.hp -= this.attack * this.rage * 2 * 2;
//						System.out.println("致命一击\n" + this.name + "攻击,打出伤害为" + this.attack * this.rage * 2 * 2);
//					}
				}
			}
			
		}
		if(this.monsterLv == "boss"&&this.hp < this.maxhp * 0.2&&i<1){
			this.attack=20;
			System.out.print("致命一击！ ");
		}
		hero.hp -= this.attack * this.rage * 2;
		System.out.println(this.name + "攻击,打出伤害为" + this.attack * this.rage * 2);
	}

	// 怪物移动的方法
	public void move(String str) {
		if (str == "上") {
			this.point.y--;
		} else if (str == "下") {
			this.point.y++;
		} else if (str == "左") {
			this.point.x--;
		} else if (str == "右") {
			this.point.x++;
		} else {
			System.out.println("输入错误请重新输入!");
		}
	}

}
