package Class06;

public class Calculator2 {

	
	//�ʵ� -- ����
	//������ -- ����(�⺻������)
	//�޼ҵ�
	  // ������ ���� �޼ҵ� ����
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	// �� �Ű������� ���ϴ� �޼ҵ�
	int plus(int x, int y){
		int result = x + y;
		return result;
	}
	
	//�� ������ ������ �޼ҵ�
	double divide(int x, int y){
		double result = (double) x / (double) y;
		return result;
	}
	
	void autoCalculator(int x, int y) {
		powerOn();
		int rs = plus(x, y);
		double rs2 = divide(x, y);
		System.out.println(x +"+"+ y + "=" + rs);
		System.out.println(x +"/"+ y + "=" + rs2);
		powerOff();
	}
	
	
	
	
	
	
	
}