package Review;

import org.junit.Test;

public class Test02 {
	@Test
	public void test01() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	@Test
	public void test02() {
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Test
	public void test03() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 4 - j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

	@Test
	public void test04() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

	@Test
	public void test05() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 5; j++) {
				if (i < 4 - j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}

	}

	@Test
	public void test06() {
		for (int i = 5; i > 0; i--) {
			for (int j = 4 + i; j > 0; j--) {
				if (2 * i - 1 < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	@Test
	public void test07() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <i-1; j++) {
				System.out.print(" ");
			}
			for(int k=10;k>2*i-1;k--){
				if(k==10||k==2*i||i==1){
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}
	
	int n=8;
	@Test
	public void test08() {
		for (int i = 1; i <n; i++) {
			for(int k=n-i;k>0;k--){
				System.out.print(" ");
			}
			for (int j = 0; j <2*i-1 ; j++) {
				if(j==0||j==2*i-2){
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <i-1; j++) {
				System.out.print(" ");
			}
			for(int k=2*n;k>2*i-1;k--){
				if(k==2*n||k==2*i){
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	@Test
	public void test09() {
		for (int i = 1; i <n; i++) {
			for(int k=n-i;k>0;k--){
				System.out.print(" ");
			}
			for (int j = 0; j <2*i-1 ; j++) {
					System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <i-1; j++) {
				System.out.print(" ");
			}
			for(int k=2*n;k>2*i-1;k--){
					System.out.print("*");
			}
			System.out.println("");
		}
	}
}
