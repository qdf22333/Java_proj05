package chapter04.ex05;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// 스캐너로 인풋 받은 값을 선택 시 해당 내용을 이중 for문을 사용해서 출력 하세요.
		// 4. 프로그램 종료시까지 무한 루프를 돌려서 작동 시키세요.
		// 1 ~ 4번 외의 내용을 선택 시 "잘목된 입력 입니다. 1 ~ 4 까지만 넣어주세요"
		
		
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.println("=================================================");
			System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단 중 7배수만 출력 | 4. 프로그램 종료");
			System.out.println("==================================================");
			System.out.println("위 번호를 선택하세요>>>");
			a =sc.nextInt();
			
			if (a==1) {
				System.out.println("1. 구구단 출력");
				
			}else if (a==2) {
				for(int i = 1 ; i <20 ; i++) {
					System.out.println(i + "단 출력");
				for(int j = 1 ; j < 20 ; j++) {
					System.out.print(i + " * " +j + " = " + i * j +"\t");
				}System.out.println();
				}
			}else if (a==3) {
				for(int i = 7 ;  i<=20  ; i+=7 ) {
					for (int j = 1; j < 20; j++) {
			 System.out.println(i + " * " + j + " = " + i * j);
					}
				}
				
			}else if (a==4) {
				System.out.println("4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력 입니다. 1 ~ 4까지만 넣어주세요");
			}
				
		}while ( true);
		
		System.out.println("do while문을 빠져 나왔습니다.");

     
    	  
      
		
		
	 
	}

}
