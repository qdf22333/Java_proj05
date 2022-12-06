package chapter05.ex06;

import java.util.Arrays;

public class EX01 {

	public static void main(String[] args) {
		
		//  
		
	int[][]arr1 = new int[][] { { 10, 20, 30, 40, 50 }, { 11, 12, 13, 14, 15}, {111, 112, 113, 114, 115}};
	
	//1. 이중 for문을 사용해서 2차원 배열의 값을 출력
	System.out.println("==For문을 사용해서 출력==");
	
		
	for (int i=0; i<arr1.length;i++) {	//i : 행의 방번호, arr1.length : 행의 갯수
		for (int j=0; j<arr1[i].length; j++) {	//j : 열의 방번호, arr1[i].length :열의 갯수 
			System.out.print(arr1[i][j]+ " ");
		}
		System.out.println();
	}
	
	//2. 향상된 For 문을 사용해서 출력
	System.out.println("==Enhanced For문을 사용해서 출력==");
		for (int[] arr2 : arr1) {
			for (int k : arr2) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
	
	
	//3. Arrays.toString ()를 사용해서 출력 : 1차원 배열의 값을 출력
	System.out.println("==Arrays.toString() 문을 사용해서 출력==");
		for (int[] arr3 : arr1) {
			System.out.println(Arrays.toString(arr3));
					
		}
	
	
	}

}
