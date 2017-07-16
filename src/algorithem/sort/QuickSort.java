package algorithem.sort;

import java.util.Arrays;

// Pivot
// 분할정복, 기준 pivot보다 작은경우 왼쪽으로 정렬, 큰경우 오른쪽으로 정렬 
public class QuickSort {

	public static int idx=0;
	
	public static int[] doQuickSort(int[] items, int left, int right){
		if(left < right){
			int nPivot = partition(items, left, right);
			
		
			doQuickSort(items, left, nPivot-1);
			doQuickSort(items, nPivot+1, right);
		}
		
		return items;
	}
	
	public static int partition(int[] items, int left, int right){
		
		int pivot = (left+right) / 2;
		
		System.out.println(++idx + "번째 =========");
		
		while(left < right){
			System.out.println(" PROCESS  >>" +Arrays.toString(items));
			while(items[left] < items[pivot] && left < right) left++;
			while(items[right] >= items[pivot] && left < right) right--;
			
			if(left < right) 
				SortMain.swap(items, left, right);

		}
		
		System.out.println(" RESULT   >>"+ Arrays.toString(items));
		SortMain.swap(items, pivot, right);
		
		return left;
	}
	
}