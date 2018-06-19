package com.igeek.ad1_5.Recursion;

public class Test02 {
    //µÝ¹éÇó½×³Ë
	public static void main(String[] args) {
		System.out.println(methods(5));
       
	}
	public static int methods(int n){
		if(n==1){
			return 1;
		}
		return n*methods(n-1);
    }
}
