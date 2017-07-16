package algorithem.binary.tree;

import java.util.Arrays;

public class BinarySearch {

	public void doBinarySearch(int num[], int find){
		if(num.length == 1) return;
		
		int start = 0; 
		int end = num.length-1;
		
		boolean check = true;
		
		while(check && start <= end){
			int center = (start+end) /2;
			
			if(num[center] == find){
				System.out.println(find+"는 "+(center+1) + "번째자리 ");
				check = false;
			}else if(num[center] > find){
				end = center--;
			}else{
				start = center++;
			}
		}
	}
}
