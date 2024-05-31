package algorithm.dfs_bfs;

import java.util.LinkedList;
import java.util.Stack;
/**
 * 방향그래프(Directed Graph)에서 Stack을 이용해 DFS 
 */
public class GraphDFS02 {
	private int numVertices;
	private LinkedList<Integer>[] adjList;
	private boolean[] visited;
	Stack<Integer> stack = new Stack();
	
	GraphDFS02(int numVertices) {
		this.numVertices = numVertices;
		adjList = new LinkedList[numVertices];
		for (int i = 0; i < numVertices; ++i) {
			adjList[i] = new LinkedList();
		}
		
		visited = new boolean[numVertices];
	}
	
	void addEdge(int v, int w) {
		adjList[v].add(w);
	}
	
	void DFS(int startVertex) {
		
		stack.push(startVertex);
		// 스택에서 꺼낸 노드( 출력 + 방문 )의 인접 노드들을 스택에 추가
		while (!stack.isEmpty()) {
			int currentVertex = stack.pop();
			
			if (!visited[currentVertex]) {
				System.out.print(currentVertex + " ");
				visited[currentVertex] = true;
			}
			
			// 인접 노드들을 스택에 추가
            for (int nextVertex : adjList[currentVertex]) {
                if (!visited[nextVertex]) {
                    stack.push(nextVertex);
                }
            }
		}
	}
	
	public static void main(String[] args) {
		GraphDFS02 graph = new GraphDFS02(10);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		graph.addEdge(1, 7);
		graph.addEdge(2, 5);
		graph.addEdge(3, 6);
		graph.addEdge(4, 8);
		graph.addEdge(5, 9);
		
		graph.DFS(0);
	}

}
