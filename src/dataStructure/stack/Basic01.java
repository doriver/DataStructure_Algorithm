package dataStructure.stack;

import java.util.Stack;

public class Basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		System.out.println(stack); // []
		// stack 공간 비어있는지 확인 isEmpty()
		System.out.println(stack.isEmpty()); // true
		
		
		// stack에 데이터 추가 push()
		stack.push("사과");
		stack.push("바나나");
		stack.push("체리");
		System.out.println(stack); // [사과, 바나나, 체리]
		System.out.println("    ====    ====   "); 
		
		// stack 요소 위치확인 search()
		// pop() 메서드를 호출했을 때 몇 번째 순서로 나오는지에 대한 인덱스를 반환( 인덱스가 0이 아닌 1부터 시작 )
		System.out.println(stack.search("사과")); // 3
		System.out.println(stack.search("체리")); // 1
		System.out.println(stack.search("22")); // -1(존재하지 않는경우)
		
		// stack 사이즈 size()
		System.out.println(stack.size()); // 3

		// 맨위의 요소 확인( 제거하는건 아님 ) peek()
		String topElement = stack.peek();
		System.out.println(stack + "  " + topElement); // [사과, 바나나, 체리]  체리
		
		// stack에서 데이터 제거( 가장 마지막에 넣은거를 제거함 ) pop()
		String poppedElement = stack.pop();
		System.out.println(stack + "  " + poppedElement); // [사과, 바나나]  체리
	}

}
