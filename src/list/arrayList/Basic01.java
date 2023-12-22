package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Basic01 {
	
	public static void main(String[] args) {
		

/**
 *	1.
 */		
		List<Integer> arrayList = new ArrayList<>();
		
		System.out.println(arrayList); // []
		
		// arrayList에 값 넣기
		arrayList.add(4);
		arrayList.add(8);
		arrayList.add(4);
		arrayList.add(3); // add한 순서대로 저장됨
		System.out.println(arrayList); // [4, 8, 4, 3]
		System.out.println(arrayList.size()); // 4 ( 크기 )
		
		// 중간에 값 추가하기, 특정값 얻기
		arrayList.add(1, 5); // index 1번에 5를 추가
		System.out.println(arrayList); // [4, 5, 8, 4, 3]
		System.out.println(arrayList.get(1)); // 5 ( index 1번 값 얻는거 )
		
		// 특정값 수정하기
		arrayList.set(0, 10); // index 0번값을 10으로 바꾼다
		System.out.println(arrayList); // [10, 5, 8, 4, 3]
		
		// 특정값 삭제
		Integer deleteNumber = arrayList.remove(0); // index 0번값 제거, 제거된 값 출력
		System.out.println(arrayList); // [5, 8, 4, 3]
		System.out.println(deleteNumber); // 10
		
		// 요소 순회
		for (int number : arrayList) {
			System.out.println(number); // 5, 8, 4, 3
		}
		
		// 모든값 삭제
		arrayList.clear();
		System.out.println(arrayList); // []
 	}

}
