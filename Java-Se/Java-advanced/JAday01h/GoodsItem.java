package JAday01h;

public class GoodsItem {
	// 名称
	private String name;
	// 货号
	private String id;
	// 单价
	private double price;
	// 数量
	private double number;
	// 计价单位
	private String unit;
	// 金额
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
	//打印当前上商品的信息
	public void print(){
		System.out.print("\t商品名称："+this.name);
		System.out.print("\t商品货号："+this.id);
		System.out.print("\t商品单价："+this.price);
		System.out.print("\t商品单位："+this.unit);
		System.out.println("");
	}
}
