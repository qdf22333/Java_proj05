package chapter03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자 : if ~ else 구문을 축약 해서 사용 할 때 자주 사용하는 구문
			// (조건) ? 참:거짓 ; 	(조건) 참이면 ? 뒤에 <<참>>을 실행, (조건) 거짓이면 ? 뒤에 <<거짓>> 을 실행
		
		int value1 = ( 3>5 ) ? 6:9;	//(조건) 이 f 이므로 9가 value1에 들어감
		System.out.println(value1);	//9
		
		int value2 = (3 < 5) ? 6:9;	//(조건)이 t 이므로 6이 value2에 들어감
		System.out.println(value2);	//6
		
		// <문제> 스캐너로 정수값을 인풋받고 인풋받은 정수값이 홀수 이면 "홀수"라고 출력하고, 
		// 		짝수이면 "짝수"라고 출력.
		
		
		
		

	}

}
