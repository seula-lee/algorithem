package algorithem.binary.tree;

public class BinarySearchTree {
	public BinarySearchNode root;
	
	public void addNode(int value) {
		
		// Root가 없는경우 
		if(root == null){
			BinarySearchNode node = new BinarySearchNode();
			node.setValue(value);
			root = node;
		}
		// Root가 있는 경우 
		else{
			addNode(value, root);
		}
		
	}
	
	public void addNode(int value, BinarySearchNode root){
		if(value <= root.getValue()){
			if(root.getLeft() == null){
				BinarySearchNode node = new BinarySearchNode();
				node.setValue(value);
				root.setLeft(node);
			}else{
				addNode(value, root.getLeft());
			}
		}else{
			if(root.getRigth() == null){
				BinarySearchNode node = new BinarySearchNode();
				node.setValue(value);
				root.setRigth(node);
			}else{
				addNode(value, root.getRigth());
			}
		}
	}

	public void preOrder(BinarySearchNode root){
		
		if(root==null)	return;
		
		System.out.print(root.getValue()+" ");
		
		preOrder(root.getLeft());
		preOrder(root.getRigth());
	}
	
	public void inOrder(BinarySearchNode root){
		if(root == null) return;
		
		inOrder(root.getLeft());
		System.out.print(root.getValue()+" ");
		inOrder(root.getRigth());
		
	}
	
	public void postOrder(BinarySearchNode root){
		if(root == null) return;
		
		postOrder(root.getLeft());
		postOrder(root.getRigth());
		System.out.print(root.getValue()+" ");
		
	}
}
