package algorithem;

import java.util.Scanner;



/**
 * Factorial 
 * @author salee
 * @document n! = n x (n-1) x (n-2) x ....x 1
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a value: ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		
		System.out.println(fn_factorial(Integer.parseInt(s)));
		
		sc.close();
	}
	
	public static int fn_factorial(int n){		
		
		if(n <= 1){
			return n;
		}else{
			return fn_factorial(n-1) * n;
		}
		 
	}

}
