package Class06;

public class Car {

	
	/*
	 * �Ű������� ��ü�� �ʵ带 �پ��ϰ� �ʱ�ȭ �ϴ� �� - �����ε� overloading
	 * �Ű������� �޸��ϴ� �����ڸ� ������ �����ϴ� ���� '�����ڿ����ε�'�̶� �Ѵ�. 
	 * �Ű������� ������ �������� Ÿ���� �޶�� �ϰ� �ƴϸ� �Ű������� ������ �޶���Ѵ�.
	 */
	
	
	//�ʵ�
	
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������  
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
