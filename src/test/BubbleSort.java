package test;

import java.util.Arrays;

//인접원소 비교 후 swap
public class BubbleSort {
	/**
	 * Pseudo code 
	 * 
	 * Method doBubbleSrot(items by int arrary){
	 * 
	 * 
	 * 
	 */
	public static void doBubbleSort(int[] items){
		System.out.println("INPUT >> "+ Arrays.toString(items));
		for(int i=0; i < items.length; i++){
			for(int j=0; j < items.length-1; j++){
				if(items[j] > items[j+1]){
					Common.swap(items, j, j+1);
				}
			}
			
			System.out.println(i+"번째 >> "+ Arrays.toString(items));
		}
	}
	
}
