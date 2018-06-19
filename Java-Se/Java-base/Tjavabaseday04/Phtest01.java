package Tjavabaseday04;

public class Phtest01 {

	public static void main(String[] args) {
		Phone p = new Phone();
		// 输出成员变量
		System.out.println("品牌：" + p.brand);// null
		System.out.println("价格：" + p.price);// 0
		System.out.println("颜色：" + p.color);// null
		System.out.println("-------------------");

		// 给成员变量赋值
		p.brand = "华为Mate10";
		p.price = 3999;
		p.color = "黑色";

		// 再次输出成员变量
		System.out.println("品牌：" + p.brand);// 华为Mate10
		System.out.println("价格：" + p.price);// 3999
		System.out.println("颜色：" + p.color);// 黑色
		System.out.println("-------------------");

		// 调用成员方法
		p.call("吴京");
		p.sendMessage();
		
		
        System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		//给成员变量赋值
		p.brand="锤子";
		p.price=2999;
		p.color="棕色";
		
		//再次输出成员变量
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		//调用成员方法
		p.call("林青霞");
		p.sendMessage();


	}

}
