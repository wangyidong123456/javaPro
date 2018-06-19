package Tjavabaseday03;

public class Test04 {
	public static void reverse(int[] arr) {
		//·´×ª³ÌĞò£»
		int t;
		for (int i1 = 0, j = arr.length - 1; i1 < j; i1++, j--) {
			t = arr[i1];
			arr[i1] = arr[j];
			arr[j] = t;
		}
		
	}
  public static void printarr(int[]arr){
	  System.out.print("[");
	  for (int x =0 ; x <arr.length ; x++) {
		  if(x==arr.length-1){
			System.out.print(arr[x] );
		}else{
			 System.out.print(arr[x]+",");
		}
		  }
	  System.out.println("]");
  }
	public static void main(String[] args) {
		
		
      int[] arr={1,2,33,55,44,66,98};
      printarr(arr);
      System.out.println("--------reverse-----");
      reverse(arr);
    
      printarr(arr);
		}
	}


