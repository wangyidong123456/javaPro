package RPG;

public class Test01 {

	public static void main(String[] args) {
		Hero hero = new Hero("������-ŭ��", 1, null, 1 * 100, 1 * 100, 1 * 100, 1 * 100, "��");
        System.out.println(hero.weapon=="��");
        
        String str="abc"; 
        String str2="abc"; 
        System.out.println(str== str2);
        String str1=new String("abc");
        System.out.println(str1==str);
        
	}

}
