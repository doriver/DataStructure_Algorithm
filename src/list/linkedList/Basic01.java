package list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Basic01 {
	public static void main(String[] args) {

/**
 *	1.
 */	
		List<String> linkedList = new LinkedList<>();
		
		System.out.println(linkedList); // []
		
		// linkedList에 값 넣기
		linkedList.add("사과");
		linkedList.add("귤");
		linkedList.add("토마토");
		System.out.println(linkedList); // [사과, 귤, 토마토]
		
		// 특정 위치에 값 추가
		linkedList.add(1, "포도");
		System.out.println(linkedList); // [사과, 포도, 귤, 토마토]
		
		// 특정 위치의 요소 제거
		String removedString = linkedList.remove(0);
		System.out.println(linkedList + "  " + removedString); // [포도, 귤, 토마토]  사과
		
		// 요소 순회
		for (String fruit : linkedList) {
			System.out.println(fruit); // 포도, 귤, 토마토
		}
		
		
		
	}
}
