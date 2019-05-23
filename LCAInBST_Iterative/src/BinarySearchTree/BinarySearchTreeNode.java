package BinarySearchTree;

public class BinarySearchTreeNode {
	private int data;
	private BinarySearchTreeNode leftNode;
	private BinarySearchTreeNode rightNode;
	
	public BinarySearchTreeNode(int data) {
		this.data = data;
	}
	
	public void SetBinarySearchTreeNodeData(int data) {
		this.data = data;
	}
	
	public void SetBinarySearchTreeNodeLeft(BinarySearchTreeNode leftNode) {
		this.leftNode = leftNode;
	}
	
	public void SetBinarySearchTreeNodeRight(BinarySearchTreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	public int GetBinarySearchTreeNodeData() {
		return this.data;
	}
	
	public BinarySearchTreeNode GetBinarySearchTreeNodeLeft() {
		return this.leftNode;
	}
	
	public BinarySearchTreeNode GetBinarySearchTreeNodeRight() {
		return this.rightNode;
	}
}
