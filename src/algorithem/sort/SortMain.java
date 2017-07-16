package algorithem.sort;

public class SortMain {

	public static void main(String[] args) {

		int[] items = {69, 10, 30, 2, 16, 8, 31, 22};
		
//		InsertionSort.doInsertionSort(items);
//		SelectionSort.doSelectionSort(items);
//		QuickSort.doQuickSort(items, 0, items.length-1);
//		BubbleSort.doBubbleSort(items);
		MergeSort.doMergeSort(items, items.length);

	}

	public static int[] swap(int[] items, int idx1, int idx2){
		int temp = items[idx1];
		items[idx1] = items[idx2];
		items[idx2] = temp;
		
		return items;
		
	}
}
