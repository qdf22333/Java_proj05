package chapter16.ex06;

class A {
	
	public <T> void method (T t) {
		//제너릭 메소드 내에서 사용가능한 메소드는 Object 의 메소드만 사용가능함.
		// 단, 제너릭에 들어오는 타입이 제한 적용된 경우는 해당 메소드를 사용할 수 있다.
		
		
//		System.out.println(t.langth());	// length() : String 클래스의 메소드
		
		System.out.println(t.equals("안녕"));		//equlas() : Object 클래스의 메소드
	}
}

public class AvailablemethodInGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요.반갑습니다.".length());

		A a = new A();
		a.<String>method("안녕");
		a.method("안녕");
		a.method("하세요");
		
	}

}
