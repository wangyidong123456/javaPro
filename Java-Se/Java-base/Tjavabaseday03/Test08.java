package Tjavabaseday03;

public class Test08 {

	
		public static void main(String[] args) {
			int a = 10;
			int b = 20;

			// ���
			int result = sum(a, b);
			System.out.println("result:" + result);

			int c = 30;
			// ���
			//int result2 = sum2(a,b,c);
			//System.out.println("result2:"+result2);
			result = sum(a,b,c);
			System.out.println("result:"+result);
		}
		
		/**  
		* @Title: sum  
		* @Description: ����float���͵��������  
		* @param a
		* @param b
		* @return    
		*/
		public static double sum(double a,double b) {
			return a + b;
		}

		/**  
		* @Title: sum  
		* @Description: ������������� 
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
		* @Description: �������������  
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
		* @Description: �������������  
		* @param a
		* @param b
		* @return    
		*/
		public static int sum(int a, int b) {
			return a + b;

	}

}
