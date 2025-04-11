package dataStructure.aaaHandling01;

import java.util.HashSet;
import java.util.Iterator;
/*
 * HashSet
 * 위치라는 개념이 없는듯
 * 
 */
public class HdlHashSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 *	1. HashSet 삽입
 */
		HashSet<String> set = new HashSet<>();
		set.add("app");
		set.add("bana");
		set.add("le");
		System.out.println(set); // [app, le, bana]	
		System.out.println(set.size()); // 3

/**
 *	2. HashSet 삭제
 */	
		System.out.println(set.remove("le")); // true

/**
 *	3. HashSet 접근, 수정 없는듯?
 */
		for (String a: set) {
			System.out.println(a); // app , bana
		}

/**
 *	4. HashSet 검색
 *	포함여부
 */
		System.out.println(set.contains("app")); // true
		System.out.println(set.contains("le")); // false
/**
 *	5. Iterator
 *	순차적인 접근(순회)
 */
		Iterator<String> iterator= set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // app , bana
		}
	}

}
