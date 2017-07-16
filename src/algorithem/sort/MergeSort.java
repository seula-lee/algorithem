package algorithem.sort;

import java.util.Arrays;


public class MergeSort {

	public static int idx=0;
	
	public static int[] doMergeSort(int[] items, int length){
		
		int center = length/2;
		int[] lItems = new int[center];
		int[] rItems = new int[length-center];
		
		if(length == 1) return items;
		
		for(int i=0; i<center; i++) 		lItems[i] = items[i];
		for(int i=0; i<length-center; i++) 	rItems[i] = items[center+i];

		
		doMergeSort(lItems, lItems.length);
		doMergeSort(rItems, rItems.length);
		
		merge(items, lItems, rItems);		
		return items;
	}

	
	public static void merge(int[] items, int[] lItems, int[] rItems){
		int left = 0;
		int right = 0;
		int merge = 0;
		
		System.out.println(++idx + "번째 >> ");
		System.out.println("INPUT >>"+Arrays.toString(items));
		
		// left 부터 center까지와 center와 right 까지 비교
		System.out.println("LEFT  >>"+Arrays.toString(lItems));
		System.out.println("RIGTH >>"+Arrays.toString(rItems));
		
		while(lItems.length != left && rItems.length != right){
			// left index가 right index보다 작으면 left값을 result에 복사 
			if(lItems[left] < rItems[right]){
				items[merge] = lItems[left];
				merge++; left++;
			
			//아닌경우 right index값을 result에 복
			}else{
				items[merge] = rItems[right];
				merge++; right++;
			}
//			System.out.println(Arrays.toString(items));
		}
		
		//right 블록 값이 모두 처리된 후 left 값이 남은 경우
		while(lItems.length != left){
			items[merge] = lItems[left];
			merge++; left++;			
//			System.out.println("LEFT 블록 나머지처리 "+Arrays.toString(lItems));
//			System.out.println(Arrays.toString(items));
		}
		
		// left 블록 값이 모두 처리된 후 right 값이 남은 경우
		while(rItems.length != right){
			items[merge] = rItems[right];
			merge++; right++;
//			System.out.println("RIGHT 블록 나머지처리 "+Arrays.toString(rItems));
//			System.out.println(Arrays.toString(items));
		}
		
		System.out.println("RESULT >> "+Arrays.toString(items));
		System.out.println("");
	}
}
		
