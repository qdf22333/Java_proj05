package chapter10.ex09;

class Car {
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;
	
	
	Car () {}
	public void Car (String carName, String carColor, int maxSpeed, String carModel) {
	
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
		}
			
	
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
	
	
	
	
	
	
	//getter, setter
	
	
	
	
}


public class EX01 {

	public static void main(String[] args) {
		// 1. 기본 생성자, 인풋을 받는 생성자.
		//2. getter, setter 생성
		//3. toString () 재정의 : 전체 메모리 내용 출력
		//4. 생성자를 통해서 값을 할당 후 메모리의 전체 내용 출력 
		//5. setter를 사용해서 필드의 값을 할당. 메모리 전체 내용을 출력.
			//getter를 사용해서 각 필드의 내용을 출력
		
		
		
		Car c1 = new Car();
		
		c1.setCarName("세종대왕");
		c1.setCarColor("노랑색");
		c1.setMaxSpeed(50);
		c1.setCarModel("벤츠");
		
		
		
		System.out.println(c1);
		
		
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarColor());
		System.out.println(c1.getMaxSpeed());
		System.out.println(c1.getCarModel());

	}

}
