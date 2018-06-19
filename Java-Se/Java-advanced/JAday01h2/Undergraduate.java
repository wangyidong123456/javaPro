package JAday01h2;

public class Undergraduate extends Student{
    private String degree;
    public Undergraduate(){
    	
    }
    public Undergraduate(String name,int age,String degree){
    	super(name,age);
    	this.degree=degree;
    }
    @Override
    public void show(){
    	System.out.println(super.getName()+super.getAge()+this.degree);
    }
} 
