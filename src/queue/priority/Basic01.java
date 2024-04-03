package queue.priority;

import java.util.Collections;
import java.util.PriorityQueue;

public class Basic01 {

	public static void main(String[] args) {
		
		// 낮은 숫자가 우선순위가 높은 방식
		PriorityQueue<Integer> pqLow = new PriorityQueue<>();
		// 높은 숫자가 우선순위가 높은 방식
		PriorityQueue<Integer> pqHigh = new PriorityQueue<>(Collections.reverseOrder());

		// 요소 추가
		pqLow.offer(3);
		pqLow.offer(1);
		pqLow.offer(4);
		pqLow.offer(2);
		System.out.println("pqLow :" + pqLow); // [1, 2, 4, 3]
		
		// 우선순위에 따라 요소 출력
		while ( !pqLow.isEmpty() ) {
			System.out.println(pqLow.poll());
		} // 1 2 3 4
		
		
		pqHigh.offer(3);
		pqHigh.offer(1);
		pqHigh.offer(4);
		pqHigh.offer(2);
		System.out.println("pqHigh :" + pqHigh); // [4, 2, 3, 1]
		
		// 우선순위에 따라 요소 출력
		while ( !pqHigh.isEmpty() ) {
			System.out.println(pqHigh.poll());
		} // 4 3 2 1
		
	}

}
