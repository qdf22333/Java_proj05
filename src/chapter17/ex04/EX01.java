package chapter17.ex04;

import java.util.ArrayList;

//car 객체를 3개정도 생성 후 ArrayList 에 저장 후 객체를 출력시 필드의 값을 출력하도록 함.
// for, enhanced for, 컬렉션 객체 자체를 출력시 

class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	
	Car(String company, String carModel, String color, int maxSpeed){
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	
	}


	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
		
	
	
}

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Car> a1 = new ArrayList();
		Car c1 = new Car("벤츠", "지바겐", "흰색", 5000);
		Car c2 = new Car("제규어", "F Type", "검은색", 10000);
		Car c3 = new Car("쉐보레", "스파크", "노랑색", 1000);
		
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);

		System.out.println("===============for 문으로 출력=================");
		for (int i = 0; i<a1.size(); i++) {
			Car cc1 = a1.get(i);
			System.out.println(cc1);
		}	
		System.out.println();
		System.out.println("===============Enhanced For 문으로 출력===============");
		//Enhanced For
		for (Car k : a1) {
			System.out.println(k);
		}	
		System.out.println();
		System.out.println("=================컬렉션 객체 자체 출력====================");
		System.out.println(a1);
		
		
			
			
		}	
		
	}


