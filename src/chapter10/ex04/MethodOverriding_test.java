package chapter10.ex04;

class Animal{
	//Animal 필드
	String name;
	int age;
	
	//기본 생성자가 생략되어 있따. Animal () {}
	
	//Animal 메소드
	void cry() { 
		System.out.println("Animal 클래스의 cry()");
	}
	
}



class Tiger extends Animal { 
	//자식 클래스의 생성자에는 기본적으로 super ()가 생략되어 있다.
	
	//기본 생성자가 생략되어 있다.
	
	
	int tigerNo;	//Tiger 생성된 필드
	
	void tigerMethod() {
		System.out.println("Tiger 클래스의 메소드");
	
	}
	@Override
	void cry() {
		System.out.println("어흥");
	}

	
}

class Eagle extends Animal{
	int eagleNo;
	void eagleMethod() {
		System.out.println("Eagle 클래스의 메소드");
	}
	
	@Override
	void cry() {
		System.out.println("짹짹");
	}
	
}

class TigerChild extends Tiger{
	int tigerChildNo;
	void tigerChildMethod() {
		System.out.println("TigerChild 클래스의 메소드");
	}
	
	void cry() {
		System.out.println("응애");
	}
	
	
}


public class MethodOverriding_test {

	public static void main(String[] args) {
		// 메소드 오버라이딩 : 상속 관계에서 부모 클래스의 메소드를 자식클래스에서 재정의
		
		//1. 객체의 타입 
		//a1 : Animal를 내포하고 있고 Animal의 필드와 메소드 접근 
		Animal a1 = new Animal();
		a1.name = "동물이름";
		a1.age = 10;
		a1.cry();
		System.out.println("===================");
		
		
		//2. Tiger 객체를 생성하면서 Tiger 타입으로 지정
		//t1 은 Animal, Tiger 내포, Tiger 타입으로 지정(Animal, Tiger 접근)
		
		Tiger t1 = new Tiger();
		//부모의 필드와 메소드 호출
		t1.name = "호랑이1";
		t1.age = 5;
		t1.cry();
		
		//Tiger의 필드 메소드 호출
		t1.tigerNo = 10;
		t1.tigerMethod();
		t1.cry();
		
		//3. Tiger 객체를 생성하면서 Animal 타입으로 저장 (Animal 의 필드와 메소드만 접근)
		//a2 : Animal, Tiger
		Animal a2 = new Tiger();
		//Animal 의 필드와 메소드만 접근
		a2.name="호랑이2";
		a2.age=5;
		a2.cry();	//오버라이딩된 Tiger의 cry()이 호출됨
		
		//다운 캐스팅 : a2. Animal, Tiger 내포, Animal 타입
		
		Tiger t2 = (Tiger) a2; //다운 캐스팅할 때는 반드시 instanceof 를 사용해야함
		
		if (a2 instanceof TigerChild) {
		TigerChild t3 = (TigerChild) a2;
		} else {
			System.out.println("a2에는 TigerChild를 내포하고 있지 않습니다.");
		}
		
		// TigerChild 객체를 생성하면서 Animal 타입으로 지정
		//a4 : A, T, TC
		Animal a4 = new TigerChild();
		a4.cry();
		
		//다운 캐스팅 : 타입 명시해줘야함
		Tiger t10 = (Tiger) a4;
		t10.cry();
		
		//다운 캐스팅
		TigerChild tc10 = (TigerChild)t10;
		tc10.cry();
		
		
		//업캐스팅
		Animal a20 = tc10;
		
		System.out.println("====================");
		//배열에 객체를 저장, 값을 출력하기 위한 객체 생성, A타입으로 지정
		Animal a29 = new Animal();	//a29 : A객체만 가지고잇음
		Animal a30 = new Tiger();	//a30 : A, T
		Animal a31 = new Eagle();	//a31 : A, E
		Animal a32 = new TigerChild();	//a32 : A, T, TC
		
		//배열에 Animal 타입의 객체저장
		Animal[] arr= new Animal[] {a29, a30, a31, a32};
		
		//배열의 값을 출력 : 향상된 for 문을 사용해서 출력
		for (Animal k : arr) {
			k.cry();
		}
		
		
		System.out.println("====For문을 사용해서 객체 정보출력=====");
		
	
		//배열의 값 출력 : For 문을 사용해서 출력, 배열의 값을 Animal 변수에 할당하고 출력
		for (int i = 0; i<arr.length; i++) {
			Animal aa = arr[i];
			aa.cry();		
		}
		
		System.out.println("=================");
		for (int i=0; i<arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println(" ==================");
		//객체 변수를 블락 밖에서 선언 후 출력
		Animal aaa= null;	//A 객체형 변수 ,  초기화 할 때  null을 사용
		for (int i=0; i<arr.length; i++) {
			aaa = arr[i];
			aaa.cry();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
