package chapter02.ex04;

public class PrimaryDataType1 {

	public static void main(String[] args) {
		//자료형 : 변수형 앞에 반드시 선언, 변수에 어떤 값을 지정( Java, c , c++)
		// - 기본 자료형 :(외워야함) boolean, byte, short, int, log, float, double, char
			// 메모리의 Stack 공간에 저장, (변수명:값)
		// - 참조 자료형 : String , 배열, 객체 ....무한대로 생성가능
			// 메모리의 Heap 공간에 변수의 값이 저장
			//		stack 공간에는 변수명:Heap의 값의 주소값을 가지고 있음
		//리터럴 : 변수에 할당되는 값을 통칭해서 리터럴
		
		
		// 1. boolean : true, false
		boolean bool1 = true;	//선언과 동시에 변수에 값을 할당
		boolean bool2;		//선언 후 
		bool2 = false ;		//값 할당
		System.out.println(bool1);		//true
		System.out.println(bool2);		//false
		
		System.out.println("=====================");
		
		// 2. 정수 (byte : 1byte, short : 2byte, int : 4byte, long : 8byte)
			//정수의 기본은 int
			//byte : (1byte=8bit) -2^7 ~ 2^7-1 : - 128 ~ 127
		byte value1 = -128;
		byte value2 = 127;
		
		System.out.println(value1);
		System.out.println(value2);
		
			//short : (2byte = 16bit) : -2^15 ~ 2^15-1 : -32,768 ~ 32,767
		
		short value3 = -32768;
		short value4 = 32767;
		
		System.out.println(value3);
		System.out.println(value4);
		
			//int : (4byte = 32bit) : -2^31 ~ 2^31-1 : -2,147,483,648 ~ 2,147,483,647
		
		int value5 = -2147483648;
		int value6 = 2147483647;
		
		System.out.println(value5);
		System.out.println(value6);
		
			//long : 8byte = 64bit : -2^63 ~ 2^63-1
				//long의 변수에 값을 할당할 때에는 l, L을 붙여줘야한다.
				//	붙여주지 않으면 기본적으로 int 형으로 값이 저장됨
		
		long value7 = -100L;
		System.out.println(value7);
		
		
		
				
		// 3. 실수 (float : 정밀도 7자리까지(4byte), double : 정밀도 15자리 (8byte))
			//실수의 기본은 double
		
			//float : float으로 지정된 변수의 값을 할당할 때 리터럴에 f, F 명시를 해야한다.
		float value8 = 1.123456789f ;
		System.out.println(value8);	//1.12345678
		
		double value9 = 1.12345678910111213;
		System.out.println(value9);	//1.1234567891011122
	
		
		
		
		// 4. 문자 (char) : 영문/한글/일본어... , 숫자, 특수문자 등... 한 글자만 넣을 수 있음
		//		변수의 값을 할당할 리터럴에 ' '
			//1. char 자료형 변수에 직접 문자로 저장하는 방법
		char value10 = 'A';
		char value11 = '가';
		char value12 = '3';
		char value13 = '#';
		
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
				
			//2. 정수값으로 문자를 저장하는 방법 : ASCII 코드 값으로 문자를 저장
		
		char value15 = 65;		//A
		char value16 = 0xac00;	// 0x : 16진수, 0 : 8진수, 0b : 2진수
				//가
		char value17 = 51 ;		//3
		
		System.out.println(value15);
		System.out.println(value16);
		System.out.println(value17);
		
		System.out.println("==================");
		
			//3. 유니코드로 저장하는 방법 : 전 세계의 글자를 3byte로 저장 (16진수)
		char value18 = '\u0041' ;	//A
		char value19 = '\uac00' ;	//가
		char value20 = '\u0033' ;	//3
		
		System.out.println(value18);
		System.out.println(value19);
		System.out.println(value20);
		
		
		
		/*
		 * <문제> 구글을 검색해서 자신의 이름의 유니코드를 찾아서 변수에 할당하고		 * 
		 */
		
		char aa = '\ubc15' ;	//성
		char bb = '\uc608' ;	//이름1
		char cc = '\ub9bc' ;	//이름2
		
		System.out.print(aa);
		System.out.print(bb);
		System.out.print(cc);
		
		//박예림
		
		
		// 5. 문자열 (String) : 여러 글자를 담을 수 있음
			//기본자료형이 아니다. 참조 자료형 (객체)
		//		변수의 값을 할당할 리터럴에 " "
		
		String value21 = "안녕하세요. 오늘의 날씨는 매우 맑습니다.";
		
		System.out.println(value21);
		
		
		
		String value14 = "안녕하세요";
		
		System.out.println(value14);
			
			
		
		
		
	}

}
