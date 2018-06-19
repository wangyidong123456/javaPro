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

	// ��ӡ��Ϣ����
	@Override
	public String toString() {
		return "���ԣ�\n����:" + name + "\n�ȼ�:" + lv + "\n����:" + point.toString() + "\nHP/MaxHP:" + hp + "/" + maxhp
				+ "\nMP/MaxMP:" + mp + "/" + maxmp + "\n����:" + weapon;
	}

	// Ӣ�۹�������
	public void hit(Monster monster) {
		Random r = new Random();
		if (this.weapon == null || this.weapon == "��") {
			monster.hp -= 2;
			System.out.println(this.name + "���ֿ�ȭս��,����˺�Ϊ2");
		} else if (this.weapon == "�����ý�") {
			monster.hp -= 5;
			System.out.println(this.name + "��" + this.weapon + "ս��,����˺�Ϊ5");
		} else if (this.weapon == "���콣") {
			monster.hp -= 8;
			System.out.println(this.name + "��" + this.weapon + "ս��,����˺�Ϊ8");
		} else if (this.weapon == "�𹿰�") {
			if (r.nextInt(10) < 1) {
				monster.hp -= 2 * 12;
				System.out.println(this.name + "��" + this.weapon + "ս��,��������˺�24");
			} else {
				monster.hp -= 12;
				System.out.println(this.name + "��" + this.weapon + "ս��,����˺�Ϊ12");
			}
			
		}
	}

	// �ƶ�Ӣ�۵ķ���
	public void move(String str) {
		if (str == "��") {
			this.point.y++;
		} else if (str == "��") {
			this.point.y--;
		} else if (str == "��") {
			this.point.x--;
		} else if (str == "��") {
			this.point.x++;
		} else {
			System.out.println("�����������������!");
		}
	}
}
