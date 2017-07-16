package algorithem.binary.tree;

public class BinarySearchNode {
	private int value;
	private BinarySearchNode left;
	private BinarySearchNode rigth;
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public BinarySearchNode getLeft() {
		return left;
	}
	
	public void setLeft(BinarySearchNode left) {
		this.left = left;
	}
	
	public BinarySearchNode getRigth() {
		return rigth;
	}
	
	public void setRigth(BinarySearchNode rigth) {
		this.rigth = rigth;
	}
		
}
