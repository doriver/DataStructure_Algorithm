package dataStructure.aaaHandling01;

import java.util.ArrayList;

public class HdlArrayList01 {
/*
 * ArrayList
 * 내부적으로 배열을 사용함
 * 중간에 원소를 추가하거나 삭제할때, 앞으로 댕기거나 뒤로 미는 원소들이 있음
 * 
 * 기존 배열 크기보다 원소수가 많아질 경우, 더큰 배열을 만들고 기존 배열을 복사하는 작업을 수행함  
 */
	public static void main(String[] args) {
/**
 *	1. ArrayList 삽입
 *	원하는 위치에 추가 가능
 */
		ArrayList<String> arrayList = new ArrayList<>();
		System.out.println(arrayList.size()); // 0 , 원소개수

		arrayList.add("첫");
		arrayList.add("두");
		arrayList.add("세");
		arrayList.add("네");
		System.out.println(arrayList); // [첫, 두, 세, 네]
		
		arrayList.add(1, "추");
		System.out.println(arrayList); // [첫, 추, 두, 세, 네]

/**
 *	2. ArrayList 삭제
 *	원하는 위치원소 삭제 가능
 */	
		System.out.println(arrayList.remove(1)); // 추
		System.out.println(arrayList); // [첫, 두, 세, 네]
/**
 *	3. ArrayList 접근, 수정
 *	배열을 사용하기때문에 index를 이용해 요소에 빠른 접근 가능
 */
		System.out.println(arrayList.get(1)); // 두
		System.out.println(arrayList.get(2)); // 세
		arrayList.set(2, "수");
		System.out.println(arrayList); // [첫, 두, 수, 네]
/**
 *	4. ArrayList 검색
 *	포함여부, 저장된 위치
 */
		System.out.println(arrayList.contains("세")); // false
		System.out.println(arrayList.contains("수")); // true
		System.out.println(arrayList.indexOf("수")); // 2 , 앞에서부터 검색
		System.out.println(arrayList.lastIndexOf("네")); // 3 , 뒤에서부터 역방향 검색

	}

}
