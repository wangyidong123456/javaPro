package JAday0306;

public class Test01 {
	// ��װ�������ͣ�Integer/Float/Short/Long/Double
	// �����������ͣ�int/float/short/long/double
	public static void main(String[] args) {
		int i = 10;
		// ������������10
		Integer i2 = new Integer(10);
		// ����װ��ת�ɻ�����������
		int i3 = i2.intValue();
		i2 = Integer.valueOf(i3);
		new Long(10);
		// int>String
		String s = i + "";
		// String>int
		Integer.parseInt(s);
		Double.parseDouble(s);

		// Integer->String
		s = i2.toString();
		// String->Integer
		i2 = Integer.valueOf(s);

		// �鿴integer���Դ�ŵ����/��С����
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		// ������תΪ�������ַ���
		String binaryString = Integer.toBinaryString(10);
		System.out.println(binaryString);

	}

}
