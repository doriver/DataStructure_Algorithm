package dataStructure.aaaHandling01;

import java.util.LinkedList;
import java.util.List;

public class HdlLinkedList01 {

	public static void main(String[] args) {
		
/**
 *	1. LinkedList 삽입
 *	맨앞, 맨뒤, 지정된 위치에 추가 가능
 *	추가될 노드 위치의 바로 앞뒤쪽에 있는 노드의 참조를 변경
 */	
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		System.out.println(linkedList); // [a, b, c]
		
		linkedList.addFirst("first");
		linkedList.addLast("last");
		linkedList.add(1, "new");
		System.out.println(linkedList); // [first, new, a, b, c, last]
/**
 *	2. LinkedList 삭제
 *	맨앞, 맨뒤, 지정된 위치 다 가능
 *	바로 앞뒤쪽에 있는 노드의 참조를 변경
 */	
		linkedList.remove(1);
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList); // [a, b, c]
		
/**
 *	3. LinkedList 접근, 수정
 *
 */
		for (int i = 0; i <3; i++) {
			System.out.println(linkedList.get(i)); // a, b, c
		}
		linkedList.set(1, "changed");
		System.out.println(linkedList.get(1)); // changed
		
/**
 *	4. LinkedList 검색
 *	요소 자체가 리스트에 있는지 검사, 어디있는지 인덱스 위치 반환
 */	
		// 앞에서 부터 찾아가, 위치반환
		System.out.println(linkedList.indexOf("c")); // 2
		// 뒤에서부터 역방향으로 찾아감
		System.out.println(linkedList.lastIndexOf("b")); // -1
		
		// 요소가 있는지 확인
		System.out.println(linkedList.contains("b")); // false
		System.out.println(linkedList.contains("c")); // true
		
/**
 *	5. LinkedList 원소 개수
 */			
		System.out.println(linkedList.size()); // 3
		
	}	
}
