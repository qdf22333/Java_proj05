package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <<실습 문제>>	<완료시간: 6:10분, p.janwoo@gmain.com Ex01.java>
		// 정수 2개를 Scanner로 인풋 받고 두 값이 같으면 t 출력, 다르면 f로 출력
		// 이름 2개를 Scanner로 인풋 받고 두 값이 같으면 t 출력, 다르면 f로 출력
			// 등가연산자 사용
			// 기본자료형 : ==
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int a ; 
		int b ; 
		
		
			//참조자료형 : aName.equals(bName)
		
		String aName;
		String bName;
		
		
		System.out.println("나이를 입력하세요 >>>");
		a = sc.nextInt();
		System.out.println("태어난 월을 입력하세요 >>>");
		b = sc.nextInt();
	
		System.out.println(a == b); 
		
		
		System.out.println("이름을 입력 하세요 >>>");
		aName = sc.next();	
		System.out.println("이름을 입력 하세요 >>>");
		bName = sc.next();	
			
		
		System.out.println(aName.equals(bName));
		
		
		//기본 자료형 값 비교 : == (Stack 영역의 값 비교)
		// 두 정수의 값을 비교해서 맞으면 t, f
		//참조 자료형의 값 비교 :  aName,equals(bName) (Heap 영역의 값비교)
				
		
		
		
		

	}

}
