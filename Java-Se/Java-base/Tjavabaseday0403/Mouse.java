package Tjavabaseday0403;

public class Mouse {
    private String brand;
    private String color;
    public Mouse(){
    	
    }
    public Mouse(String brand,String color){
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
    public void click(String content){
    	System.out.println("鼠标单击");
    }
    public void dbclick(){
    	System.out.println("鼠标双击");
    }
    public void move(){
    	System.out.println("鼠标滑动");
    }
    public void showProperties(){
    	System.out.println("---------鼠标配置如下-------");
    	System.out.println("---------品牌:"+this.brand+"-------");
    	System.out.println("---------颜色:"+this.color+"-------");
    }
}
