package chapter10.ex08;

class Animal {
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
}
class Man extends Animal{
	
	void r1() {
		System.out.println("남자는 달립니다.");
	}
	
}


class Woman extends Animal{
	
	void r2() {
		System.out.println("여자는 달립니다.");
	}
	

}
class Lion extends Animal{
	
	void r3() {
		System.out.println("사자는 달립니다.");
	}
	
}

class Tiger extends Animal{
	
	void r4() {
		System.out.println("호랑이는 달립니다.");
	}
	
}
class Cat extends Animal{
	
	void r5() {
		System.out.println("고양이는 달립니다.");
	}
	
}
class Dog extends Animal{
	
	void r6 () {
		System.out.println("강아지는 달립니다.");
	}
	
}
class DogChild extends Dog{
	
	void r7 () {
		System.out.println("아기 강아지는 달립니다.");
	}
	
}








public class EX01 {
	
	//4시 10분까지 완료

	public static void main(String[] args) {
		// Animal :  부모 클래스 , run()정의
		//	자식클래스 : Man, Womanm ,Lion,Tiger,cat, Dog, DogChild <==다형성 
		//		- 부모의 run  메소드를 재정의
		//arr 배열에 Animal 저장 후 For 문, Enhanced For 문으로 출력, run() 메소드 출력
		
		
		
		

	}

}
