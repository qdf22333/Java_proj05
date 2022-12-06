package chapter12.ex04;



interface Animal {}

interface Animal1 extends Animal{
	void cry();
}
interface Animal2 extends Animal{
	void run();
}
interface Animal3 extends Animal{
	void eat();
}

class Cat implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("고양이는 웁니다.");
	}
	@Override
	public void run() {
		System.out.println("고양이는 달립니다.");
		
	}
}
class Tiger implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("호랑이는 웁니다.");
		
	}
	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");
		
	}
}
class Dog implements Animal2, Animal3 {
	@Override
	public void run() {
		System.out.println("강아지는 달립니다.");
		
	}
	@Override
	public void eat() {
		System.out.println("강아지는 먹습니다.");
		
	}
}
class Lion implements Animal2, Animal3 {
	@Override
	public void run() {
		System.out.println("사자는 달립니다.");
		
	}@Override
	public void eat() {
		System.out.println("사자는 먹습니다.");
		
	}
}
class Eagle implements Animal1, Animal2, Animal3 {
	@Override
	public void cry() {
		System.out.println("독수리는 웁니다.");
		
	}
	@Override
	public void run() {
		System.out.println("독수리는 날아다닙니다.");
		
	}
	@Override
	public void eat() {
		System.out.println("독수리는 먹습니다.");
		
	}
}




//Cat, Tiger	<==cry(), run()
//Dog, Lion 	<==run(), eat()
//Eagle 		<==cry(), run(), eat()

//배열에 넣어서 오버라이딩된 메소드 출력
	//instanceof 를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry(), run()
	//instanceof 를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 run(), eat()
	//instanceof 를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry(), run(), eat()



public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		
		Animal a1 = new Cat();
		Animal a2 = new Tiger();
		Animal a3 = new Dog();
		Animal a4 = new Lion();
		Animal a5 = new Eagle();
		
		
		Animal[] arr = new Animal[] {a1, a2, a3, a4, a5};
	
		if (arr[0] instanceof Cat) {
			Cat a = (Cat)arr[0];
			a.cry();
			a.run();
		}else {
			System.out.println("fail");
		}if (arr[1] instanceof Tiger) {
			Tiger b = (Tiger)arr[1];
			b.cry();
			b.run();
		}else {
			System.out.println("fail");
		}if (arr[2] instanceof Dog) {
			Dog c = (Dog)arr[2];
			c.eat();
			c.run();
		}else {
			System.out.println("fail");
		}if (arr[3] instanceof Lion) {
			Lion d = (Lion)arr[3];
			d.eat();
			d.run();
		}else {
			System.out.println("fail");
		}if (arr[4] instanceof Eagle) {
			Eagle e = (Eagle)arr[4];
			e.cry();
			e.eat();
			e.run();
		}else {
			System.out.println("fail");
		}
		
		
		
			
		
		
		
		
	}

}
