package chapter10.ex02;

class Human { 
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
	
}

class Student extends Human {
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student {
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생 2는 음식을 맛나게 먹습니다.");
	}
}


public class EX01 {
//3시 45분까지 실습 
	public static void main(String[] args) {
		// 업캐스팅 실습
		//1. Student 클래스를 생성하면서 Human 타입으로 지정	:	h1
		//2. Student 클래스를 생성하면서 Student 타입으로 지정 : s1
		
		//3. Student2 객체를 생성하면서 Human 타입으로 지정 : h2
		//4. Student2 객체를 생성하면서 Student 타입으로 지정 : s2
		//6. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		
		System.out.println("===1. Student 클래스를 생성하면서 Human 타입으로 지정:h1===");
		Human h1 = new Student();
		h1.name = "원숭이";
		h1.age = 20;
		System.out.println(h1.name);
		System.out.println(h1.age);
		h1.eat();
		
		System.out.println("===2. Student 클래스를 생성하면서 Student 타입으로 지정:s1===");
		Student s1 = new Student();
		s1.stuID = "안녕";
		System.out.println(s1.stuID);
		s1.stuEat();
		
		System.out.println("===3. Student 클래스를 생성하면서 Student 타입으로 지정:s1===");
				
		
		

	}

}
