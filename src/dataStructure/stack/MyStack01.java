package dataStructure.stack;

public class MyStack01 {
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
	
	private Node01 top; // 스택의 맨 위 노드를 가리키는 포인터
	
	public MyStack01() {
		this.top = null;
	}
	
	// 스택 비어있는지 확인
	public boolean isEmpty() {
		return top == null;
	}
	
	// 스택에 데이터 추가
	public void push(int data) {
		Node01 newNode = new Node01(data);
		newNode.next = top;
		top = newNode;
	}
	
	// 데이터 제거및 반환
	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		int data = top.data;
		top = top.next;
		return data;
	}
	
	// 맨위 데이터 반환
	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return top.data;
	}
	
	// 스택 크기 반환
	public int size() {
		int size = 0;
		Node01 current = top;
		while (current != null) {
			size++;
			current = current.next;
		}
		return size;
	}
	
	// 스택 출력
	public void printStack() {
		Node01 current = top;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack01 stack = new MyStack01();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.printStack(); // 3 -> 2 -> 1 -> null
		
		System.out.println(stack.peek()); // 3
		stack.pop();
		
		stack.printStack(); // 2 -> 1 -> null
		
	}

}
