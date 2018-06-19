package Tjavabaseday03;
public class Test07 {

	public static void main(String[] args) {
	int count=0;
      for(int i=1;i<=1000000;i++){
    	  if(ispalindrome(i)==true){
    		  System.out.println(i);
    		  count++;
    	  }
      }
      System.out.println("count"+count);
	} 
	
	
	/**
	 * 
	 * @param n
	 */
	/*12345   
	// t                             n
	// 0                             12345
    // 5                             1234
	// 5*10+4                        123
	// (5*10+4)*10+3                 12
	// ((5*10+4)*10+3)*10+2          1
	// (((5*10+4)*10+3)*10+2)*10+1   0
 	*/
	
    public static boolean ispalindrome(int n){
    	int m=n;
    	int t=0;
        for(;n>0;){
        	t=t*10+n%10;
        	n=n/10;
        }
        return m==t;
    }
}
