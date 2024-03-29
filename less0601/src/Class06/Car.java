package Class06;

public class Car {

	
	/*
	 * 매가값으로 객체의 필드를 다양하게 초기화 하는 것 - 오버로딩 overloading
	 * 매개변수를 달리하는 생성자를 여러게 생성하는 것을 '생성자오버로딩'이라 한다. 
	 * 매개변수의 갯수가 같을때는 타입이 달라야 하고 아니면 매개변수의 개수가 달라야한다.
	 */
	
	
	//필드
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자  
	Car(){}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
