package Javase_test2;

public class Test05 {
	public static void main(String[] args) {
		int total=0;
		int i = 1;
		for (; i < 100; i++) {
			if (feibo(i) > 1000){
			System.out.println(i);
			break;
			}
			total+=feibo(i);
		}
		System.out.println(feibo(i));
		System.out.println(total);
		
		
		
		int a=1; int b=1; int c=0;
		int sum=2;
		while(c<1000){
			sum+=c;
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(sum);
	}

	public static int feibo(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		return feibo(n - 1) + feibo(n - 2);
	}
}
