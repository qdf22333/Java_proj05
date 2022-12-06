package chapter04.ex05;

import java.util.Scanner;

public class Yerim {

	public static void main(String[] args) {
		//<<스캐너에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로그램을 작성해주세요.
		//If 문을 사용
		int select ;		//프로그램을 선택
		
		int kor;
		int eng;
		int math;
		
		int a ;
		String aName;
		String bName;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========================================");
		System.out.println("1. 학점의 합계/평균 | 2.홀수/짝수 | 3.같은 이름식별");
		System.out.println("============================================");
		System.out.println("위의 번호를 선택 하세요.>>>");
		
		select =sc.nextInt();
		
		if (select ==1 ) {
		
			System.out.println("국어 영어 수학 점수를 입력 하세요 >>>");
			kor = sc.nextInt();							
			eng = sc.nextInt();
			math = sc.nextInt();	
			
			int sum ; 						
		 	sum = kor + eng + math;
		 	double avg;						
		 	avg = sum / 3.0;
		 	
		 	System.out.println("점수의 합계는 " + sum + "이고, " + "평균은 "  + avg + "입니다.");
		}else if (select ==2) {
			
			System.out.println("숫자를 입력하시오. >>>");
			int num = sc.nextInt();
			System.out.println(num + "(은)" + (num % 2 == 0 ? "짝수입니다" : "홀수입니다"));
				
		}else if (select ==3) {
			
			System.out.println("이름을 입력하시오. 이름을 입력하시오. >>>");
			aName = sc.next();
			bName = sc.next();
			
			System.out.println(aName.equals(bName));
			
			
			
			
			
		}
		
	}	
}	