package chapter03.ex06;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		// <문제 2 EX02>
		//스캐너로 3, 6, 9의 배수이면 "3,6,9의 배수입니다"
		// 그렇지 않으면 "3, 6, 9의 배수가 아닙니다"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 >>>");
		int num = sc.nextInt();
		System.out.println(num + " 은 " + (num % 3 == 0 ? "3, 6, 9 의 배수입니다." : "3, 6, 9의 배수가 아닙니다"));
	}

}
