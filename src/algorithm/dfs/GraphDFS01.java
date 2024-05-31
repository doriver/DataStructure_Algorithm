package algorithm.dfs;

import java.util.LinkedList;

/**
 * DFS(깊이 우선 탐색, Depth-First Search)
 * 
 * 방향 그래프(Directed Graph)를 표현한 것
 * 재귀(Recursion) 이용, 그래프를 인접 리스트로 표현
 * 
 * dataStructure.graph.MyGraph01 에서 구현했던 그래프는 간선추가할때 정점2개에 각각 추가해줬는데, 여기선 정점 하나에만 추가해줌
 */
public class GraphDFS01 {
	
	private int numVertices; // 정점의 수
	private LinkedList<Integer>[] adjLists; // 각 정점의 인접 리스트를 저장
	private boolean[] visited; // 각 정점의 방문 여부
	
	GraphDFS01(int vertices) {
		numVertices = vertices;
		adjLists = new LinkedList[vertices];
		visited = new boolean[vertices];
		
		for (int i = 0; i < vertices; i++) {
			adjLists[i] = new LinkedList<>();
		}
	}
	
	void addEdge(int src, int dest) {
		adjLists[src].add(dest);
	}
	
	// 그래프 출력
	public void printGraph() {
		for (int i = 0; i < numVertices; i++) {
			System.out.println("Vertex " + i );
			for (Integer vertex : adjLists[i]) {
				System.out.println(" -> " + vertex);
			}
		}
	}
	// 해당 점 방문하고 , 인접 리스트의 원소들에 대해서 방문하지 않았을때 각각 똑같은 DFS를 시현 
	void DFS(int vertex) {
		visited[vertex] = true;
		System.out.print(vertex + " ");
		
		for (int adj: adjLists[vertex]) {
			if (!visited[adj]) {
				DFS(adj);
			}
		}
	}

	public static void main(String[] args) {
		GraphDFS01 graph = new GraphDFS01(10);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		graph.addEdge(1, 7);
		graph.addEdge(2, 5);
		graph.addEdge(3, 6);
		graph.addEdge(4, 8);
		graph.addEdge(5, 9);
		
		
		graph.printGraph();
		graph.DFS(0);
	}

}
