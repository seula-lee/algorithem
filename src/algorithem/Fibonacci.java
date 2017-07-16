package algorithem;

import java.util.Scanner;

public class Fibonacci {

	// 문제 : 피보나치 수열을 입력 받은 숫자 개수만큼 출력하라
	// 1 1 2 3 5 8 13 21 34....
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=1;  i<= n; i++){
			System.out.print(" "+ fn_fibo(i));			
		}

		sc.close();
		
		
	}
	
	public static int fn_fibo(int n){
		if(n<=1){
			return n;
		}else{
			return fn_fibo(n-1) + fn_fibo(n-2);
		}
		
	}

}
