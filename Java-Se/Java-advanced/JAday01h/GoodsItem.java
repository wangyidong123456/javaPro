package JAday01h;

public class GoodsItem {
	// ����
	private String name;
	// ����
	private String id;
	// ����
	private double price;
	// ����
	private double number;
	// �Ƽ۵�λ
	private String unit;
	// ���
	private double money;

	public GoodsItem() {
	}
	public GoodsItem(String name, String id, double price, double number, String unit, double money) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.number = number;
		this.unit = unit;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	//��ӡ��ǰ����Ʒ����Ϣ
	public void print(){
		System.out.print("\t��Ʒ���ƣ�"+this.name);
		System.out.print("\t��Ʒ���ţ�"+this.id);
		System.out.print("\t��Ʒ���ۣ�"+this.price);
		System.out.print("\t��Ʒ��λ��"+this.unit);
		System.out.println("");
	}
}
