package dataStructure.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Basic01 {

	public static void main(String[] args) {
		
		Set<String> set01 = new HashSet<>();
		set01.add("app");
		set01.add("bana");
		set01.add("le");
		set01.add("kiwi");
		
		System.out.println(set01); // [app, kiwi, le, bana]

		set01.remove("le");
		
		System.out.println(set01.contains("app")); // true
		System.out.println(set01.contains("le")); // false
		
		System.out.println(set01.size()); // 3
		
		

	}

}
