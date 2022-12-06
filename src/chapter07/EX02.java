package chapter07;

class Student {
	
	//필드선언
	String stuName;		//학생이름
	int stuNum;			//학번
	String stuAddr; 	//주소
	String stuPhone;	//전화번호	
	double weight; 		//몸무게
	
	//생성자 오버로딩,
	//	기본생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	
	//필드의 값을 출력하는 메소드 void print (){필드의 값을 출력}
	
	Student() {}
	
	Student (String stuName, int stuNum, String stuAddr){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
			
	}
	
	Student (String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
			
	}
	
	void print () {
		System.out.println("학생이름 : " + stuName);
		System.out.println("학번 : " + stuNum);
		System.out.println("주소 : "+ stuAddr);
		System.out.println("전화번호 : " + stuPhone);
		System.out.println("몸무게 : "+ weight);
	}
	
	
	
	
	
}

public class EX02 {

	public static void main(String[] args) {
		

		
		//1. 기본 생성자로 객체 생성
		Student stu1 = new Student ();		//기본 생성자 호출
		stu1.print();
		System.out.println("================");
				
				
		System.out.println();
		//2. 매개변수 3개인 생성자 호출
		Student stu2 = new Student("박예림", 201403005, "동대문구");
		stu2.print();
		System.out.println("================");
				
		System.out.println();
		//3. 매개변수 5개인 생성자 호출
		Student stu3 = new Student("홍길동", 20192019, "종로구", "010-5048-5551", 30.5);
		stu3.print();	//필드의 저장된 값을 출력
				
	
		
	}

}
