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
		return "���ԣ�\n����:" + name + "\n����:" + point.toString() + "\n�������:" + monsterLv + "\n������:" + attack + "\n��ŭֵ��"
				+ rage + "\nHP/MaxHP:" + hp + "/" + maxhp;
	}

	// ���﹥������
	public void hit(Hero hero) {
		Random r = new Random();
		int i = r.nextInt(10);
		if (this.monsterLv == "С����") {
			if (this.hp < this.maxhp * 0.2) {
				this.rage = 2;
				System.out.print("��״̬�� ");
			}
//			hero.hp -= this.attack * this.rage * 2;
//			System.out.println(this.name + "����,����˺�Ϊ" + this.attack * this.rage * 2);

		} else if (this.monsterLv == "��Ӣ��") {
			if (this.hp < this.maxhp * 0.3) {
				this.rage = 2;
				System.out.print("��״̬�� ");
			}
//			hero.hp -= this.attack * this.rage * 2;
//			System.out.println(this.name + "����,����˺�Ϊ" + this.attack * this.rage * 2);
		} else if (this.monsterLv == "boss") {
			if (this.hp < this.maxhp * 0.5) {
				this.rage = 3;
				System.out.print("��״̬�� ");
				if (this.hp < this.maxhp * 0.2) {
					this.attack = 5 * 2;
					System.out.print("��״̬�� ");
//					if (i < 1) {
//						hero.hp -= this.attack * this.rage * 2 * 2;
//						System.out.println("����һ��\n" + this.name + "����,����˺�Ϊ" + this.attack * this.rage * 2 * 2);
//					}
				}
			}
			
		}
		if(this.monsterLv == "boss"&&this.hp < this.maxhp * 0.2&&i<1){
			this.attack=20;
			System.out.print("����һ���� ");
		}
		hero.hp -= this.attack * this.rage * 2;
		System.out.println(this.name + "����,����˺�Ϊ" + this.attack * this.rage * 2);
	}

	// �����ƶ��ķ���
	public void move(String str) {
		if (str == "��") {
			this.point.y--;
		} else if (str == "��") {
			this.point.y++;
		} else if (str == "��") {
			this.point.x--;
		} else if (str == "��") {
			this.point.x++;
		} else {
			System.out.println("�����������������!");
		}
	}

}
