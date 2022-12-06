package chapter08.ex01;

class A {	//다른 패키지에서 접근할 수 없음, 같은 패키지 내에서만 접근가능
			//다른 패키지에서 접근이 가능하도록 하려면 별도의 파일로 클래스를 생성 후 public 키 넣어줘야함
	
	public int a;
	public int b;
	
	public A(){
		this.a = 1;
		b = 2;
	}
	public void print() {
		System.out.println(a + " " + b);
	}
	
	
	
}


public class ExternalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
