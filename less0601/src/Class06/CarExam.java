package Class06;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ �����ε�  
	
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println("=====================");
		
		Car c2 = new Car("�ڰ���");
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		System.out.println("=====================");
		
		Car c3 = new Car("�ڰ���", "����");
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		System.out.println("=====================");

		Car c4 = new Car("�ڰ���", "����", 300);
		System.out.println(c4.company);
		System.out.println(c4.model);
		System.out.println(c4.color);
		System.out.println(c4.maxSpeed);
		System.out.println("=====================");
		
	}

}
