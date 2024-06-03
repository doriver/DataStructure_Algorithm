package dataStructure.aaaNote;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ZzzComprehensive01 {

	public static void main(String[] args) {
System.out.println(" =====  ====  Map  =====   ======  ");
		// LinkedHashMap는 순서가 유지됨, 속도는 HashMap이 더 빠름
		Map<String, Integer> hm = new HashMap<>();
		hm.put("key", 3);
		hm.put("2번째는 value", 2);
		hm.put("rr", 1);
		System.out.println(hm); // {rr=1, 2번째는 value=2, key=3} , 순서가 put한 순서랑 다름
		System.out.println(hm.get("key")); // 3
		System.out.println(hm.containsKey("rr")); // true
		System.out.println(hm.containsValue(2)); // true
		
		for (String key: hm.keySet()) {
			System.out.print(key + "=" + hm.get(key) + ", ");
		} // rr=1, 2번째는 value=2, key=3,
		
		Map<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("key01", 1);
		lhm.put("key02", 2);
		lhm.put("key03", 3);
		System.out.println(lhm); // {key01=1, key02=2, key03=3} LinkedHashMap은 put한 순서대로 

	}

}
