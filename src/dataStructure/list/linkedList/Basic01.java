package dataStructure.list.linkedList;

import java.util.AbstractSequentialList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// public interface List<E> extends Collection<E> { ~ }
// public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable { ~ }
public class Basic01 {
	public static void main(String[] args) {
		
		List<String> aa = Arrays.asList("a","b","c");
//		Parameters: a the array by which the list will be backed
//		Returns: a list view of the specified array
		System.out.println(aa); // [a, b, c]
		
System.out.println("   ======    1. 요소 추가/삽입    ======  ");
/**
 *	1. LinkedList 요소 추가/삽입
 *	맨앞, 맨뒤, 지정된 위치에 추가 가능
 *	추가될 노드 위치의 바로 앞뒤쪽에 있는 노드의 참조를 변경
 */	
		LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A","B","C"));
		System.out.println(linkedList); // [A, B, C]
		// addFirst() 와 addLast() 는 요소를 첫번째, 마지막에 추가하는 것이기 때문에 O(1) 의 시간이 걸린다.
		linkedList.addFirst("first");
		linkedList.addLast("last");
		// 중간 삽입일 경우, 중간에 삽입할 위치까지의 탐색을 필요하기 때문에 O(N)의 시간이 걸린다.
		linkedList.add(1, "new");
		System.out.println(linkedList); // [first, new, A, B, C, last]
		
		
		List<String> list = new LinkedList<>();
		
		System.out.println(list); // []
		
		// linkedList에 값 넣기
		list.add("사과");
		list.add("귤");
		System.out.println(list); // [사과, 귤]
		list.add("토마토");
		System.out.println(list); // [사과, 귤, 토마토]
		
		// 특정 위치에 값 추가
		list.add(1, "포도");
		System.out.println(list); // [사과, 포도, 귤, 토마토]
		
		// 요소 순회
		for (String fruit : list) {
			System.out.println(fruit); // 포도, 귤, 토마토
		}
		
System.out.println("   ======    2. 요소 삭제    ======  ");
/**
 *	2. LinkedList 요소 삭제
 *	맨앞, 맨뒤, 지정된 위치 다 가능
 *	바로 앞뒤쪽에 있는 노드의 참조를 변경
 */	
		// 중간에는 탐색시간이 필요하기에 O(N)이 걸린다
		linkedList.remove(1);
		// 첫번째, 마지막에는 O(1)의 시간이 걸린다
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList); // [A, B, C]
		
		// 특정 위치의 요소 제거
		String removedString = list.remove(0);
		System.out.println(list + "  " + removedString); // [포도, 귤, 토마토]  사과
		list.clear();
		System.out.println(list); // []
		
System.out.println("   ======    3. 요소 검색    ======  ");
/**
 *	3. LinkedList 요소 검색
 *	요소 자체가 리스트에 있는지 검사, 어디있는지 인덱스 위치 반환
 */			
		// 저장된 개수
		System.out.println(linkedList.size()); // 3
		System.out.println(list.size()); // 0
		// 앞에서 부터 찾아가, 위치반환
		System.out.println(linkedList.indexOf("B")); // 1
		// 뒤에서부터 역방향으로 찾아감
		System.out.println(linkedList.lastIndexOf("D")); // -1( 찾고자 하는 값이 없을때 )
		// 요소가 있는지 확인
		System.out.println(linkedList.contains("D")); // false
		System.out.println(linkedList.contains("A")); // true
		// 모든 노드가 포함되있는지 확인
		System.out.println(linkedList.containsAll(new LinkedList<>(Arrays.asList("B","A")))); // true
		
System.out.println("   ======    4. 요소 얻기,변경    ======  ");
/**
 *	4. LinkedList 요소 얻기,변경
 *	10번째 노드를 확인하기 위해서는 첫 번째 노드부터 10번째 노드까지 참조를 따라서 일일히 이동해야 하기 때문에 
 *	탐색 성능은 좋지 않은 편이다.
 */	
		System.out.println(linkedList.get(0)); // A
		System.out.println(linkedList.get(1)); // B
		
		linkedList.set(1, "변경");
		System.out.println(linkedList); // [A, 변경, C]

	}
}
