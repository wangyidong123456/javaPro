package Tjavabaseday0403;

public class Keyboard {
    private String brand;
    private String color;
    public Keyboard(){
    	
    }
    public Keyboard(String brand,String color){
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
    public void input(String key){
    	System.out.println("按键输入："+key);
    }
    public void showProperties(){
    	System.out.println("---------键盘配置如下-------");
    	System.out.println("---------品牌:"+this.brand+"-------");
    	System.out.println("---------颜色:"+this.color+"-------");
    }
}
