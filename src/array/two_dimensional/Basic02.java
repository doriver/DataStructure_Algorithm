package array.two_dimensional;

import java.util.Arrays;

public class Basic02 {

	public static void main(String[] args) {
		
		int[][] num01 = new int[2][3];
		// int[] num = new int[5]; 일반배열
		
		System.out.println(num01.length); // 2
		
		for (int i = 0; i < num01.length; i++) {
			System.out.println(Arrays.toString(num01[i]));
		} // [0, 0, 0] 엔터 [0, 0, 0]
				
		num01[0][1] = 2;
		num01[1][2] = 3;
		num01[1][0] = 1;
		
		for (int i = 0; i < num01.length; i++) {
			System.out.println(Arrays.toString(num01[i]));
		} // [0, 2, 0] 엔터 [1, 0, 3]
		
		
		int[][] num02 = {
				{1,2,3} // num02[0]
				,{4,5,6} // num02[1]
		};
		
		System.out.println(num02); // [[I@2401f4c3
		
		for (int i = 0; i < num01.length; i++) {
			System.out.println(Arrays.toString(num02[i]));
		} // [1, 2, 3] 엔터 [4, 5, 6]
		
		System.out.println(num02[0]); // [I@2401f4c3
		System.out.println(num02[1]); // [I@7637f22
		
		System.out.println(num02[1][1]); // 5
		
		int[][] num03 = {
				{1,2,3} // num03[0]
				,{4,5,6,7,8} // num03[1]
				,{3,3,3,3} // num03[2]
		};
		
		for (int i = 0; i < num03.length; i++) {
			System.out.println(Arrays.toString(num03[i]));
		} // [1, 2, 3] 엔터 [4, 5, 6, 7, 8] 엔터 [3, 3, 3, 3]
	}

}
