package Tjavabaseday03;

public class Test08 {

	
		public static void main(String[] args) {
			int a = 10;
			int b = 20;

			// 求和
			int result = sum(a, b);
			System.out.println("result:" + result);

			int c = 30;
			// 求和
			//int result2 = sum2(a,b,c);
			//System.out.println("result2:"+result2);
			result = sum(a,b,c);
			System.out.println("result:"+result);
		}
		
		/**  
		* @Title: sum  
		* @Description: 两个float类型的数据求和  
		* @param a
		* @param b
		* @return    
		*/
		public static double sum(double a,double b) {
			return a + b;
		}

		/**  
		* @Title: sum  
		* @Description: 三个整数的求和 
		* @param a
		* @param b
		* @param c
		* @return    
		*/
		public static int sum(int a,int b,int c) {
			return a + b + c;
		}
		
		/**  
		* @Title: sum2  
		* @Description: 三个整数的求和  
		* @param a
		* @param b
		* @param c
		* @return    
		*/
		/*
		public static int sum2(int a, int b, int c) {
			return a + b + c;
		}*/
		
		/**  
		* @Title: sum  
		* @Description: 两个整数的求和  
		* @param a
		* @param b
		* @return    
		*/
		public static int sum(int a, int b) {
			return a + b;

	}

}
