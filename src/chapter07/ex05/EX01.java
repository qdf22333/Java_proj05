package chapter07.ex05;


class Student{	
	
	//필드 선언
	String stuName;		//학생이름: 학생이름없음
	int stuNo;			//학번 : 0
	String stuPhone;	//핸드폰번호 : 000-0000-0000
	String stuAddr;		//주소 : "서울"
	int stuAge;			//나이 : 0
	double stuWeight;	//몸무게 : 0.0
		
	Student() {	//기본생성자에서 초기값을 할당 : this () 메소드를 사용해서 각 필드의 값을 적용
	
		stuName = "학생이름없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;
			
			
	}
	
	Student (String stuName) {
		this ();
		this.stuName = stuName;
	}
	Student (String stuName, int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	Student (String stuName, int stuNo, String stuPhone){
		this(stuName, stuNo);
		this.stuPhone = stuPhone;
	}
	Student (String stuName, int stuNo, String stuPhone, String stuAddr){
		this(stuName, stuNo, stuPhone);
		this.stuAddr = stuAddr;
	}
	Student (String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge){
		this(stuName, stuNo, stuPhone, stuAddr);
		this.stuAge = stuAge;
	}
	Student (String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge, double stuWeight){
		this(stuName, stuNo, stuPhone, stuAddr, stuAge);
		this.stuWeight = stuWeight;
	}
	
	
		
		
	void print () {
				//필드의 내용을 출력
		
		System.out.println("학생의 이름은 : " + stuName);
		System.out.println("학번은 : " + stuNo);
		System.out.println("핸드폰번호는 : " + stuPhone);
		System.out.println("주소는 : " + stuAddr);
		System.out.println("나이는 : " + stuAge);
		System.out.println("몸무게는 : " + stuWeight);
		
		
				
	}
		
		
}

public class EX01 {

	
	
	public static void main(String[] args) {
		Student student1 = new Student ();
		student1.print();
		
		
		
		//매개 변수 1개인 생성자 호출
		System.out.println("===========");
		Student student2 = new Student("박예림");
		student2.print();
		
		//매개 변수 2개인 생성자 호출
		System.out.println("===========");
		Student student3 = new Student("박예림", 201403005);
		student3.print();
		
		//매개 변수 3개인 생성자 호출
		System.out.println("===========");
		Student student4 = new Student("박예림", 201403005, "010-5048-5551");
		student4.print();
		
		//매개 변수 4개인 생성자 호출
		System.out.println("===========");
		Student student5 = new Student("박예림", 201403005, "010-5048-5551", "서울");
		student5.print();
		
		//매개 변수 5개인 생성자 호출
		System.out.println("===========");
		Student student6 = new Student("박예림", 201403005, "010-5048-5551", "서울", 28);
		student6.print();
		
		//매개 변수 6개인 생성자 호출
		System.out.println("===========");
		Student student7 = new Student("박예림", 201403005, "010-5048-5551", "서울", 28, 40.5);
		student7.print();

	}

}
