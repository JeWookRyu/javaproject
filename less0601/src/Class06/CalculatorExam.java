package Class06;

public class CalculatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int r1 = myCalc.add(5, 8);
		System.out.println("���� ���: "+ r1);
		
		int x = 10, y = 30;
		double r2 = myCalc.divide(x, y);
		System.out.println("���������: "+r2);
		
		
		myCalc.powerOff();
	}

}
