package RPG;

public abstract class Role {
	int name;
	int x;
	int y;
	int hp;
	int maxhp;
	public abstract void move(String str);
}
