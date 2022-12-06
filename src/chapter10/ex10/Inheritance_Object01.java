package chapter10.ex10;

//java.lang 패키지의 모든 클래스는 ipmort 없이 사용가능

class A extends Object {	//extends Object 생략되어있음
			//Object 글래스의 모든 메소드를 상속받음
			//자식 클래스는 하나의 부모만 상속 할 수 있다.
			//Java는 다중 상속이 불가
			//인터페이스는 다중 Implements가 가능
		
	
	int m =3;
	int n = 4;
	String name;
	
	
	//toString(): Objcet 클래스의 메소드, 
	//객체를 출력시 toString() 메소드가 작동이 되고, 기본적으로는 패키지이름.클래스이름@hashcode()
	//객체 자체를 출력시 객체의 필드의 값을 출력하도록 재정의해서 사용
	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + ", name=" + name + "]";
	}

	
	
}

public class Inheritance_Object01 {

	public static void main(String[] args) {
		// 
		A a =new A();
		
		//객체 자체를 출력시 object 클래스의 toString()
		//패키지이름.클래스이름@hashcode()
		//	hashcode ==> 참조주소 : 객체에 저장된 Heap 메모리 주소값
		System.out.println(a);
		System.out.println(a.toString());
		
		
		//String 클래스는 toString() 가 재정의 되어 있다.
		String s1 = new String("안녕");
		System.out.println(s1);

	}

}
