package algorithm.sort.insertionSort;

import java.util.Arrays;

/*
 *  1. 왼쪽자료를 오른쪽으로 땡기는경우( 기존 질서에 부합 x )
 *  2. 그대로 두는경우( 기존 질서에 부합 )
 * 	>> 기존질서에 부합하는 조건
 */

public class MyInsertionSort {

	public static void main(String[] args) {
		int[] aa = {3,2,4};
		insertion_sort(aa);
		System.out.println(Arrays.toString(aa));
	}

	
	private static void insertion_sort(int[] a) {
		int size = a.length;
		int target = 0;
		
		// 각 target들 위치 배치함
		for (int i = 1; i < size; i++) {
			target = a[i];
			
			int j = i - 1; // 비교할 대상의 index
			
			              // 여기에 기존질서에 부합하지 않는 조건
			while (j >= 0 && target < a[j]) {
				a[j+1] = a[j]; // 이전 원소를 한칸 뒤로 미룸
				j--;
			}
			
			a[j+1] = target;
		}
	}
}
