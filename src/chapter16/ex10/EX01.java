package chapter16.ex10;

//제너릭 클래스 / 제너릭 메소드를 사용해서 두 점의 좌표값으로 넓이를 구하는 프로그램 작성

//점의 좌표를 처리하는 클래스 생성. <제너릭 클래스>
class Point <X , Y>{
	X x;
	Y y;
	
	//생성자를 사용해서 t, v의 값을 입력,
	Point (){}		//기본 생성자
	Point (X x, Y y){	//x: x 좌표, y : y 좌표
		this.x = x;
		this.y = y;		
	}
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
	
	//getter만 생성
	
	
}

//제너릭 메소드 : 일반 클래스 내에 제너릭 메소드
class GenericMethod {
	
	//makeRectangle () 메소드를 호출시 
	public static <T, V> double makeRectangle (Point<T,V> p1, Point<T,V> p2) {
		//두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌
		
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		
		//넓이를 리턴 해주면됨.
		return width * height;
				
				
				
	}
	
}


public class EX01 {

	public static void main(String[] args) {
		// 두 점의 좌표를 저장하는 p1, p2
		
		// makeRectangle(p1, p2)	<== 두 점의 값을 받아서 넓이를 처리해서 리턴으로 받아옴
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0); 
		Point<Integer, Double> p2 = new Point<>(15,10.0);
		
		double rect = GenericMethod.makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 넓이는 " + rect + " 입니다.");
		
		
		

	}

}
