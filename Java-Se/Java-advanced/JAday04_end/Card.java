package JAday04_end;

public class Card {
	private String number;
	private String color;
	public Card() {

	}

	public Card(String number, String color) {
		super();
		this.number = number;
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
    public String toString(){
		return color+number;
    }
}
