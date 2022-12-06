package chapter11.ex01;

class Aaa {	//선언과 동시에 값 할당
	int a = 3;	//필드 :  값을 수정할 수 있다.
	final int b = 5;	//상수: 값을 수정할 수 없다.
	
	Aaa (){}
}
class Baa {	//선언, 값 할당 분리
	int a;
	final int b;
	
	Baa(){
		a=3;
		b=5;
	}
	
}

class C{
	int a = 3;
	final int b =5;	//상수
	C(){
		a=7;
//		b=10;	//오류 발생
	}
}

public class Final_Field {

	public static void main(String[] args) {
		// final modifer : 
			//1. 필드 : 값을 수정하지 못하도록 [상수]
			//2. 메소드 : 자식 클래스에서 오버라이딩을 불가
			//3. 클래스 : 상속이 불가한 클래스
		
		Aaa a1 = new Aaa();
		
		//a : 필드 [변수]: 값을 수정할 수 있다. 
		//b : 상수 : 값을 수정할 수 없다.
		a1.a = 5;
//		a1.b = 6;
		
		Baa b1 = new Baa();
		b1.a = 10;
//		b1.b = 20;	//상수 : 값 수정불가
		
			

	}

}
