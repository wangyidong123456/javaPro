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
    	System.out.println("��굥��");
    }
    public void dbclick(){
    	System.out.println("���˫��");
    }
    public void move(){
    	System.out.println("��껬��");
    }
    public void showProperties(){
    	System.out.println("---------�����������-------");
    	System.out.println("---------Ʒ��:"+this.brand+"-------");
    	System.out.println("---------��ɫ:"+this.color+"-------");
    }
}
