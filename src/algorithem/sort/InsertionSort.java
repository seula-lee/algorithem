package algorithem.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] doInsertionSort(int[] items){
		// 1.순차적으로 비교 정렬 
		for(int i=0; i<items.length; i++){
			int standard = items[i];	// 기준 
			int aux = i-1;				// 비교할 대상 
				
			// 2. STANDART가 첫번째 원소가 아니고, 기준(aux)비교했을때 값이 작으면 swap 
			while(aux >= 0 && standard < items[aux]){
				
				items[aux+1]=items[aux];//비교대상이 큰경우 swap
				aux--;
			}
			
			 items[aux+1] = standard;	// 더이상 자기보다 큰 값이 없을 경우 삽입
			 System.out.println(i+" 번째 >> "+ Arrays.toString(items));
		}
		
		return items;
	}
	
	
}
