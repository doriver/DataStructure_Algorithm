package dataStructure.aaaNote;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<>();
		st.push("사과");
		st.push("바나나");
		st.push("배");
		System.out.println(st); // [사과, 바나나, 배]
		System.out.println(st.peek()); // 배
		
		int ss = st.size()-1;
		for (int i=0; i < ss; i++) {
			st.pop();
		}
		System.out.println(st); // [사과]
		
		
		Queue<String> qu = new LinkedList<>();
		qu.offer("apple");
		qu.offer("banana");
		qu.offer("cherry");
		System.out.println(qu); // [apple, banana, cherry]
		System.out.println(qu.peek()); // apple
		
		for (int i=0; i<2; i++) {
			qu.poll();
		}
		System.out.println(qu); // [cherry]
		
	}

}
