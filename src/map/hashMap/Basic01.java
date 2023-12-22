package map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hashMap = new HashMap<>();
		
		// key-value 쌍 추가( key를 기반으로 값을 검색, 저장)
		hashMap.put("사과", 10);
		hashMap.put("바나나", 5);
		hashMap.put("체리", 8);
		System.out.println(hashMap); // {체리=8, 사과=10, 바나나=5}
		
		// 특정 키의 값 조회
		System.out.println(hashMap.get("사과")); // 10
		System.out.println(hashMap.get("ㄱㄱ")); // null
		
		// 특정 키 존재여부 확인
		System.out.println(hashMap.containsKey("체리")); // true
		System.out.println(hashMap.containsKey("ㄱㄱ")); // false
		
		// 특정 키의 값 업데이트
		hashMap.put("사과", 15);
		
		// hashMap의 key값들을 Set으로 만들어줌
		System.out.println(hashMap.keySet()); // [체리, 사과, 바나나]
		
		// 모든 키-값 쌍 순회
		for (String key : hashMap.keySet()) {
			System.out.println(key + " " + hashMap.get(key));
        }// 체리 8, 사과 15, 바나나 5
	}

}
