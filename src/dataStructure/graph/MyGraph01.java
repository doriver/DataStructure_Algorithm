package dataStructure.graph;

import java.util.LinkedList;
import java.util.List;

/**
 * 방향성이 없는 무방향 그래프, 인접 리스트를 사용하여 구현
 */
public class MyGraph01 {

	private int numVertices; // 그래프의 정점수
	private List<List<Integer>> adjLists; // 각 정점의 인접리스트를 저장하는 리스트
	
	 // 생성자: 정점의 수를 받아 초기화
	public MyGraph01(int numVertices) {
		this.numVertices = numVertices;
		adjLists = new LinkedList<>();
		
		// 각 정점에 대한 인접 리스트를 초기화
		for (int i=0; i< numVertices; i++) {
			adjLists.add(new LinkedList<>());
		}
	}
	
	// 두 정점사이 간선 추가(무방향)
	public void addEdge(int src, int dest) {
		adjLists.get(src).add(dest);
		adjLists.get(dest).add(src);
	}
	
	// 그래프의 각 정점과 그 정점에 인접한 정점들을 출력
	public void printGraph() {
		for (int i = 0; i < numVertices; i++) {
			System.out.println("Vertex " + i );
			for (Integer vertex : adjLists.get(i)) {
				System.out.println(" -> " + vertex);
			}
		}
	}
	
	public static void main(String[] args) {
		// 정점 5개인 그래프
		MyGraph01 graph = new MyGraph01(5);
		
		// 간선 추가
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		
		// 그래프 출력
		graph.printGraph();
	}

}
