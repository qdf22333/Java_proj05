package chapter07;

class Calc{
	
	
	//두 정수의 값을 받아서 더해서 값을 던져줌
	int add (int a, int b) {
		return a+b;
	}
	
	// 빼기 (diff)
	int diff (int a, int b) {
		return a-b;
	}
	
	
	
	// 곱하기	(mul)
	int mul (int a, int b) {
		return a * b;
	}
	
	
	// 나누기 (div) : double
	
	double div (double a, double b) {
		return a/b;
	}
	
	// 면적 (Rec) (가로 : x, 세로:y) 실수 2개(double)
	
	double rec (double a, double b) {
		return a * b;
	}
	
}

public class EX01 {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.diff(50, 22));
		System.out.println(calc.mul(3, 5));
		System.out.println(calc.div(10, 2));
		System.out.println(calc.rec(20, 30.6));
				
		
		
		

	}

}
