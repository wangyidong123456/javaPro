package Javase_test;
public class Test {

    public static void main(String[] args) {
        Child c=new Child();
        c.setName("xiaomap");
        c.setSex("nan");
        c.tell();//tell方法是可以用的
        //c.speak();
        //报错，父类的私有方法不可见
//        Father f=new Father();
        boolean a="asdf" instanceof String;
        System.out.println(a);
    }
}