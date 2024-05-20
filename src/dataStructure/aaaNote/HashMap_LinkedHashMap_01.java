package dataStructure.aaaNote;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_LinkedHashMap_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hm = new HashMap<>();
		hm.put("ㅅ과", 10);
		hm.put("바나나", 3);
		hm.put("체리", 7);
		System.out.println(hm); // {ㅅ과=10, 체리=7, 바나나=3}
		System.out.println(hm.get("바나나")); // 3
		System.out.println(hm.containsKey("ㅅ과")); // true
		
		for (String key : hm.keySet()) {
			System.out.print(key + "=" + hm.get(key) + ","); // ㅅ과=10,체리=7,바나나=3,
		}
		
		// LinkedHashMap는 순서가 유지됨, 속도는 HashMap이 더 빠름
		Map<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("ㅅ과", 10);
		lhm.put("바나나", 3);
		lhm.put("체리", 7);
		System.out.println(lhm); // {ㅅ과=10, 바나나=3, 체리=7} 
	}

}
