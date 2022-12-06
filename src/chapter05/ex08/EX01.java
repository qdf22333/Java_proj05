package chapter05.ex08;

public class EX01 {

	public static void main(String[] args) {
		// <문제>
		// 		args :	합계 40 77 99 100 200
		
		// 합계 : <정수를 더한 값을 출력>

		
	
		System.out.println("=============================");
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		String e = args[4];
		
		
		int f = Integer.parseInt(a);		//String 타입의 숫자를 정수로 변환		
		int g = Integer.parseInt(b);
		int h = Integer.parseInt(c);
		int i = Integer.parseInt(d);
		int j = Integer.parseInt(e);
				
		System.out.println(f + g+ h+i+j);
	
		
		System.out.println("============");
		System.out.println("합계"+ 1+2+3);	// 합계 123
		System.out.println(1+2+3+"합계");		//6합계
	
		
		
		
		
			}	

}
