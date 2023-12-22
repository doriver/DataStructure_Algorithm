package stack;

import java.util.Stack;

public class Basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		
		// stack에 값넣기
		stack.push("사과");
		stack.push("바나나");
		stack.push("체리");
		System.out.println(stack); // [사과, 바나나, 체리]

		// 맨위의 요소 확인( 제거하는건 아님 )
		String topElement = stack.peek();
		System.out.println(stack + "  " + topElement); // [사과, 바나나, 체리]  체리
		
		// 요소 제거( 가장 마지막에 넣은거 )
		String poppedElement = stack.pop();
		System.out.println(stack + "  " + poppedElement); // [사과, 바나나]  체리
	}

}
