package dataStructure.queue;

public class MyQueue01 {
	// 노드 클래스
	public class Node01 {
		int data; // 노드가 저장하는 데이터
		Node01 next; // 다음 노드를 가리키는 포인터
		
		// 생성자
		public Node01(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node01 front; // 큐의 첫번째 노드 가리키는 포인터
	private Node01 rear; // 큐의 마지막 노드 가리키는 포인터
	private int size; // 큐의 크기
	
	public MyQueue01() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
	// 큐가 비었는지 확인
	public boolean isEmpty() {
		return front == null;
	}
	
	// 큐에 데이터 추가
	public void enqueue(int data) {
		Node01 newNode = new Node01(data);
		if (rear != null) {
			rear.next = newNode;
		}
		rear = newNode;
		if (front == null) {
			front = newNode;
		}
		size++;
	}
	
	// 큐에서 데이터 제거 및 반환
	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		int data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		return data;
	}
	
	// 맨 앞 데이터 반환
	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return front.data;
	}
	
	// 큐 출력
	public void printQueue() {
		Node01 current = front;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue01 queue = new MyQueue01();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		queue.printQueue(); // 1 -> 2 -> 3 -> null
		System.out.println(queue.peek()); // 1
		queue.dequeue();
		
		queue.printQueue(); // 2 -> 3 -> null
		
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.isEmpty()); // true
	}

}
