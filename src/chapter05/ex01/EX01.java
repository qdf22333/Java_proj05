package chapter05.ex01;

public class EX01 {

	public static void main(String[] args) {
		// <문제> 
		// 배열 선언 4가지 방법: 
		// 1. 배열 변수 이름 : arr1, 정수로 3개로 지정, 40,50,60 넣고 출력 <<배열선언1>>
		
		int [] arr1 = new int [3];
		
		arr1[0] = 40;		
		arr1[1] = 50;
		arr1[2] = 60;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		
		System.out.println("======================");
		// 2. 배열 변수 이름 : arr2, 실수로 5개로 지정, 44.0,50.0,60.0.. 넣고 출력 <<배열선언2>>
		
		double [] arr2 = new double[] { 44.0, 50.0, 60.0, 70.0, 80.0};
					
		
		System.out.println(arr2 [0]);
		System.out.println(arr2 [1]);
		System.out.println(arr2 [2]);
		System.out.println(arr2 [3]);
		System.out.println(arr2 [4]);
		
		
			
		System.out.println("======================");
		// 3. 배열 변수 이름 : arr3, 문자열 3, "오늘", "날씨", "흐림" <배열선언3>

		
		
		  String[] arr3 = new String[] { "오늘", "날씨", "흐림" };
		  
		  System.out.println(arr3 [0]);
		  System.out.println(arr3 [1]);
		  System.out.println(arr3 [2]);

		 		
		
		  System.out.println("======================");
		// 4. 배열 변수 이름 : arr4, 문자 3, 'A', 'B', 'C' <배열선언4>

		   
		  
		  char[] arr4 = new char[] { 'A', 'B', 'C' };
		  
		  System.out.println(arr4 [0]);
		  System.out.println(arr4 [1]);
		  System.out.println(arr4 [2]);

		
		
		
		
			
	}

}
