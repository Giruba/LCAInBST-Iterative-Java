package BinarySearchTree;

public class BinarySearchTree {
	private BinarySearchTreeNode root;
	
	public BinarySearchTree(BinarySearchTreeNode binarySearchTreeNode) {
		this.root = binarySearchTreeNode;
	}
	
	public void SetBinarySearchTreeRoot(BinarySearchTreeNode binarySearchTreeNode) {
		this.root = binarySearchTreeNode;
	}
	
	public BinarySearchTreeNode GetBinarySearchTreeRoot() {
		return this.root;
	}
	
	public BinarySearchTreeNode Insert(BinarySearchTreeNode binarySearchTreeNode, int data) {
		if(binarySearchTreeNode == null) {
			binarySearchTreeNode = new BinarySearchTreeNode(data);
			return binarySearchTreeNode;
		}
		
		if(binarySearchTreeNode.GetBinarySearchTreeNodeData() < data) {
			binarySearchTreeNode.SetBinarySearchTreeNodeRight(
					Insert(binarySearchTreeNode.GetBinarySearchTreeNodeRight(), data));
		}else {
			binarySearchTreeNode.SetBinarySearchTreeNodeLeft(
					Insert(binarySearchTreeNode.GetBinarySearchTreeNodeLeft(), data));
		}
		
		return binarySearchTreeNode;
	}
	
	public void PrintInorderTraversal() {
		System.out.println("----- Printing the Inorder Traversal of the Binary Search Tree -----");
		_PrintInorderTraversal(this.root);
	}
	
	private void _PrintInorderTraversal(BinarySearchTreeNode binarySearchTreeNode) {
		if(binarySearchTreeNode == null) {
			return;
		}
		_PrintInorderTraversal(binarySearchTreeNode.GetBinarySearchTreeNodeLeft());
		System.out.print(binarySearchTreeNode.GetBinarySearchTreeNodeData()+" ");
		_PrintInorderTraversal(binarySearchTreeNode.GetBinarySearchTreeNodeRight());
	}
	
	public void PrintLowestCommonAncestorInBinarySearchTree(int value1, int value2) {
		System.out.println();
		BinarySearchTreeNode lowestCommonAncestor = _PrintLowestCommonAncestorInBinarySearchTree(this.root, value1, value2);
		System.out.println("The lowest common ancestor of ("+value1+","+value2+") is "+lowestCommonAncestor.GetBinarySearchTreeNodeData());
	}
	
	private BinarySearchTreeNode _PrintLowestCommonAncestorInBinarySearchTree(BinarySearchTreeNode binarySearchTreeNode, int value1, int value2) {
		if(binarySearchTreeNode == null) {
			return null;
		}
		while(binarySearchTreeNode != null) {
			if(value1 < binarySearchTreeNode.GetBinarySearchTreeNodeData() && 
					value2 < binarySearchTreeNode.GetBinarySearchTreeNodeData()) {
				binarySearchTreeNode = binarySearchTreeNode.GetBinarySearchTreeNodeLeft();
			}else if(value1 > binarySearchTreeNode.GetBinarySearchTreeNodeData() && 
					value2 > binarySearchTreeNode.GetBinarySearchTreeNodeData()) {
				binarySearchTreeNode = binarySearchTreeNode.GetBinarySearchTreeNodeRight();
			}else {
				break;
			}
		}
		return binarySearchTreeNode;
	}
}
