package JAday0206;

import org.junit.Test;

public class Test03 {
    @Test
	public  void Test01() {
		String str = "d: source myphoto ∂¨ÃÏ–°∫”.jpg";
        String [] s= str.split("\\s");
        for (int i = 0; i < s.length ; i++) {
			System.out.println(s[i]);
		}
	}
    @Test
   	public  void Test02() {
    	 String str="ABCDE";
       	 str.substring(3);
       	 str.concat("XYZ");
       	 System.out.print(str);
    }
}
