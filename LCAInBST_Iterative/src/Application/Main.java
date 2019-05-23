package Application;

import java.util.Scanner;
import BinarySearchTree.BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		System.out.println("Lowest Common Ancestor in Binary Search Tree");
		System.out.println("---------------------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of elements in the Binary Search Tree");
			int sizeOfBinarySearchTree = scanner.nextInt();
			BinarySearchTree binarySearchTree = new BinarySearchTree(null);
			for(int index = 0; index < sizeOfBinarySearchTree; index++) {
				System.out.println("Enter the element "+(index+1));
				int value = scanner.nextInt();
				binarySearchTree.SetBinarySearchTreeRoot(binarySearchTree.Insert
						(binarySearchTree.GetBinarySearchTreeRoot(), value));				
			}
			binarySearchTree.PrintInorderTraversal();
			System.out.println("Enter the values whose lowest common ancestor has to be found!");
			System.out.println("Enter the value1");
			int value1 = scanner.nextInt();
			System.out.println("Enter the value2");
			int value2 = scanner.nextInt();
			binarySearchTree.PrintLowestCommonAncestorInBinarySearchTree(value1, value2);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getLocalizedMessage());
		}
		
	}
}
