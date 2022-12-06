package chapter03.ex06;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
	// <문제> 스캐너로 정수값을 인풋받고 인풋받은 정수값이 홀수 이면 "홀수"라고 출력하고, 
		// 		짝수이면 "짝수"라고 출력.
		// <<삼항 연산자를 사용>>
		// 11시 20분까지 완료. 메일로 보내기
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("정수를 입력하세요 >>>");
		int num = sc.nextInt();
		System.out.println(num + "은" + (num % 2 ==0 ? "짝수" : "홀수 "));
		
		
		
				
		
		

	}

}
