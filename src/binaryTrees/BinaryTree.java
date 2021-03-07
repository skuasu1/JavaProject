package binaryTrees;

/*
 *Code to get Root to leaf path sum equal to a given number
 */

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

class BinaryTree {

	Node root;

	boolean hasPathSum(Node node, int sum) {
		if (node == null)
			return sum == 0;
		return hasPathSum(node.left, sum - node.data) || hasPathSum(node.right, sum - node.data);
	}

// Driver Code
	public static void main(String args[]) {
		int sum = 14;

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);

		if (tree.hasPathSum(tree.root, sum))
			System.out.println("There is a root to leaf path with sum " + sum);
		else
			System.out.println("There is no root to leaf path with sum " + sum);
	}
}