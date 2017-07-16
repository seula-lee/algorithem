package algorithem.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] doSelectionSort(int[] items){
	
		int idxMin;

		for(int i=0; i<items.length-1; i++){
			idxMin = i;
			for(int j=i+1; j<items.length; j++){
				if(items[idxMin] > items[j]){
					idxMin = j;
				}	
			}
			SortMain.swap(items, idxMin, i);
			System.out.println(i+"번째 >> "+ Arrays.toString(items));
		}
		
		
		return items;
		
	}
	
}
