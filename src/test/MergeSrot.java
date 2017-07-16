package test;

import java.util.Arrays;

public class MergeSrot {
	
	public static void main(String[] args){
		
		int[] items = {69, 10, 30, 2, 16, 8, 31, 22};
		
		doMergeSort(items, items.length);
	}

	public static int[] doMergeSort(int[] items, int length){
	
		int center = length/2;
		int[] lNums = new int[center];
		int[] rNums = new int[length-center];
		

		if(length == 1) return items;
		
		for(int i=0; i<center; i++) 		lNums[i] = items[i];
		for(int i=0; i<length-center; i++) 	rNums[i] = items[center+i]; 
		
		doMergeSort(lNums, lNums.length);
		doMergeSort(rNums, rNums.length);
		
		merge(lNums, rNums, items);

		return items;
	}
	
	public static void merge(int[] lNums, int[]rNums, int[] items){
		int left=0, right=0, merge=0;
		
		
		System.out.println("INPUT >>"+Arrays.toString(items));
		System.out.println("LEFT  >>"+Arrays.toString(lNums));
		System.out.println("RIGTH >>"+Arrays.toString(rNums));
		
		while(lNums.length != left && rNums.length != right){
			if(lNums[left] < rNums[right]){
				items[merge] = lNums[left];
				merge++; left++;
			}else{
				items[merge] = rNums[right];
				merge++; right++;				
			}
		}
		
		while(lNums.length != left){
			items[merge] = lNums[left];
			merge++; left++;			
		}
		
		while(rNums.length != right){
			items[merge] = rNums[right];
			merge++; right++;				
			
		}		
		
		System.out.println("");
		System.out.println("RESULT >> "+Arrays.toString(items));
		System.out.println("");
	}
}
