package dataStructure.aaaHandling01;

import java.util.Arrays;

public class HdlArray01 {

	public static void main(String[] args) {

/**
 *	1. Array 삽입x, 삭제x
 *	배열은 삽입 삭제가 없음, 맨 처음부터 원소 개수가 정해져 있음
 */	
		int[] ai = new int[4];
		System.out.println(Arrays.toString(ai)); // [0, 0, 0, 0]
/**
 *	2. Array 원소개수
 */	 
		// 배열 원소개수(길이) , 4
		System.out.println(ai.length);

/**
 *	3. Array 접근, 수정
 */		
		for (int i = 0; i < ai.length; i++ ) {
			System.out.println(ai[i]);
		}
		// 수정? 접근해서 대체하는거
		for (int i = 0; i < ai.length; i++ ) {
			ai[i] = i+1;
		}
		
/**
 *	4. Array 검색 > 약간 어려울듯
 *	배열은 검색 모든 위치에 일일이 접근해서 확인해야하는듯? 
 *	정렬같은거 쓰면 쉽게 하려나?
 *	tree같은게 검색에 좋을듯
 *	알고리즘 활용될까?
 */		
		
	}

}
