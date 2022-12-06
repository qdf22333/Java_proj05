package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록 하고 ,
		// 어머니이름, 아버님이름, 형제이름, 내이름 <== sc.next();
		// 어머니 나이, 아버님나이, 형제나이. 내나이	<==sc.nextint();
		
		
		//콘솔에서 인풋받은 이름은 모두 출력
		// 나이의 합계와 평균을 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		String name1;
		String name2;
		String name3;
		String name4;
		
		int a ;
		int b ;
		int c ;
		int d ;
		
		
		System.out.println("어머님 이름을 입력하세요 >>>");
		name1 = sc.next();
		System.out.println("아버님 이름을 입력하세요 >>>");
		name2 = sc.next();
		System.out.println("형제 이름을 입력하세요 >>>");
		name3 = sc.next();
		System.out.println("자신의 이름을 입력하세요 >>>");
		name4 = sc.next();
		
		System.out.println("어머님 나이를 입력하세요 >>>");
		a = sc.nextInt();
		System.out.println("아버님 나이를 입력하세요 >>>");
		b= sc.nextInt();
		System.out.println("형제 나이를 입력하세요 >>>");
		c = sc.nextInt();
		System.out.println("자신의 나이를 입력하세요 >>>");
		d = sc.nextInt();
		
		
		int sum;
			sum =  a + b + c + d ;
		double avg;
			avg = sum / 4.0 ;
					
					
		System.out.println("==================");
		System.out.println("어머님의 이름은 " + name1 + " 이고");
		System.out.println("아버님의 이름은 " + name2 + " 이고");
		System.out.println("형제의 이름은 " + name3 + " 이고");
		System.out.println("자신의 이름은 " + name4 + " 입니다.");
		
		System.out.println("나이의 합계는 " + sum + " 이고");
		System.out.println("나이의 평균은 " + avg + " 입니다.");
		

	}

}
