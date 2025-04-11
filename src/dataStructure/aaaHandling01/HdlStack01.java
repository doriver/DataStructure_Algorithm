package dataStructure.aaaHandling01;

import java.util.Stack;

public class HdlStack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 *	1. Stack 삽입
 */
		Stack<String> stack = new Stack<>();
		
		stack.push("사과");
		stack.push("바나나");
		stack.push("체리");
		System.out.println(stack); // [사과, 바나나, 체리]
		
/**
 *	2. Stack 삭제
 */	
		System.out.println(stack.pop()); // 체리
		System.out.println(stack.pop()); // 바나나
		System.out.println(stack); // [사과]
/**
 *	3. Stack 접근, 수정
 */

/**
 *	4. Stack 검색
 */

	}

}
