package dataStructure.array;

import java.util.Arrays;

public class MyMethod01 {

	// 복사로 배열 길이 바꾸기
	public static int[] copyArray(int[] original, int newLength) {

		int[] newArray = new int[newLength];
		int copyLength = Math.min(original.length, newLength);
		
		for (int i = 0; i < copyLength; i++ ) {
			newArray[i] = original[i]; // 이렇게 값을 하나하나 대입해줘서 복사함
		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5};
		int[] new3 = copyArray(original, 3);
		int[] new10 = copyArray(original, 10);
		
		System.out.println(Arrays.toString(new3)); // [1, 2, 3]
		System.out.println(Arrays.toString(new10)); // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
		

	}

}
