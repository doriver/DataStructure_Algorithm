package dataStructure.aaaHandling01;

import java.util.HashMap;
import java.util.Map;

public class HdlHashMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *	1. HashMap 삽입
		 */
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("사과", 10);
		hashMap.put("바나나", 5);
		hashMap.put("체리", 8);
		hashMap.put("토마토", 18);
		System.out.println(hashMap); // {체리=8, 토마토=18, 사과=10, 바나나=5}

		/**
		 *	2. HashMap 삭제
		 */	
		hashMap.remove("체리");

		/**
		 *	3. HashMap 접근, 수정
		 */
		for (String key : hashMap.keySet()) {
			System.out.println(hashMap.get(key)); // 18 , 10 , 5
		}
		hashMap.put("사과", 15);
		System.out.println(hashMap); // {토마토=18, 사과=15, 바나나=5}

		/**
		 *	4. HashMap 검색
		 *	존재여부
		 */
		System.out.println(hashMap.containsKey("토마토")); // true
		System.out.println(hashMap.containsValue(15)); // true
	}

}
