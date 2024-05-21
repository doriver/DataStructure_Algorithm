package dataStructure.array;

import java.util.Arrays;

public class Basic02 {

	public static void main(String[] args) {
/**
 * java.lang 패키지 : 이 패키지에 있는 클래스들은 import 없이 사용가능
 * ( Java 프로그래밍에서 가장 기본적인 클래스들을 포함 )
 * ex) Object , String , System 등등 		
 */
		
/*
 * System.arraycopy(src, srcPos, dest, destPos, length);
 * 배열 복사 작업을 빠르고 효율적으로 수행
 **/
		int[] a = {0,1,2,3,4};
		
//		System.arraycopy(elements, index + 1, elements, index, numMoved);
		
//		System.arraycopy(a, 3, a, 2, 2); // [0, 1, 3, 4, 4]
		System.arraycopy(a, 2, a, 1, 2); // [0, 2, 3, 3, 4]
		System.out.println(Arrays.toString(a)); 

	}

}
