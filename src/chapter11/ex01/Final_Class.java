package chapter11.ex01;

class Aaaㅠ {
	int m;
	final int n;
	
	Aaaㅠ(){
		n = 10;
	}
	
	Aaaㅠ(int n){
		this.n=n;
		
	}
	
	void run () {
		System.out.println("Aaaㅠ 클래스의 run() 입니다.");
	}
final class Bbb extends Aaa {	//상속이 불가하도록 설정된 클래스 
	
}

//상속 불가 : 부모 클래스 이름에 final 키가 할당됨
// class Ccc extends Bbb {
	
}

public class Final_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
