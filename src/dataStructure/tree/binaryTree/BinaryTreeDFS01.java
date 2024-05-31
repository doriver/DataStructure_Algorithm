package dataStructure.tree.binaryTree;
/**
 * DFS를 사용해, 이진 트리를 구현 
 */

class TreeNode {
	int value; // 노드값 저장
	TreeNode left, right; // 왼쪽 자식과 오른쪽 자식
	
	public TreeNode(int item) {
		value = item;
		left = right = null;
	}
}

public class BinaryTreeDFS01 {

	TreeNode root; // 루트 노드
	
	BinaryTreeDFS01() {
		root = null;
	}
	
	// DFS를 사용한 전위 순회(Preorder Traversal)
	void DFS(TreeNode node) {
		if (node == null) return;
		
		// 현재 노드값 출력
		System.out.print(node.value + " ");
		
		// 왼쪽 자식을 재귀적으로 탐색
		DFS(node.left);
		
		// 오른쪽 자식을 재귀적으로 탐색
		DFS(node.right);
	}
	
	public static void main(String[] args) {
		BinaryTreeDFS01 bTree = new BinaryTreeDFS01();

		// 트리 노드 추가
		bTree.root = new TreeNode(1);
		bTree.root.left = new TreeNode(2);
		bTree.root.right = new TreeNode(3);

		bTree.root.left.left = new TreeNode(4);
		bTree.root.left.right = new TreeNode(5);
		
		// 트리를 전위 순회하면서 탐색
		bTree.DFS(bTree.root);
	}

}
