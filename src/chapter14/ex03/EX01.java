package chapter14.ex03;

public class EX01 {

	public static void main(String[] args) {
		// 3개의 예외를 하나의 try ~ catch 블락에 넣고, 
				//각각에 대해서 catch 블락 
				//3개의 예외를 한꺼번에 처리
		
		
		try {
			System.out.println(3/0);		//실행 예외: Ari
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);		//실행예외 : Array
			
			int num = Integer.parseInt("20A");
		}catch (ArithmeticException e) {
			System.out.println("숫자 0으로 나눌 수 없습니다.");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 방 번호를 넘겼습니다.");
			
		}catch (NumberFormatException e){
			System.out.println("숫자 변경이 불가능 합니다.");
			
		}finally {
			System.out.println("프로그램 종료");
		}
		
		System.out.println("========================");
		
		
		
		
		
		
//		System.out.println(e.getMessage());		//예외의 간단한 정보를 출력
//		e.printStackTrace();					//예외의 세부적인 정보를 출력
		
		
		
		
		
				
		

	}

}
