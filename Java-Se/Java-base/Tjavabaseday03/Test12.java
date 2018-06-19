package Tjavabaseday03;

public class Test12 {

	public static void main(String[] args) {
	int[] arr={21,9,4,3454,56,45,65,67,674,6,3,232,3,4};
	
	System.out.println("max:"+numberMax (arr));//方法，数组中最大值	
	System.out.println("min:"+numberMin(arr));//方法数组中最小值
	System.out.println("avg:"+numberAverage (arr));//方法数组中平均值
	System.out.println(index (arr,5));//方法数组某个数的引索
	System.out.println(index (arr,4));
	System.out.println(inde (arr,8,4));
	System.out.println(inde (arr,50,4));
	System.out.println(endIndex (arr,4));
	System.out.println(numberIndex (arr,5));
	revesePritnl(arr);
	rPritnl(arr);
	}
	public static void rPritnl(int[]arr){
	System.out.print("将数组反向输出为：[");
	for (int x = arr.length - 1; x >= 0; x--) {
		if(x==0){
			System.out.println(arr[x]+"]");
		}  else{
			System.out.print(arr[x] + ",");
		}
		}
	}
	public static void revesePritnl(int[]arr){
		int n=0;
		for(int x=0, y=arr.length-1 ;x<y;x++,y--){
			n=arr[x];
			arr[x]=arr[y];
			arr[y]=n;
		}
		System.out.print("将数组收尾互换收输出[");
		for(int i=0;i<=arr.length-1;i++){
			if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}		else{System.out.print(arr[i]+",");
			}
		}
	}
	public static int numberIndex(int[] arr,int keyword ){
		int idx=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==keyword){
				idx++;
				
			}	
		}
		return idx;
	}
	public static int endIndex(int[] arr,int keyword ){
		int idx=-1;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==keyword){
				idx= i;
				break;
			}	
		}
		return idx;
	}
	public static int inde(int[] arr,int index ,int keyword ){
		if(index<0||index>arr.length){
			return -1;
		}
		int idx=-1;
		for(int i=index;i<arr.length;i++){
			if(arr[i]==keyword){
				idx= i;
				break;
			}	
		}
		return idx;
	}
public static int index(int[] arr,int keyword ){
	int idx=-1;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==keyword){
			idx= i;
			break;
		}	
	}
	return idx;
}
public static int numberMax(int [] arr){
	int max=arr[0];
	for(int x=0;x<arr.length;x++){
		if(arr[x]>max){
			max=arr[x];
		}
		
	}
	return max;
}
	
public static int numberMin(int [] arr){
	int min=arr[0];
	for(int x=0;x<arr.length;x++){
		if(arr[x]<min){
			min=arr[x];
		}
		
	}
	return min;
}
	
public static int numberAverage(int [] arr){
	int sum=0;
	for(int x=0;x<arr.length;x++){
		sum+=arr[x];
		}
	return sum/arr.length;
}
}
