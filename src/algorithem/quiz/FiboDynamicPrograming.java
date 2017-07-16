package algorithem.quiz;

import java.util.HashMap;

public class FiboDynamicPrograming {
	// 재귀 : Top - Down 방식 !!  
		// 정합식 : fibo(n) = fibo(n-1) + fobo(n-2)
		public static int doFibo(int n){
			QuizMain.count++;
			
			if(n <= 1){
				return n;
			}else{
				return doFibo(n-1) + doFibo(n-2);  
			}
			
		}
		
		// DP : Bottom - Up 방식 !!
		public static int doFiboDP(int n, HashMap<Integer, Integer> dp){
			QuizMain.count++;
			
			// 이미 연산한 적이 있는경우, 이전 결과값을 꺼내 돌려준다.
			if(dp.containsKey(n)){
				return dp.get(n);
			}else if(n<=1){
				return n;
			}else{
				int v = doFiboDP(n-1, dp) + doFiboDP(n-2, dp);
				dp.put(n, v);
				return v;
			}
		}
}
