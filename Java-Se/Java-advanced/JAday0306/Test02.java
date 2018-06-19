package JAday0306;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
	// 正则表达式是专门解决字符串规则匹配的工具。
	public static void main(String[] args) {
		//预编译一个模式存在P中
		//. 表示任意一个字符
		Pattern p=Pattern.compile("a.......b");
		//将该模式应用到指定的字符串中，将匹配的结果作为返回值存在Matcher中
		Matcher m=p.matcher("aadfwderb");
		//m.matches()获取匹配的结果  ture 或false
        System.out.println(m.matches());     
        System.out.println(Pattern.compile("a.b").matcher("acb").matches());
        System.out.println(Pattern.matches("a.b", "aaaab"));
        
        
	}

}
