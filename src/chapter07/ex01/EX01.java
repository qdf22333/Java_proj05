package chapter07.ex01;

public class EX01 {

	public static void main(String[] args) {
		
		//객체 생성, 메소드 호출 : Main method 에서 호출
		//sum1, sum2 객체 생성 없이바로 호출 : static 메소드
		
		sum1 (3,4,5);
		int a = sum1 (3,4,5);
		System.out.println(a);
		
		
		System.out.println(sum1(6,7,8));
		System.out.println("==============");
		
		double b = sum2 (3.0, 4.0, 5.0);
		System.out.println(b);
		
		System.out.println(sum2 (3.0, 4.0, 5.0));
		System.out.println("=============");
		
		//sum3 : 인스턴트 메소드 : static 키가 붙어있지 않는 메소드, 객체화 해야 호출이 가능
	//	String c =sum3 ("제품이름", "제품가격", "제품수량");	//오류 발생, 객체화 해야 호출
		
		EX01 e1 = new EX01();
		String d = e1.sum3("제품이름", "제품가격", "제품수량");
		System.out.println(d);
		
		System.out.println( e1.sum3("제품이름", "제품가격", "제품수량"));
		
		
		
		
		
		
	   }
	
		//정수값 3개를 인풋받아 더한값을 정수로 리턴하는 메소드 (static)
		public static int sum1 (int a, int b, int c) {
			return a + b+ c;
			
		}
		
						
		//실수 3개 인풋받아 더한값으로 실수로 리턴하는 메소드 (static
		public static double sum2  (double a, double b, double c) {
			return a + b+ c;
		}
				
				
				
		//문자열을 연결해서 출력하는 메소드 (인스턴스 메소드 : static 을 사용하지 않는 메소드)
		// "제품이름", "제품수량", "제품가격"
		//객체를 생성해서 
		
		public String sum3 (String a, String b, String c) {
			return a + " "+ b + " " + c + " ";
		}
			 
				
				
				
	
	
		
		public static int twice (int k) {
			return k;
			
		}
			
		public static double sum (int m, double n) {
				
			return m + n;	
	
	
	

		}
	
}
