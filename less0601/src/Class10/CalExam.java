package Class10;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ��� : Ŭ������ �ҼӵǾ� �����ʱ⶧���� ��𼭵� ������� ��밡��
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println("�������� 10�� ���� �������� " + result1 +"�Դϴ�.");
		
		int result2 = Calculator.puls(10, 5);
		System.out.println("10 + 5 = "+result2);
		
		int result3 = Calculator.minus(10, 5);
		System.out.println("10 - 5 = "+result3);
		//------------------------------------------------
		
		//�ν��Ͻ� ��� : Ŭ������ �Ҽӵ� ����̱⶧���� ������ ������ ������Ѵ�.
		Calculator cal = new Calculator();
		int result4 = cal.multiply(10,5);
		System.out.println("10 * 5 = "+result4);
        //------------------------------------------------

	}

}
