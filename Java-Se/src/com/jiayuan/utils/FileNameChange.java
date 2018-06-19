package com.jiayuan.utils;

public class FileNameChange {

	public static void main(String[] args) {
		// 已知一个文件绝对路径（文件名称不确定，文件类型是图片类型.jpg/jpge/gif）：
		// d:\\source\\images\\myphoto\\冬天小河.jpg
		FileNameChange fnc = new FileNameChange();
		String str = "d:\\source\\images\\myphoto\\冬天小河.jpg";
		String str1 = fnc.fileNameChange(str, "20180515");
		System.out.println(str1);
	}

	// 修改文件名称的方法，传入一个文件绝对路径，
	public String fileNameChange(String oldStr, String newStr) {
		String[] s = oldStr.split("\\\\");
		// 冬天小河.jpg
		String str1 = s[s.length - 1];
		String [] s1=str1.split("\\.");
		s[s.length - 1]=newStr+"."+s1[s1.length-1];
//		System.out.println(s[s.length-1]);
		String str2 = new String();
		for (int i = 0; i < s.length - 1; i++) {
			str2 += s[i] + "\\";
		}
		str2 += s[s.length - 1];
		return str2;
	}
}
