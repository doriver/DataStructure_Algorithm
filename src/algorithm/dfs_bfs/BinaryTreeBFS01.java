package algorithm.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 이진트리에서 BFS 
 */
public class BinaryTreeBFS01 {
	
	TreeNode root;
	Queue<TreeNode> queue = new LinkedList<>();
	
	// 큐에서 꺼낸 노드(출력)의 인접(왼쪽,오른쪽) 큐에 추가
	void BFS() {
		if (root == null) return;
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			// 큐에서 노드 꺼내고 출력
			TreeNode node = queue.poll();
			System.out.print(node.value + " ");
			
			// 왼쪽 자식을 큐에 추가
			if (node.left != null) {
				queue.add(node.left);
			}

			// 오른쪽 자식을 큐에 추가
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		
	}
	
	public static void main(String[] args) {
		BinaryTreeBFS01 tree = new BinaryTreeBFS01();
		
		// 트리 구성
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		
		tree.BFS();
	}

}
