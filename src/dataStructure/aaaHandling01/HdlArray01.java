package dataStructure.aaaHandling01;

import java.util.Arrays;

public class HdlArray01 {

	public static void main(String[] args) {
		
		int[] ai = new int[4];
		System.out.println(Arrays.toString(ai)); // [0, 0, 0, 0]
		// 배열은 삽입 삭제가 없나? 맨 처음부터 원소 개수가 정해져 있음
		
		// 배열 원소개수(길이) , 4
		System.out.println(ai.length);
		
		// 수정? 접근해서 대체하는거
		for (int i = 0; i < ai.length; i++ ) {
			ai[i] = i+1;
		}
		
		// 접근? 조회?
		for (int i = 0; i < ai.length; i++ ) {
			System.out.println(ai[i]);
		}
		
	}

}
