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
    	System.out.println("��ʾ����ʾ������"+content);
    }
    public void showProperties(){
    	System.out.println("---------��ʾ����������-------");
    	System.out.println("---------Ʒ��:"+this.brand+"-------");
    	System.out.println("---------��ɫ:"+this.color+"-------");
    }
}
