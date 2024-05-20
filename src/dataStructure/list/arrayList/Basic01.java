package dataStructure.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Basic01 {
	
	public static void main(String[] args) {
		
		// ArrayList(Collection c) :  주어진 컬렉션이 저장된 ArrayList를 생성
		ArrayList<Integer> list01 = new ArrayList<>(Arrays.asList(1,2,3));
		ArrayList<Integer> list02 = new ArrayList<>(list01);
		System.out.println(list01); // [1, 2, 3]
		System.out.println(list02); // [1, 2, 3]

		// ArrayList(int initialCapacity) : 초기 용량 지정, 별 쓸모 없는듯?
		ArrayList<Integer> num01 = new ArrayList<>(5);
		System.out.println(num01.size()); // 0
		System.out.println(num01); // []
		num01.add(1);
		num01.add(2);
		num01.add(3);
		num01.add(4);
		num01.add(5);
//		num01.ensureCapacity(10); // 리스트의 최소 용량을 재지정함
		num01.add(6);
		num01.add(7);
		System.out.println(num01); // [1, 2, 3, 4, 5, 6, 7]
		System.out.println(num01.size()); // 7
		
System.out.println("    ======           ======== ");
/**
 *	1.
 */		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		System.out.println(arrayList); // []
		
		// arrayList에 값 넣기
		arrayList.add(4);
		arrayList.add(8);
		System.out.println(arrayList); // [4, 8]
		arrayList.add(4);
		arrayList.add(3); // add한 순서대로 저장됨
		System.out.println(arrayList); // [4, 8, 4, 3]
		System.out.println(arrayList.size()); // 4 ( 크기 )
		
		// 중간에 값 추가하기
		arrayList.add(1, 5); // index 1번에 5를 추가
		System.out.println(arrayList); // [4, 5, 8, 4, 3]
		
		// 요소 얻기
		// 지정된 위치(index)에 저장된 객체를 반환한다.
		System.out.println(arrayList.get(1)); // 5 ( index 1번 값 얻는거 )
		System.out.println(arrayList.get(2)); // 8 
		// 범위에 해당하는 요소 얻기
		System.out.println(arrayList.subList(1, 3)); // [5, 8]
		System.out.println(arrayList); // [4, 5, 8, 4, 3]
		
		// 특정값 수정하기
		arrayList.set(0, 10); // index 0번값을 10으로 바꾼다
		System.out.println(arrayList); // [10, 5, 8, 4, 3]
		
		// 특정값 삭제
		Integer deleteNumber = arrayList.remove(0); // index 0번값 제거, 제거된 값 출력
		System.out.println(arrayList); // [5, 8, 4, 3]
		System.out.println(deleteNumber); // 10

		// 요소 검색
		// 지정된 객체(obj)가 ArrayList에 포함되어 있는지 확인한다.
		System.out.println(arrayList.contains(5)); // true
		System.out.println(arrayList.contains(1)); // false
		// 지정된 객체(obj)가 저장된 위치를 찾아 반환한다. , 만일 없으면 -1
		System.out.println(arrayList.indexOf(5)); // 0
		// 지정된 객체(obj)가 저장된 위치를 뒤에서 부터 역방향으로 찾아 반환한다.
		System.out.println(arrayList.lastIndexOf(1)); // -1
		
		// ArrayList 복사
		Object copy = arrayList.clone();
		System.out.println(copy); // [5, 8, 4, 3]
		
		System.out.println("    ======           ======== ");		
		// ArrayList 배열 변환
		Object[] array = arrayList.toArray();
		
		
		// 요소 순회
		for (int number : arrayList) {
			System.out.println(number); // 5, 8, 4, 3
		}
		
		System.out.println("    ======           ======== ");	
		// ArrayList 배열 정렬
		// sort() 메서드는 정렬된 값을 반환하는 것이 아닌, 원본 리스트 자체를 변경 시킨다.
		// 오름차순 정렬
		arrayList.sort(Comparator.naturalOrder());
		System.out.println(arrayList); // [3, 4, 5, 8]
		// 내림차순 정렬
		arrayList.sort(Comparator.reverseOrder());
		System.out.println(arrayList); // [8, 5, 4, 3]

		// 모든값 삭제
		arrayList.clear();
		System.out.println(arrayList); // []
 	}

}
