package dataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basic01 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>(); // Queue는 인터페이스임, LinkedList로 생성
		
		// 데이터 추가 offer()
		queue.offer("사과");
		queue.offer("바나나");
		queue.offer("체리");
		System.out.println(queue); // [사과, 바나나, 체리]
		
		// 맨 앞의 요소 확인( 제거하지 않음 ) , peek()
		String frontElement = queue.peek();
		System.out.println(queue + "  " + frontElement); // [사과, 바나나, 체리]  사과
		
		// 요소 제거( 가장 처음 넣은거 ) , poll()
		String removedElement = queue.poll();
		System.out.println(queue + "  " + frontElement); // [바나나, 체리]  사과
	}

}
