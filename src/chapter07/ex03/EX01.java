package chapter07.ex03;

import java.util.Arrays;

public class EX01 {

	public static void main(String[] args) {
		// 가변 길이 배열 문제
		/*
				values[0] : 값이 정수 1 ~ 9 이 들어왔을 때 "파워레벨 1 [9] 입니다." 출력
				values[1] : 값이 정수 11 ~ 19 들어올 때 "스피드 레벨 1 [9] 입니다." 
				
		*/
		arrayFlexble (7, 8);
		
		
	System.out.println("=================");
		
	arrayFlexble2 ("");


		
		
		
	}
	public static void arrayFlexble (int...values) {
		System.out.println(Arrays.toString(values));
	}
	
	
	
	
	public static void arrayFlexble2 (String...values) {
		for (int i=0; i< values.length; i++) {
			System.out.print(values[i]+ "스피드레벨 " + i + " 입니다. ");
		}
		
	}

}
