package JAday0206;

public class Test01 {

	public static void main(String[] args) {
		// ��֪һ���ļ�����·�����ļ����Ʋ�ȷ�����ļ�������ͼƬ����.jpg/jpge/gif����
		// d:\\source\\images\\myphoto\\����С��.jpg
		Test01 ts = new Test01();
		String str = "d:\\source\\myphoto\\����С��.jpg";
		String str1 = ts.fileNameChange(str, "20180515");
		System.out.println(str1);
	}

	// �޸��ļ����Ƶķ���������һ���ļ�����·����
	public String fileNameChange(String oldStr, String newStr) {
		String[] s = oldStr.split("\\\\");
		// ����С��.jpg
		String str1 = s[s.length - 1];
		String str2 = new String();
		if (str1.endsWith(".jpg")) {
			s[s.length - 1] = newStr + ".jpg";
		} else if (str1.endsWith(".jpge")) {
			s[s.length - 1] = newStr + ".jpge";
		} else if (str1.endsWith(".gif")) {
			s[s.length - 1] = newStr + ".gif";
		} else {
			System.out.println("�ļ���ʽ����ȷ");
		}
		for (int i = 0; i < s.length - 1; i++) {
			str2 += s[i] + "\\\\";
		}
		str2 += s[s.length - 1];
		return str2;
	}
}
