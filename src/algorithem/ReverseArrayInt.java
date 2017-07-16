package algorithem;

import java.util.Arrays;

public class ReverseArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] items={10,20,22,45,66,90};
		
		System.out.println("Before: "+ Arrays.toString(items));
		System.out.println("After: "+ Arrays.toString(fn_reverseArrayInt(items)));
		
	}
	
	public static int[] fn_reverseArrayInt(int[] n){
		int fst = 0; 
		int lst = n.length-1;

		while(fst<lst){
			int temp 	= n[fst];
				n[fst]  = n[lst];
				n[lst]  = temp;
							
				fst++;
				lst--;
		}
		
		return n;
	}

}
