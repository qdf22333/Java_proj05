package chapter10.ex01;

class Animal {		//Animal 클래스를 상속해서 Tiger, Eagle, Lion 를 생성
						//자식 클래스에서는 필드1, 메소드1 정의 
					//LionChild클래스는 Lion클래스를 상속해서 필드1, 메소드1 정의
	String name;
	int age;
	String color;
	
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
		
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}


}

class Tiger extends Animal {
	int TigerID ;
	
	void goToTiger() {
		System.out.println("호랑이는 먹으러 갑니다.");
	}
	
}

class Eagle extends Animal {
	int EagleID ;
	
	void goToEagle() {
		System.out.println("독수리는 먹으러 갑니다.");
	}
	
}

class Lion extends Animal {
	int LionID ;
	
	void goToLion() {
		System.out.println("사자는 먹으러 갑니다.");
	}
	
}

class LionChild extends Lion {
	int LionChildID ;
	
	void goToLionChild() {
		System.out.println("아기사자는 먹으러 갑니다.");
	}
	
}





public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiger t1 = new Tiger();
		
		System.out.println("====부모 필드 메소드 출력====");
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.color);
		
		t1.eat();
		t1.sleep();
		
		
		System.out.println("====자식 필드 메소드 출력====");
		t1.TigerID = 111;
		System.out.println(t1.TigerID);
		t1.goToTiger();
		
		
		
		Eagle e1 = new Eagle();
		
				
		System.out.println("====자식 필드 메소드 출력====");
		e1.EagleID = 222;
		System.out.println(e1.EagleID);
		e1.goToEagle();
		
		
		Lion l1 = new Lion();
		
		
		System.out.println("====자식 필드 메소드 출력====");
		l1.LionID = 333;
		System.out.println(l1.LionID);
		l1.goToLion();
		
		
		System.out.println("====Lion 자식 필드 메소드 출력====");
		LionChild l2 = new LionChild();
		
		l2.name="원숭이";
		l2.age=28;
		l2.color="노랑색";
		System.out.println(l2.name);
		System.out.println(l2.age);
		System.out.println(l2.color);
		
		l2.eat();
		l2.sleep();
		
		System.out.println("=========Lion 필드 메소드 호출=========");
		l2.LionID = 1234;
		l2.goToLion();
		
		System.out.println("=========LionChild 필드 메소드 호출=========");
		l2.LionChildID = 5678;
		l2.goToLionChild();
	
		
		
				
		
		
		
	}

}
