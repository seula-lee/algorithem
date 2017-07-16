package test;



public class Common {
	
	
	public static void main(String[] args){
		
		int[] items = {69, 10, 30, 2, 16, 8, 31, 22};
		
		BubbleSort.doBubbleSort(items);
	}
	
	public static void swap(int[] items, int i, int j){
		int tmp = items[i];
		items[i] = items[j];
		items[j] = tmp;
	}
}
