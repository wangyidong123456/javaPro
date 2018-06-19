package Tjavabaseday0403;

public class Screen {
    private String brand;
    private String color;
    public Screen(){
    	
    }
    public Screen(String brand,String color){
    	this.brand=brand;
    	this.color=color;
    }
    public String getBrand(){
    	return this.brand;
    }
    public void  setBrand(String brand){
    	 this.brand=brand;
    }
    public String getColor(){
    	return this.color;
    }
    public void  setColor(String color){
   	 this.color=color;
    }
    public void show(String content){
    	System.out.println("显示器显示的内容"+content);
    }
    public void showProperties(){
    	System.out.println("---------显示器配置如下-------");
    	System.out.println("---------品牌:"+this.brand+"-------");
    	System.out.println("---------颜色:"+this.color+"-------");
    }
}
