package chapter02.ex05;

public class TypeCasting1 {

	public static void main(String[] args) {
		// 타입 변환 (캐스팅)
		// 1. 캐스팅 방법 1
		
			//정수의 기본은 int 형으로 저장됨
		int value1 = (int) 5.3;		//value1 정수 값만 넣을 수 있다.   =5
		long value2 =(long) 10.0000034;		//정수만 넣을 수 있다.   =10
		
			//실수의 기본은 double
		float value3 = (float) 5.8;		//캐스팅이 필요		=5.8
		double value4 = (double) 10.50;	//=10.5
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		System.out.println("============================");
		
			//2. 캐스팅 (l, L / f, F) : long, float
				//long, float의 정의된 변수에 값을 할당 할 때 캐스팅해서 넣어야한다.
				//정수 : int, 실수 : double
		
		long value5 = 10L ;
		long value6 = 20l ;
		
		float value7 = 5.8f ;
		float value8 = 5.8F ;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		

	}

}
