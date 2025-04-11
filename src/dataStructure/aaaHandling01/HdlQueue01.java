package dataStructure.aaaHandling01;

import java.util.LinkedList;
import java.util.Queue;

public class HdlQueue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 *	1. Queue 삽입
 */
		Queue<String> queue = new LinkedList<>();
		queue.offer("사과");
		queue.offer("바나나");
		queue.offer("체리");
		System.out.println(queue); // [사과, 바나나, 체리]
		
/**
 *	2. Queue 삭제
 */	
		System.out.println(queue.poll()); // 사과
		System.out.println(queue.poll()); // 바나나
		System.out.println(queue); // [체리]

/**
 *	3. Queue 접근, 수정
 */

/**
 *	4. Queue 검색
 */

	}

}
