package chapter10.ex02;


//클래스의 상속 관계에서 업캐스팅 및 다운캐스팅
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Type_Casting02 {

	public static void main(String[] args) {
		//1. 업캐스팅 (자동으로 변환) : 생략시 컴파일러가 자동으로 추가, 자식클래스 객체 생성 ==> 타입을 부모로
		//ac : A, B, C를 모두 내포하고 있고, A 타입으로 정의	<<A 접근>>
		A ac=new C();
			System.out.println(ac instanceof A);
			System.out.println(ac instanceof B);
			System.out.println(ac instanceof C);
			System.out.println(ac instanceof D);	//false
			
			System.out.println("==============");
			
		//bc : A, B, C, D 모두 내포. B타입으로 정의, <<A, B 접근 가능>>	
		B bc=new C();
			System.out.println(bc instanceof A);
			System.out.println(bc instanceof B);
			System.out.println(bc instanceof C);
			System.out.println(bc instanceof D);	//f
			
		//bc: B 타입으로 정의, A 타입으로 업캐스팅
		A a = bc;
		
		//2. 다운캐스팅 (수동으로 명시) : 캐스팅이 불가능해도 컴파일러가 체크하지 않음. 실행시 예외발생
		//aa는 A만 내포하고 있음.
		A aa = new A();
			System.out.println(aa instanceof A);	//t
			System.out.println(aa instanceof B);
			System.out.println(aa instanceof B);
			System.out.println(aa instanceof D);
		
		if ( aa instanceof B) {
			B ba = (B)aa;	//컴파일시 오류 없음, 실행시 오류발생
		} else {
			System.out.println("aa는 B를 내포하고 있지 않아서 다운캐스팅이 불가합니다.");
		}
		
		if ( aa instanceof C) {
			C ca = (C)aa;	//컴파일시 오류 없음, 실행시 오류발생
		} else {
			System.out.println("aa는 C를 내포하고 있지 않아서 다운캐스팅이 불가합니다.");
		}
		
		System.out.println("==================");
		// bd : A, B, D 내포, B 타입으로 지정 <<A, B>>
		B bd = new D();
			System.out.println(bd instanceof A);
			System.out.println(bd instanceof B);
			System.out.println(bd instanceof C);	//f
			System.out.println(bd instanceof D);
			
		
		
		
		
		
			
	}

}
