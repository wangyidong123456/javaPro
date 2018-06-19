package Tjavabaseday0405;

public class Test11 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {1,2,3};	
		//调用方法
		String s = arrayToString(arr);
		//输出结果
		System.out.println("s:"+s);
	}	
	/*
	* 两个明确：
	* 		返回值类型：String
	* 		参数列表：int[] arr
	*/
	/**  
	* @Title: arrayToString  
	* @Description: 把数组拼接成字符串  
	* @param arr
	* @return    
	*/
	public static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		//[1, 2, 3]
		sb.append("[");
		for(int x=0; x<arr.length; x++) {
			if(x==arr.length-1) {
				sb.append(arr[x]);
			}else {
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");
		
		String result = sb.toString();
		
		return result;
	}

}
