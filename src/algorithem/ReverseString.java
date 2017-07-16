package algorithem;

public class ReverseString {

	public static void main(String[] args) {

		String s = "가나다라 ABCD 1234";
		
		// reverse StringBuffer
		System.out.println("string reverse: " + fn_reverseString(s));		
		
	}

	public static String fn_reverseString(String s){
		return (new StringBuffer(s).reverse().toString());
	}
}


