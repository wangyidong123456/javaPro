package JAday0204;

public class OuterClass {
    int OuterClass_i=0;
    //��Ա�ڲ���
    public class InnerClass{
    	int InnerClass_i=0;
    	
    	public void InnerClass_m(){
    		System.out.println("�ڲ����еķ�����");
    		System.out.println("OuterClass"+OuterClass_i);
    	}
    	
    }
    public void OuterClass_m(){
		System.out.println("�ⲿ���еķ�����");
		InnerClass ic=new InnerClass();
		System.out.println("InnerClass_i"+ic.InnerClass_i);
    }
}
