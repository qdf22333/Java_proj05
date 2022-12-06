package chapter14.ex06;


class S{
	void abc () {
		bcd();
	}
	void bcd () {
	
		try {
			System.out.println(3/0);
			int [] arr = new int [] {1,2,3};
			System.out.println(arr[5]);
			Thread.sleep(1000);
		}catch (Exception e) {
		
		
	}


}

}
class P {
	void abc () {
	try {
		bcd();
	}catch (Exception e) {
		
	}
		
	}
	void bcd () throws Exception {
		
		System.out.println(3/0);
		int [] arr = new int [] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
		
	}

}

public class yeahh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


