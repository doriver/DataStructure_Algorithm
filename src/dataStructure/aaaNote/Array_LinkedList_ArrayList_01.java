package dataStructure.aaaNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Array_LinkedList_ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sc = new int[4];
		sc[0] = 1;
		sc[1] = 2;
		System.out.println(Arrays.toString(sc)); // [1, 2, 0, 0]
		
		for (int i = 2; i < sc.length; i++) {
			sc[i] = i * 10;
		}
		
		for (int i = 0; i < sc.length; i++) {
			System.out.print(sc[i] + " "); // 1 2 20 30 
		}
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		System.out.println(ll); // [A, B, C]
		ll.addFirst("ㄱ");
		ll.addLast("ㄴ");
		ll.add(2, "ㄷ");
		System.out.println(ll); // [ㄱ, A, ㄷ, B, C, ㄴ]
		
		for (String st : ll) {
			System.out.print(st + " "); // ㄱ A ㄷ B C ㄴ
		}
		
		System.out.println(ll.contains("ㄱ")); // true
		System.out.println(ll.indexOf("ㄱ")); // 0
		ll.removeFirst();
		ll.remove(1);
		ll.removeLast();
		System.out.println(ll); // [A, B, C]
		
		
		ArrayList<Integer> al = new ArrayList<>(5);
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al); // [1, 2, 3]
		
		System.out.println(al.get(1)); // 2
//		System.out.println(al.get(3)); // 에러
		
	}

}
