package chapter02.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		
		//1. 같은 자료형 간의 연산
		int value1 = 3+5 ;	//8
		int value2 = 8/5 ;	//1		int/int = int
		
		System.out.println(value1);
		System.out.println(value2);

		
		float data1 = 3.0f + 5.0f ;	//8.0
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0 ;	//1.6
		System.out.println(data2);
		
		double data3 = 8 / 5 ;	//1.0
		System.out.println(data3);	//int/int = int (1) 

		
		double data4 = 8 /5.0 ;	//1.6 
		System.out.println(data4);	//정수 8이 double형으로 업캐스팅 일어나서 연산
		
		//주의 : 평균을 계산할 때 double
		
		System.out.println("=======================");
		
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		// int data5 = 5 + 3.5 ;	//오류 발생
		double data6 = 5 + 3.5 ;	// 5.0 + 3.5
		
		int data7 = 5 + (int) 3.5 ;	//8	
		
		int data8 = (int) (5 + 3.5) ;	//8
		
		double data9 = 5/2.0 ;	//정수 5가 double 형으로 업캐스팅 되어 연산
		
		System.out.println(data9);		//2.5 	
		
		double data10 = 5/2 ;	//2.0
		
		System.out.println(data10);
		
		System.out.println("========================");
		
		int data11 = 50;
		double data12 = 33.33 ;
		
		
		//업캐스팅 : data11 (int) => data11 (double)
		System.out.println(data11 + data12);	//50=>double
		//업캐스팅 : data11 (int) => data11 (double)
		System.out.println(data11 / data12); 
		//다운캐스팅 : data12 (double) => data12 (int)
		System.out.println(data11 / (int)data12 );
		
		
		// <문제>
		// 국어 : 90, 수학 : 88, 영어 : 77, 음악 : 90, 과학 : 99
		// 각 과목의 점수를 int의 변수를 만들어서 저장 후 : 합계(sum), 평균(avg) 값을 출력
		
		int a = 90;
		int b = 88;
		int c = 77;
		int d = 90;
		int e = 99;
	
		int sum = a+b+c+d+e ;
		double avg = (a+b+c+d+e)/5.0;
		
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + avg);
		
		
		
		
		
		

		
	}

}
