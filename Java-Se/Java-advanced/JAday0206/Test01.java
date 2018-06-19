package JAday0206;

public class Test01 {

	public static void main(String[] args) {
		// 已知一个文件绝对路径（文件名称不确定，文件类型是图片类型.jpg/jpge/gif）：
		// d:\\source\\images\\myphoto\\冬天小河.jpg
		Test01 ts = new Test01();
		String str = "d:\\source\\myphoto\\冬天小河.jpg";
		String str1 = ts.fileNameChange(str, "20180515");
		System.out.println(str1);
	}

	// 修改文件名称的方法，传入一个文件绝对路径，
	public String fileNameChange(String oldStr, String newStr) {
		String[] s = oldStr.split("\\\\");
		// 冬天小河.jpg
		String str1 = s[s.length - 1];
		String str2 = new String();
		if (str1.endsWith(".jpg")) {
			s[s.length - 1] = newStr + ".jpg";
		} else if (str1.endsWith(".jpge")) {
			s[s.length - 1] = newStr + ".jpge";
		} else if (str1.endsWith(".gif")) {
			s[s.length - 1] = newStr + ".gif";
		} else {
			System.out.println("文件格式不正确");
		}
		for (int i = 0; i < s.length - 1; i++) {
			str2 += s[i] + "\\\\";
		}
		str2 += s[s.length - 1];
		return str2;
	}
}
