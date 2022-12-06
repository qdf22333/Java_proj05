package chapter14.ex01;

class Aa 			{}	//부모 클래스
class B extends Aa 	{}	//자식 클래스
	


public class UncheckedException {

	public static void main(String[] args) {
		// 실행 예외 : 컴파일 단계에서 체크하지 않음. 실행시 예외 발생.
			//Unchecked Exception, RunTimeException
		
		//1. ArithmeticException : 정수를 0으로 나누었을 때 발생하는 Exception
			//모든 프로그램에서 숫자를 0으로 나누면 오류발생
//		System.out.println(3/0);
		
		//2. ClassCastException : 다운 캔스팅스 타입이 존재하지 않는 경우 발생
		
		Aa a = new Aa();	//부모 클래스를 객체화함.
//		B b = (B) a;	//a 객체는 B 타입을 포함하지 않는다. 실행시 문제 발생

		//3. ArrayIndexOutOfBoundException : 배열의 방 번호를 넘겼을 때 발생하는 예외
		int [] arr = new int [] {1,2,3};
		
//		System.out.println(arr[3]);	//배열의 방의 번호를 넘김
		
		//4. NumberFormatException : 문자 타입의 값을 정수(int), 실수(double) 변환 예외
//		int num = Integer.parseInt("10!");
//		double num2 = Double.parseDouble("10.22");
//		System.out.println(num2);
		
		//5. NullPointException : 참조주소의 값이 null인데 , 메소드를 호출하는 경우
		String str = null;
//		System.out.println(str.charAt(2));	//문자열이 저장된 경우, 2번 방의 문자열을 출력
		
		
		
		
		
	}

}
