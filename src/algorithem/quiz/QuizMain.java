package algorithem.quiz;

import java.util.HashMap;

public class QuizMain {


	public static int index = 30;
	public static int count = 0;
	public static double st=0, en=0;
	
	public static void main(String[] args) {			
		st = System.currentTimeMillis();
		System.out.println("Fibo "+index+" >> "+ FiboDynamicPrograming.doFibo(index));
		en = System.currentTimeMillis();
		System.out.println("수행시간 : "+ (en-st)+"ms");
		
		
		// 초기화
		count = 0;  
		st=0; en=0;
		
		// 중복 연산방지  
		HashMap<Integer, Integer> dp = new HashMap<Integer, Integer>();
	
		st = System.currentTimeMillis();
		System.out.println("FiboDP "+index+" >> "+ FiboDynamicPrograming.doFiboDP(index, dp));
		en = System.currentTimeMillis();
		System.out.println("수행시간 : "+ (en-st)+"ms");
			
	}

}
