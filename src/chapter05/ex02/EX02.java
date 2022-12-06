package chapter05.ex02;

import java.util.Arrays;

public class EX02 {

	public static void main(String[] args) {
		// <문제> 배열 변수 : arr1 , 배열의 방의 갯수 500개
		// 배열방의 3의 배수 and 5의 배수를 저장.
		// 출력 : 1. for, 2. Enhanced For, 3. Arrays.toString()을 사용해서 출력
		

		int[] arr1 = new int[500]; 
		
		for ( int i=1; i<500; i++) {
			arr1[i]= i;	
		
		if( (i%3 == 0) || (i%5 == 0) ) {
            System.out.print(i + " ");
		}
		
		
		}
		
		
		
		
		// 2 번출력
		
		System.out.println();
		System.out.println("===향상된 FOR문 : Enhanced For===");
		for (int k : arr1) {
			System.out.print(k + " ");
		}
		
		
		//3번 출력
		System.out.println();
		System.out.println("=========Arrays.toString(배열변수)==============");
		// Arrays.toString(arr3) : 배열 변수에 저장된 모든 값들을 출력
			//Arrays : 객체
			//toString () : 메소드 (함수)
				//메소드 : 객체지향언어에서 함수를 메소드 (method)라고 호칭한다.
		
		System.out.println(Arrays.toString(arr1));	//배열 변수의 값을 출력
		
		
		
		
		
		
		
	}

}
