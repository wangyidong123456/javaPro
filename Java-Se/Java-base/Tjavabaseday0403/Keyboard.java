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
    	System.out.println("�������룺"+key);
    }
    public void showProperties(){
    	System.out.println("---------������������-------");
    	System.out.println("---------Ʒ��:"+this.brand+"-------");
    	System.out.println("---------��ɫ:"+this.color+"-------");
    }
}
