package algorithem;

import java.util.*;

public class ReverseArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String[] items = {"ABC", "123", "가나다"};
		
		System.out.println("Original: "+ Arrays.toString(items));	
		
		System.out.println("Reverse : "+ Arrays.toString(fn_reverseArrayString(items)));
	}
	
	public static String[] fn_reverseArrayString(String[] n){
	
		// change to list
		List<String> list = Arrays.asList(n);
		
		// reverse 
		Collections.reverse(list);
		
		// change to array
		n = list.toArray(new String[list.size()]);

		return n;
	}
	
}
