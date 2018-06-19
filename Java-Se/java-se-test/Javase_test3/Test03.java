package Javase_test3;


public class Test03 {
	public static void main(String[] args) {
		String s="java asdf avc";
		String ss [] =s.split(" ");
//		System.out.println(Arrays.toString(ss));
		StringBuilder temp=new StringBuilder();
		for(int i=0;i<ss.length;i++){
			StringBuilder sb=new StringBuilder(ss[i]);
			ss[i]=sb.reverse().toString();
			if(i!=ss.length-1){
			temp.append(ss[i]+" ");
			}else{
				temp.append(ss[i]);
			}
		}
		System.out.println(temp);
		
		int a=12330;
		String s1=a+"";
		StringBuilder sbb=new StringBuilder(s1);
		sbb.reverse();
		s1=sbb.toString();
		a=Integer.parseInt(s1);
		System.out.println(a);
	}

}
