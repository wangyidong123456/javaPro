package RPG;

import java.util.Random;

public class Hero extends Role {
	String name;
	int lv;
	Point point;
	int hp;
	int maxhp;
	int mp;
	int maxmp;
	String weapon;

	public Hero() {

	}

	public Hero(String name, int lv, Point point, int hp, int maxhp, int mp, int maxmp, String weapon) {
		super();
		this.name = name;
		this.lv = lv;
		this.point = point;
		this.hp = hp;
		this.maxhp = maxhp;
		this.mp = mp;
		this.maxmp = maxmp;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
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

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getMaxmp() {
		return maxmp;
	}

	public void setMaxmp(int maxmp) {
		this.maxmp = maxmp;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = new String(weapon);
	}

	// 打印信息方法
	@Override
	public String toString() {
		return "属性：\n名字:" + name + "\n等级:" + lv + "\n坐标:" + point.toString() + "\nHP/MaxHP:" + hp + "/" + maxhp
				+ "\nMP/MaxMP:" + mp + "/" + maxmp + "\n武器:" + weapon;
	}

	// 英雄攻击方法
	public void hit(Monster monster) {
		Random r = new Random();
		if (this.weapon == null || this.weapon == "无") {
			monster.hp -= 2;
			System.out.println(this.name + "赤手空拳战斗,打出伤害为2");
		} else if (this.weapon == "绝世好剑") {
			monster.hp -= 5;
			System.out.println(this.name + "用" + this.weapon + "战斗,打出伤害为5");
		} else if (this.weapon == "倚天剑") {
			monster.hp -= 8;
			System.out.println(this.name + "用" + this.weapon + "战斗,打出伤害为8");
		} else if (this.weapon == "金箍棒") {
			if (r.nextInt(10) < 1) {
				monster.hp -= 2 * 12;
				System.out.println(this.name + "用" + this.weapon + "战斗,打出暴击伤害24");
			} else {
				monster.hp -= 12;
				System.out.println(this.name + "用" + this.weapon + "战斗,打出伤害为12");
			}
			
		}
	}

	// 移动英雄的方法
	public void move(String str) {
		if (str == "上") {
			this.point.y++;
		} else if (str == "下") {
			this.point.y--;
		} else if (str == "左") {
			this.point.x--;
		} else if (str == "右") {
			this.point.x++;
		} else {
			System.out.println("输入错误请重新输入!");
		}
	}
}
