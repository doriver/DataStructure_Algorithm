package algorithm.dfs;

import java.util.LinkedList;
/**
 * 방향그래프(Directed Graph)에서 Queue를 이용한 BFS(너비 우선 탐색) 구현
 */
public class GraphBFS01 {
	
	private int numVertices; // 노드 수
	private LinkedList<Integer>[] adjList; // 인접 리스트
	
	private boolean[] visited; // 방문한 노드 기록
	LinkedList<Integer> queue = new LinkedList<>(); // BFS위한 큐

	GraphBFS01(int numVertices) {
		this.numVertices = numVertices;
		adjList = new LinkedList[numVertices];
		
		for (int i = 0; i < numVertices; i++ ) {
			adjList[i] = new LinkedList();
		}
		
		visited = new boolean[numVertices];
	}
	
	void addEdge(int v, int w) {
		adjList[v].add(w);
	}
	
	// 어려움
	void BFS(int startVertex) {
		int polledVertex;
		
		// 시작노드 방문하고 큐에 추가
		visited[startVertex] = true;
		queue.add(startVertex);
		
		/*
		 * BFS의 본질은 큐를 사용하여 각 레벨을 순차적으로 방문
		 */
		// 큐에서 꺼낸(+출력)거의 인접방문(+큐에 추가)
		while (queue.size() != 0) {
			// 큐에서 노드 꺼내기 + 출력
			polledVertex = queue.poll();
			System.out.print(polledVertex + " ");
			
			// 인접노드들 방문 + 큐에 추가
			for (int nextVertex : adjList[polledVertex]) {
				if (!visited[nextVertex]) {
					visited[nextVertex] = true;
					queue.add(nextVertex);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		GraphBFS01 graph = new GraphBFS01(10);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		graph.addEdge(1, 7);
		graph.addEdge(2, 5);
		graph.addEdge(3, 6);
		graph.addEdge(4, 8);
		graph.addEdge(5, 9);
		
		graph.BFS(0);

	}

}
