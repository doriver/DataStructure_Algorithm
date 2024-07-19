package dataStructure.array;

import java.util.Arrays;

public class Basic01 {

	public static void main(String[] args) {

/**
 *	1.
 */
		int[] score = new int[5];
//		score[4] = 9;
		score[1] = 11;
		System.out.println(Arrays.toString(score)); // [0, 11, 0, 0, 9]

		for (int i = 0; i < 3; i++) { 
			score[i] = i * 10; 
		}
		System.out.println(score); // [I@3d012ddd
		System.out.println(score[2]); // 20
		System.out.println(score.length); // 5 배열 길이는 맨처음 선언될떄 결정됨, 원소 추가되는거에 상관없이
		System.out.println(Arrays.toString(score)); // [0, 10, 20, 0, 9]

		
/**
 *	2. 
 */
		int[] arr = {3, 2, 0, 1, 4};
		System.out.println(arr[0]); // 3
		Arrays.sort(arr); // 원소들을 정렬함
		System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]

		
/**
 *	3. 배열의 복사, 확장 
 *	배열은 한번 선언되고 나면 공간 자체를 직접 늘릴수없다
 *	
 *	Arrays.copyOf(elements, newSize);
 *	원본 배열의 요소들을 새로운 크기의 배열로 복사하여 , 원본 배열의 크기를 늘리거나 줄인것처럼 만들어줌
 */
		int[] arr1 = {10, 20, 30}; // [I@3d012ddd

//		int[] arr2 = new int[arr1.length * 2]; // [I@626b2d4a
//		for(int i = 0; i < arr1.length; i++) {	arr2[i] = arr1[i];	} // [10, 20, 30, 0, 0, 0]	
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length * 2); // [10, 20, 30, 0, 0, 0]
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
