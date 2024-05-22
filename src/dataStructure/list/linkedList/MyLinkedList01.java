package dataStructure.list.linkedList;

public class MyLinkedList01 {
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

	private Node01 head; // 리스트의 첫번째 노드를 가리키는 포인터
	
	// 리스트 끝에 새 노드 추가
	public void append(int data) {
		if (head == null) {
			head = new Node01(data);
			return;
		}
		
		Node01 current = head;
		// current를 계속 next값으로 해줌( current.next == null 일때까지 )
		while (current.next != null) {  
			current = current.next;
		}
		current.next = new Node01(data); // current.next == null 인 상태에서 Node를 넣어줌
	}
	
	// 리스트의 처음에 새 노드 추가
	public void prepend(int data) {
		Node01 newHead = new Node01(data);
		newHead.next = head;
		head = newHead;
	}
	
	// 리스트의 크기 반환
	public int size() {
		int size = 0;
		Node01 current = head;
		
		// current를 계속 next값으로 해줌( current.next == null 일때까지 )
		while (current != null) {
			size++;
			current = current.next;
		}
		return size;
	}
	
	// 특정 인덱스에 있는 노드 반환
	public Node01 get(int index) {
		if (index < 0 || index >= size() ) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		Node01 current = head;
		// index에 해당하는 노드까지 이동
		for (int i =0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	
	// 특정 인덱스에 있는 노드 삭제
	public void deleteAtIndex(int index) {
		if (index < 0 || index >= size() ) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		if (index == 0) {
			head = head.next;
			return;
		}
		
		Node01 current = head;
		for (int i = 0; i < index -1; i++) {
			current = current.next;
		}
		
		current.next = current.next.next;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
