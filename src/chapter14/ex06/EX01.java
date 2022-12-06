package chapter14.ex06;

//1. 예외 발생할 때 각 메소드 내부에서 예외를 직접 처리함
class C {
	void abc() {	//bcd() 메소드 호출
		bcd();				//bcd () 메소드 호출
	}
	void bcd() {	//메소드 블락에서 직접 예외 처리
		try {	
			System.out.println(3/0);
			int [] arr = new int [] {1,2,3};
			System.out.println(arr[5]);
			Thread.sleep(1000);
			
		}catch (Exception e) {
	
		}
		
}
}
//2. 예외 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class D {
	void abc() {
		//bcd() 메소드 호출 : <예외 처리>
		
		try {
			bcd();
	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	void bcd() throws Exception {	//예외를 미루는 것  : throws
		System.out.println(3/0);
		int [] arr = new int [] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
	}
}

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
