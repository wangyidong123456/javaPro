package JAday0306;

import java.util.regex.Pattern;

public class Test03 {

	public static void main(String[] args) {
//		字符类 
//		[abc] a、b 或 c（简单类） 
		System.out.println("--------[abc]---------");
		System.out.println(Pattern.matches("[a.b]", "a"));
		System.out.println(Pattern.matches("[a.b]", "b"));
		System.out.println(Pattern.matches("[a.b]", ".a"));	
//		[^abc] 任何字符，除了 a、b 或 c（否定） 
		System.out.println("--------[^abc]---------");
		System.out.println(Pattern.matches("[^a.b]", "a"));
		System.out.println(Pattern.matches("[^a.b]", "d"));
		System.out.println(Pattern.matches("[^a.b]", "aa"));
//		[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
		System.out.println("--------[a-z A-Z 1-9]---------");
		System.out.println(Pattern.matches("[a-z]", "a"));
		System.out.println(Pattern.matches("[1-5]", "3"));
		System.out.println(Pattern.matches("[A-D]", "a"));
//		[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
		System.out.println("--------[a-d[m-p]]---------");
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));
		System.out.println(Pattern.matches("[a-zA-Z]", "1"));
		
//		[a-z&&[def]] d、e 或 f（交集） 
//		[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去） 
//		[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 

	}

}
