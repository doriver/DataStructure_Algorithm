package list.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("   ======    1. List 와 Array     ======  ");
/**
 *	1. List 와 Array
 *	
 */
		LinkedList<Number> list01 = new LinkedList<>();
		list01.add(1);
		list01.add(2);
		list01.add(3);
		list01.add(4);
		
		// List >> Array
		Object[] arr = list01.toArray();
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4]
		
		// Array >> List		
		List<Object> list02 = Arrays.asList(arr);
		System.out.println(list02); // [1, 2, 3, 4]
		
		System.out.println("   ======    2. 이터레이터     ======  ");
		/**
		 *	2. LinkedList 이터레이터
		 *	
		 */	
		
		System.out.println("   ======    3. 스택 & 큐 지원      ======  ");
		/**
		 *	3. LinkedList 스택 & 큐 지원
		 *	
		 */	
	}

}
