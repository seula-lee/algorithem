package algorithem.binary.tree;

import java.util.Arrays;

public class BinarySearchMain {

	// 자식노드 수가 최대 2개까지 존재하는 트리
	// 문제: 트리에 넣을 숫자를 입력받아 이진 탐색 트리를 만들어라! 
	
	// Hint : 숫자를 입력받아 왼쪽에는 작은 수, 오른쪽에는 큰수를 넣는다 
	// 이런 반복 특성은 재귀를 사용할수 있다.
	// 1. Root에 값이 없으면 Root에 값을 넣는다.
	// 2. Root에 값이 있으면, 입력된 값이 Root보다 크면 오른쪽, 작으면 왼쪽으로 넣는다.
	// 3. 값이 이미 있으면 입력된 값과 비교하여 2번을 반복하여 넣는다... 
	// 4. 반복.. 
	
	public static void main(String[] args) {
		
		int[] items = {24,15,19,2,28,27,30,5,8,60};
		
		BinarySearchTree tree = new BinarySearchTree();
		BinarySearch search = new BinarySearch();
		
		for(int i=0; i<items.length; i++){
			tree.addNode(items[i]);	
		}
		
		
		System.out.println("Original: "+ Arrays.toString(items));
		search.doBinarySearch(items, 15);

		System.out.print("PreOrder: ");
		tree.preOrder(tree.root);
		System.out.println("");
		System.out.print("InOrder: ");
		tree.inOrder(tree.root);
		System.out.println("");
		System.out.print("PostOrder: ");
		tree.postOrder(tree.root);
		
	}
}
