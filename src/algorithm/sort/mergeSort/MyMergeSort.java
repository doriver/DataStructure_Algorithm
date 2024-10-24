package algorithm.sort.mergeSort;

import java.util.Arrays;

public class MyMergeSort {

	
	// Key Logic
	// 정렬된 왼,오른쪽 배열을 하나의 배열로 합치는거
	static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftLength = leftHalf.length;
		int rightLength = rightHalf.length;
		
		int i = 0, j = 0, k = 0;
		// i : 추적하는 왼쪽 index,   j : 추적하는 오른쪽 index,   k : 새롭게 채워져야 하는 index
		
		// 좌,우 비교하여 병합
		while (i < leftLength && j < rightLength) {
			if (leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while (i < leftLength) { // 좌측배열에 남은 요소 있는경우
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while (j < rightLength) { // 우측 배열에 남은 요소 있는경우
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
	}
	
	// 존나 어려움
	static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;
		
		if (inputLength < 2) {
			return;
		}
		
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for (int i = 0; i < midIndex; i++) { // 좌측배열 생성
			leftHalf[i] = inputArray[i];
		}
		
		for (int i = midIndex; i < inputLength; i++) { // 우측배열 생성
			rightHalf[i - midIndex] = inputArray[i];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		merge(inputArray, leftHalf, rightHalf);
	}
	
	
	
	public static void main(String[] args) {
		int[] a = {3,9,5,7,4,6,2,1};
		mergeSort(a);

		System.out.println(Arrays.toString(a)); // [1, 2, 3, 4, 5, 6, 7, 9]
	}

	
	
}
