package algorithm.dfs.recursion;
/**
 * 재귀(Recursion)는 함수가 자기 자신을 호출하는 프로그래밍 기법
 * 재귀 함수는 보통 기본 조건(base case)과 재귀 조건(recursive case)으로 구성
 * 
 * 기본 조건: 재귀 호출을 멈추는 조건
 * 재귀 조건: 함수가 자기 자신을 호출하는 조건
 * 
 */
public class RecursionEx01 {
/*	n! = n * (n-1) * ... * 2 * 1 
 * n! = n * (n-1)!
 */
	public static int factorial(int n) {
		// 기본조건 : 재귀 호출을 멈추는 조건
		if (n == 0 || n == 1) {
			return 1;
		}
		
		// 재귀 조건: 함수가 자기 자신을 호출하는 조건
		return n * factorial(n-1);
	}
	// factorial(5) = 5 * factorial(4)
	// factorial(5) = 5 * 4 * factorial(3)
	// factorial(5) = 5 * 4 * 3 * factorial(2)	
	// factorial(5) = 5 * 4 * 3 * 2 * factorial(1)	
	// factorial(5) = 5 * 4 * 3 * 2 * 1	
	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5)); // 5! = 120
		
	}

}
