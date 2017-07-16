package algorithem.sort;

import java.util.Arrays;

public class BubbleSort {
	// 인접 원소끼리 비교하여 정렬 
	public static int[] doBubbleSort(int[] items){
		for(int i = items.length -1; i > 0; i--){
			System.out.println(i+"번째 =========");
			System.out.println(Arrays.toString(items));
			for(int j=0; j < i; j++){
				if(items[j] > items[j+1]){
					SortMain.swap(items, j, j+1);
					System.out.println(Arrays.toString(items));
				}
				
			}
		}
		return items;
	}
}
