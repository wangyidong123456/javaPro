package JAday0306;

public class Test01 {
	// 包装数据类型：Integer/Float/Short/Long/Double
	// 基本数据类型：int/float/short/long/double
	public static void main(String[] args) {
		int i = 10;
		// 定义引用类型10
		Integer i2 = new Integer(10);
		// 将包装类转成基本数据类型
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

		// 查看integer可以存放的最大/最小的数
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		// 将整数转为二进制字符串
		String binaryString = Integer.toBinaryString(10);
		System.out.println(binaryString);

	}

}
