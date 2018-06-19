package JAday0204;

public   class   Example{ 
//	private  char value[];
  	public   static   void   main(String[]   args){ 
  		StringBuffer buf1=new StringBuffer(20);      
  		System.out.println(buf1.length()+","+buf1.capacity()); 		
  		System.out.println(10+','+20);
  		
  		String s="asdfasdf";
  		int i=3;
//  		s+=i;
  		s=i+s;
  	
  		System.out.println(s);
  		System.out.println( "john".equals(new String("john")));
//  		String temp[]={"a","b","c"};
//  				char v2[] = s.value;
  		
  	}   
}