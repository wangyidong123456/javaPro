package JAday01;

public class Person {
	protected String cardId;
	protected String name;
	protected String sex;
	int a;
	public Person(){
		
	}
	public Person(String cardId, String name, String sex) {
		super();
		this.cardId = cardId;
		this.name = name;
		this.sex = sex;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void eat() {

	}

	public void sleep() {

	}

	public void study() {

	}
	public void work(){
		System.out.println("人类要生存就得工作");
	}
}
