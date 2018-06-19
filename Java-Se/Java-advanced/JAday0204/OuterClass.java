package JAday0204;

public class OuterClass {
    int OuterClass_i=0;
    //成员内部类
    public class InnerClass{
    	int InnerClass_i=0;
    	
    	public void InnerClass_m(){
    		System.out.println("内部类中的方法！");
    		System.out.println("OuterClass"+OuterClass_i);
    	}
    	
    }
    public void OuterClass_m(){
		System.out.println("外部类中的方法！");
		InnerClass ic=new InnerClass();
		System.out.println("InnerClass_i"+ic.InnerClass_i);
    }
}
